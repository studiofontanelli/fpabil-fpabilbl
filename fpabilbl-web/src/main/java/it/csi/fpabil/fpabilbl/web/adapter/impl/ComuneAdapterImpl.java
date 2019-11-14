package it.csi.fpabil.fpabilbl.web.adapter.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

import it.csi.fpabil.fpabilbl.business.dto.ComuneDto;
import it.csi.fpabil.fpabilbl.util.adapter.AbstractDtoAdapter;
import it.csi.fpabil.fpabilbl.util.adapter.exception.DtoConversionException;
import it.csi.fpabil.fpabilbl.web.adapter.ComuneAdapter;
import it.csi.fpabil.fpabilbl.web.rest.dto.Comune;


@Component
public class ComuneAdapterImpl extends AbstractDtoAdapter<Comune, ComuneDto> implements ComuneAdapter {

	/**
	 * 
	 */
	private static final long serialVersionUID = -2342761825591562475L;
	@Autowired
	private ApplicationContext applicationContext;
	
	@Override
	public ApplicationContext getApplicationContext() {
		return applicationContext;
	}

	public ComuneAdapterImpl() throws DtoConversionException {
		super();
		
	}

	

	

	

	

}
