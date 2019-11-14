package it.csi.fpabil.fpabilbl.business.adapter.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

import it.csi.common.vo.SelItem;
import it.csi.fpabil.fpabilbl.business.adapter.StatoEsteroDtoAdapter;
import it.csi.fpabil.fpabilbl.business.dto.StatoEsteroDto;
import it.csi.fpabil.fpabilbl.util.adapter.AbstractDtoAdapter;
import it.csi.fpabil.fpabilbl.util.adapter.exception.DtoConversionException;


@Component
public class StatoEsteroDtoAdapterImpl extends AbstractDtoAdapter<SelItem, StatoEsteroDto> implements StatoEsteroDtoAdapter {

	
	/**
	 * 
	 */
	private static final long serialVersionUID = 325401254603150557L;
	@Autowired
	private ApplicationContext applicationContext;
	
	@Override
	public ApplicationContext getApplicationContext() {
		return applicationContext;
	}

	public StatoEsteroDtoAdapterImpl() throws DtoConversionException {
		super();
		
	}

	
	

	

	

}
