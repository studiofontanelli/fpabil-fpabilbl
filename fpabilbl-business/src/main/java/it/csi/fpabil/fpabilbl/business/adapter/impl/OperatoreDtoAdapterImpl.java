package it.csi.fpabil.fpabilbl.business.adapter.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

import it.csi.fpabil.fpabilbl.business.adapter.OperatoreDtoAdapter;
import it.csi.fpabil.fpabilbl.business.dto.OperatoreDto;
import it.csi.fpabil.fpabilbl.util.adapter.AbstractDtoAdapter;
import it.csi.fpabil.fpabilbl.util.adapter.exception.DtoConversionException;
import it.csi.operatore.vo.Operatore;


@Component
public class OperatoreDtoAdapterImpl extends AbstractDtoAdapter<Operatore, OperatoreDto> implements OperatoreDtoAdapter {

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

	public OperatoreDtoAdapterImpl() throws DtoConversionException {
		super();
		
	}

	
	

	

	

}
