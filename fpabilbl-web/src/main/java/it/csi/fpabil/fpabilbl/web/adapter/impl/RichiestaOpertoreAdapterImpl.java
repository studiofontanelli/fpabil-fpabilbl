package it.csi.fpabil.fpabilbl.web.adapter.impl;

import org.apache.commons.lang3.RandomStringUtils;
import org.apache.commons.lang3.StringUtils;
import org.joda.time.DateTime;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Service;

import it.csi.fpabil.fpabilbl.business.dto.OperatoreDto;
import it.csi.fpabil.fpabilbl.business.dto.RichiestaOperatoreDto;
import it.csi.fpabil.fpabilbl.business.exception.HelperException;
import it.csi.fpabil.fpabilbl.business.helper.AnagraficheHelper;
import it.csi.fpabil.fpabilbl.business.helper.FpabilHelper;
import it.csi.fpabil.fpabilbl.util.adapter.AbstractDtoAdapter;
import it.csi.fpabil.fpabilbl.util.adapter.exception.DtoConversionException;
import it.csi.fpabil.fpabilbl.web.adapter.RichiestaOperatoreAdapter;
import it.csi.fpabil.fpabilbl.web.rest.dto.SalvaRichiestaRequest;


@Service
public class RichiestaOpertoreAdapterImpl extends AbstractDtoAdapter<RichiestaOperatoreDto, SalvaRichiestaRequest> implements RichiestaOperatoreAdapter {

	@Autowired
	private ApplicationContext applicationContext;

	@Override
	public ApplicationContext getApplicationContext() {
		return applicationContext;
	}
	@Autowired
	private AnagraficheHelper anagraficheHelper;

	public RichiestaOpertoreAdapterImpl() throws DtoConversionException {
		super();

	}

	/**
	 * 
	 */
	private static final long serialVersionUID = 2496302119657112488L;

	@Override
	public RichiestaOperatoreDto convertFrom(SalvaRichiestaRequest v) throws DtoConversionException {

		try {
			if(v.getOperatore() == null) {
				throw new DtoConversionException("Operatore non valorizzato");
			}
			if(v.getRichiedente() == null) {
				throw new DtoConversionException("Richiedente non valorizzato");
			}
			if(v.getElencoPersone() == null) {
				throw new DtoConversionException("Nessuna persona da abilitare/disabilitare");
			}
			if(v.getElencoPersone() == null || v.getElencoPersone().size() == 0) {
				throw new DtoConversionException("Nessuna persona da abilitare/disabilitare");
			}


			if(v.getOperatore().getCodice() == null) {
				throw new DtoConversionException("Codice Operatore non valorizzato");
			}
			if(v.getOperatore().getGruppo() == null) {
				throw new DtoConversionException("Gruppo Operatore non valorizzato");
			}


			OperatoreDto operatoreDto = anagraficheHelper.getOperatore(v.getOperatore().getGruppo(), v.getOperatore().getCodice());
			if(operatoreDto == null) {
				throw new DtoConversionException("Operatore non censito");
			}

			DateTime currentDate = new DateTime();


			RichiestaOperatoreDto dto =  super.convertFrom(v);

			// STATO DA ESAMINARE
			dto.setIdStatoRichiestaOperatore(FpabilHelper.STATO_RICHIESTA_DA_ESAMINARE);
			dto.setDataRichiesta(currentDate.toDate());

			// OPERATORE
			dto.setOpCodFiscale(v.getOperatore().getCodiceFiscale());
			dto.setOpPartitaIva(v.getOperatore().getPartitaIva());
			dto.setOpSedeTelefono1(v.getOperatore().getTelefono());
			
			// recupero i dati da servsifp
			dto.setOpCodice(new Integer(operatoreDto.getCodice()));
			dto.setOpIpAddress(operatoreDto.getIpAddress());
			dto.setOpDenominazione(operatoreDto.getDenominazione());
			
			
			
			
			
			
			
			// richiedente
			dto.setLrCognome(v.getRichiedente().getCognome());
			dto.setLrNome(v.getRichiedente().getNome());
			dto.setLrDataNascita(v.getRichiedente().getDataNascita());
			dto.setLrNumTelefono(v.getRichiedente().getTelefono());
			dto.setLrEmail(v.getRichiedente().getEmail());

			return dto;
		}
		catch(HelperException e) {
			throw new DtoConversionException("Impossibile recuperare l'operatore");
		}
	}







}
