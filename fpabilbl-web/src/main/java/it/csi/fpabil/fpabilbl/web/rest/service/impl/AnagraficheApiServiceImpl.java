package it.csi.fpabil.fpabilbl.web.rest.service.impl;

import java.util.List;

import javax.ws.rs.core.HttpHeaders;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import it.csi.fpabil.fpabilbl.business.dto.ProvinciaDto;
import it.csi.fpabil.fpabilbl.business.exception.HelperException;
import it.csi.fpabil.fpabilbl.business.exception.UnauthorizedHelperException;
import it.csi.fpabil.fpabilbl.business.helper.AnagraficheHelper;
import it.csi.fpabil.fpabilbl.util.Constants;
import it.csi.fpabil.fpabilbl.util.Tracer;
import it.csi.fpabil.fpabilbl.util.adapter.exception.DtoConversionException;
import it.csi.fpabil.fpabilbl.web.adapter.ComuneAdapter;
import it.csi.fpabil.fpabilbl.web.adapter.ProvinciaAdapter;
import it.csi.fpabil.fpabilbl.web.adapter.StatoAdapter;
import it.csi.fpabil.fpabilbl.web.adapter.TipoDocumentoAdapter;
import it.csi.fpabil.fpabilbl.web.rest.dto.Comune;
import it.csi.fpabil.fpabilbl.web.rest.dto.ComuneArray;
import it.csi.fpabil.fpabilbl.web.rest.dto.Provincia;
import it.csi.fpabil.fpabilbl.web.rest.dto.ProvinciaArray;
import it.csi.fpabil.fpabilbl.web.rest.dto.StatoArray;
import it.csi.fpabil.fpabilbl.web.rest.dto.TipoDocumentoArray;
import it.csi.fpabil.fpabilbl.web.rest.service.AnagraficheApi;

@Component("anagraficheApi")
public class AnagraficheApiServiceImpl implements AnagraficheApi {

	protected final static Logger LOG = LoggerFactory.getLogger(Constants.APPLICATION_CODE  + ".api");

	@Autowired
	private AnagraficheHelper anagraficheHelper;

	@Autowired
	private ProvinciaAdapter provinciaAdapter;
	
	@Autowired
	private ComuneAdapter comuneAdapter;
	
	@Autowired
	private StatoAdapter statoAdapter;
	
	@Autowired
	private TipoDocumentoAdapter tipoDocumentoAdapter;

	public Response getProvince(SecurityContext securityContext, HttpHeaders httpHeaders ) {
		final String method = "getProvince";
		try {

			List<ProvinciaDto> elencoProvince = anagraficheHelper.getProvince();
			List<Provincia> convertList = provinciaAdapter.convertFrom(elencoProvince);

			ProvinciaArray response = new ProvinciaArray();
			response.addAll(convertList);

			if(1==11) {
				throw new UnauthorizedHelperException("NON SEI AUTORIZZATO");
			}


			return Response.ok().entity(response).build();


		} catch (DtoConversionException e) {
			Tracer.error(LOG, getClass().getName(), method, "DtoConversionException " + e);
			throw new HelperException("Impossibile convertire le province");
		}





	}

	@Override
	public Response getComuni(SecurityContext securityContext, HttpHeaders httpHeaders) {
		final String method = "getComuni";
		try {


			Comune c1 = new Comune();
			c1.setCodice("AAAA");
			c1.setDescrizione("Comune di AAA");


			//c1.setSiglaProvincia("001");



			ComuneArray response = new ComuneArray();
			response.add(c1);

			if(1==11) {
				throw new UnauthorizedHelperException("NON SEI AUTORIZZATO");
			}


			return Response.ok().entity(response).build();


		} finally {

		}
	}

	@Override
	public Response getComuniByProvincia(String codprovincia, SecurityContext securityContext, HttpHeaders httpHeaders) {
		final String method = "getComuniByProvincia";

		Tracer.debug(LOG, getClass().getName(), method, "codprovincia= " + codprovincia);
		if(StringUtils.isBlank(codprovincia))
			throw new HelperException("cod provincia is null");

		ComuneArray response = new ComuneArray();

		try {
			response.addAll(comuneAdapter.convertFrom(anagraficheHelper.getComuniByProvincia(codprovincia)));
			return Response.ok().entity(response).build();

		} catch (DtoConversionException e) {
			Tracer.error(LOG, getClass().getName(), method, "DtoConversionException " + e);
			throw new HelperException("Impossibile convertire le province");
		}


	}

	@Override
	public Response getTipiDocumento(SecurityContext securityContext, HttpHeaders httpHeaders) {
		final String method = "getTipiDocumento";
		TipoDocumentoArray response = new TipoDocumentoArray();
		try {
			response.addAll(tipoDocumentoAdapter.convertFrom(anagraficheHelper.getTipiDocumento()));
			return Response.ok().entity(response).build();
		} catch (DtoConversionException e) {
			Tracer.error(LOG, getClass().getName(), method, "DtoConversionException " + e);
			throw new HelperException("Impossibile convertire le province");
		}
	}

	@Override
	public Response getStatiEsteri(SecurityContext securityContext, HttpHeaders httpHeaders) {
		final String method = "getStatiEsteri";
		StatoArray response = new StatoArray();
		try {
			response.addAll(statoAdapter.convertFrom(anagraficheHelper.getStatiEsteri()));
			return Response.ok().entity(response).build();
		} catch (DtoConversionException e) {
			Tracer.error(LOG, getClass().getName(), method, "DtoConversionException " + e);
			throw new HelperException("Impossibile convertire le province");
		}
	}
}
