package it.csi.fpabil.fpabilbl.business.helper.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import it.csi.fpabil.fpabilbl.business.dto.ProvinciaDto;
import it.csi.fpabil.fpabilbl.business.exception.HelperException;
import it.csi.fpabil.fpabilbl.business.helper.AnagraficheHelper;
import it.csi.fpabil.fpabilbl.util.Tracer;



@Service("anagraficheHelper")
public class AnagraficheHelperImpl extends CommonHelperImpl implements AnagraficheHelper{

	


	@Override
	@Cacheable("cache-anagrafiche-fpabilbl-fpabil")
	public List<ProvinciaDto> getProvince() throws HelperException {
		final String method = "getProvince";
		List<ProvinciaDto> result = new ArrayList<ProvinciaDto>();
		
		ProvinciaDto dto = new ProvinciaDto();
		
		dto.setCodice("001");
		dto.setDescrizione("TORINO");
		dto.setSigla("To");
		
		result.add(dto);
		
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





}
