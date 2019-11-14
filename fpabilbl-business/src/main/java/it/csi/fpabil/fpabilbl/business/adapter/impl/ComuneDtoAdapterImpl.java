package it.csi.fpabil.fpabilbl.business.adapter.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

import it.csi.common.vo.SelItem;
import it.csi.fpabil.fpabilbl.business.adapter.ComuneDtoAdapter;
import it.csi.fpabil.fpabilbl.business.dto.ComuneDto;
import it.csi.fpabil.fpabilbl.util.adapter.AbstractDtoAdapter;
import it.csi.fpabil.fpabilbl.util.adapter.exception.DtoConversionException;


@Component
public class ComuneDtoAdapterImpl extends AbstractDtoAdapter<SelItem, ComuneDto> implements ComuneDtoAdapter {

	/**
	 * 
	 */
	private static final long serialVersionUID = -4606732293254303376L;
	@Autowired
	private ApplicationContext applicationContext;
	
	@Override
	public ApplicationContext getApplicationContext() {
		return applicationContext;
	}

	public ComuneDtoAdapterImpl() throws DtoConversionException {
		super();
		
	}

	
	

	

	

}
