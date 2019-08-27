package it.csi.fpabil.fpabilbl.web.rest.service.impl;

import java.util.List;

import javax.ws.rs.core.HttpHeaders;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import it.csi.fpabil.fpabilbl.business.dto.ProvinciaDto;
import it.csi.fpabil.fpabilbl.business.exception.HelperException;
import it.csi.fpabil.fpabilbl.business.helper.AnagraficheHelper;
import it.csi.fpabil.fpabilbl.util.Constants;
import it.csi.fpabil.fpabilbl.util.Tracer;
import it.csi.fpabil.fpabilbl.util.adapter.exception.DtoConversionException;
import it.csi.fpabil.fpabilbl.web.adapter.ProvinciaAdapter;
import it.csi.fpabil.fpabilbl.web.rest.dto.Provincia;
import it.csi.fpabil.fpabilbl.web.rest.dto.ProvinciaArray;
import it.csi.fpabil.fpabilbl.web.rest.service.AnagraficheApi;

@Component("anagraficheApi")
public class AnagraficheApiServiceImpl implements AnagraficheApi {

	protected final static Logger LOG = LoggerFactory.getLogger(Constants.APPLICATION_CODE  + ".api");
	
	
	@Autowired
	private AnagraficheHelper anagraficheHelper;
	
	@Autowired
	private ProvinciaAdapter provinciaAdapter;

	public Response getProvince(SecurityContext securityContext, HttpHeaders httpHeaders ) {
		final String method = "getProvince";
		try {
			
			
			List<ProvinciaDto> elencoProvince = anagraficheHelper.getProvince();
			List<Provincia> convertList = provinciaAdapter.convertFrom(elencoProvince);
			
			ProvinciaArray response = new ProvinciaArray();
			response.addAll(convertList);
			
			
			return Response.ok().entity(response).build();
			
			
		} catch (DtoConversionException e) {
			Tracer.error(LOG, getClass().getName(), method, "DtoConversionException " + e);
			throw new HelperException("Impossibile convertire le province");
		}
		
		

	
		
	}
}
