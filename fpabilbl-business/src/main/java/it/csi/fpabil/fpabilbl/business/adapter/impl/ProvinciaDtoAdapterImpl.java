package it.csi.fpabil.fpabilbl.business.adapter.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

import it.csi.common.vo.SelItem;
import it.csi.fpabil.fpabilbl.business.adapter.ProvinciaDtoAdapter;
import it.csi.fpabil.fpabilbl.business.dto.ProvinciaDto;
import it.csi.fpabil.fpabilbl.util.adapter.AbstractDtoAdapter;
import it.csi.fpabil.fpabilbl.util.adapter.exception.DtoConversionException;


@Component
public class ProvinciaDtoAdapterImpl extends AbstractDtoAdapter<SelItem, ProvinciaDto> implements ProvinciaDtoAdapter {

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

	public ProvinciaDtoAdapterImpl() throws DtoConversionException {
		super();
		
	}

	
	

	

	

}
