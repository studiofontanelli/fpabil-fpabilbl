package it.csi.fpabil.fpabilbl.business.helper.impl;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import it.csi.common.vo.SelItem;
import it.csi.fpabil.fpabilbl.business.adapter.ComuneDtoAdapter;
import it.csi.fpabil.fpabilbl.business.adapter.OperatoreDtoAdapter;
import it.csi.fpabil.fpabilbl.business.adapter.ProvinciaDtoAdapter;
import it.csi.fpabil.fpabilbl.business.adapter.StatoEsteroDtoAdapter;
import it.csi.fpabil.fpabilbl.business.adapter.TipoDocumentoDtoAdapter;
import it.csi.fpabil.fpabilbl.business.dto.ComuneDto;
import it.csi.fpabil.fpabilbl.business.dto.OperatoreDto;
import it.csi.fpabil.fpabilbl.business.dto.ProvinciaDto;
import it.csi.fpabil.fpabilbl.business.dto.StatoEsteroDto;
import it.csi.fpabil.fpabilbl.business.dto.TipoDocumentoDto;
import it.csi.fpabil.fpabilbl.business.exception.HelperException;
import it.csi.fpabil.fpabilbl.business.helper.AnagraficheHelper;
import it.csi.fpabil.fpabilbl.integration.dto.TabDocIdentita;
import it.csi.fpabil.fpabilbl.integration.dto.TabDocIdentitaExample;
import it.csi.fpabil.fpabilbl.util.ListUtil;
import it.csi.fpabil.fpabilbl.util.Tracer;
import it.csi.fpabil.fpabilbl.util.XmlSerializer;
import it.csi.operatore.vo.Operatore;



@Service("anagraficheHelper")
public class AnagraficheHelperImpl extends CommonHelperImpl implements AnagraficheHelper{

	
	@Autowired
	private ProvinciaDtoAdapter provinciaDtoAdapter;
	@Autowired
	private ComuneDtoAdapter comuneDtoAdapter;
	@Autowired
	private StatoEsteroDtoAdapter statoEsteroDtoAdapter;
	@Autowired
	private OperatoreDtoAdapter operatoreDtoAdapter;
	@Autowired
	private TipoDocumentoDtoAdapter tipoDocumentoDtoAdapter;
	
	@Override
	@Cacheable("cache-anagrafiche-fpabilbl-fpabil")
	public List<ProvinciaDto> getProvince() throws HelperException {
		final String method = "getProvince";
		List<ProvinciaDto> result = new ArrayList<ProvinciaDto>();

		try {

			SelItem[] elencoProvince = getServSifpAnagraficaFPIntegration().getListaProvinceItalia();
			result = provinciaDtoAdapter.convertTo(ListUtil.asList(elencoProvince));

			/*
			ProvinciaDto dto = new ProvinciaDto();

			dto.setCodice("001");
			dto.setDescrizione("TORINO");
			dto.setSigla("To");

			result.add(dto);
			*/
		}
		catch(Exception e) {
			Tracer.error(LOG, getClass().getName(), method, "IntegrationException " +e);
			throw new HelperException("Errore in fase di recupero province", e);
		}

		/*
		try {
			Thread.sleep(10000);

			Tracer.info(LOG, getClass().getName(), method, "wake up");
		} catch (InterruptedException e) {
			throw new HelperException("sleep error");
		}
		 */

		return result;
	}


	@Override
	public List<ComuneDto> getComuniByProvincia(String codiceProvincia) throws HelperException {
		final String method = "getComuniByProvincia";
		List<ComuneDto> result = new ArrayList<ComuneDto>();

		try {
			if(StringUtils.isBlank(codiceProvincia)) {
				throw new HelperException("Codice provincia non valorizzato");
			}
			SelItem[] elencoComuni = getServSifpAnagraficaFPIntegration().getListaComuniPerProv(codiceProvincia);
			result = comuneDtoAdapter.convertTo(ListUtil.asList(elencoComuni));

			
		}
		catch(Exception e) {
			Tracer.error(LOG, getClass().getName(), method, "IntegrationException " +e);
			throw new HelperException("Errore in fase di recupero comuni", e);
		}

		return result;
	}


	@Override
	public List<StatoEsteroDto> getStatiEsteri() throws HelperException {
		final String method = "getStatiEsteri";
		List<StatoEsteroDto> result = new ArrayList<StatoEsteroDto>();
		try {
			SelItem[] elenco = getServSifpAnagraficaFPIntegration().getListaStatiEsteri();
			result = statoEsteroDtoAdapter.convertTo(ListUtil.asList(elenco));
		}
		catch(Exception e) {
			Tracer.error(LOG, getClass().getName(), method, "IntegrationException " +e);
			throw new HelperException("Errore in fase di recupero stati esteri", e);
		}
		return result;
	}

	@Override
	public OperatoreDto getOperatore(String gruppoOperatore, String codiceOperatore) throws HelperException {
		final String method = "getOperatore";
		OperatoreDto result = null;
		try {
			if(StringUtils.isBlank(gruppoOperatore))
				throw new HelperException("gruppo operatore is null");
			if(StringUtils.isBlank(codiceOperatore))
				throw new HelperException("codice operatore is null");
			int co = Integer.parseInt(codiceOperatore);
			
			result = operatoreDtoAdapter.convertTo( getServsifpOperatoreFPIntegration().getOperatoreDaGruppoCodice(gruppoOperatore, co));
			
		}
		catch(Exception e) {
			Tracer.error(LOG, getClass().getName(), method, "IntegrationException " +e);
			throw new HelperException("Errore in fase di recupero operatore", e);
		}
		return result;
	}


	@Override
	public List<TipoDocumentoDto> getTipiDocumento() throws HelperException {
		final String method = "getTipiDocumento";
		List<TipoDocumentoDto> result = new ArrayList<TipoDocumentoDto>();
		try {
			TabDocIdentitaExample example = new TabDocIdentitaExample();
			List<TabDocIdentita> tabDocIdentitaList = getTabDocIdentitaMapper().selectByExample(example);
			result = tipoDocumentoDtoAdapter.convertTo(tabDocIdentitaList);
		}
		catch(Exception e) {
			Tracer.error(LOG, getClass().getName(), method, "IntegrationException " +e);
			throw new HelperException("Errore in fase di recupero tipi documento", e);
		}
		return result;
	}





}
