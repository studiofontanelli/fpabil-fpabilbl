package it.csi.fpabil.fpabilbl.business.adapter.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

import it.csi.fpabil.fpabilbl.business.adapter.RichiestaOperatoreDtoAdapter;
import it.csi.fpabil.fpabilbl.business.dto.RichiestaOperatoreDto;
import it.csi.fpabil.fpabilbl.integration.dto.DbIrideRichiestaOperatore;
import it.csi.fpabil.fpabilbl.util.adapter.AbstractDtoAdapter;
import it.csi.fpabil.fpabilbl.util.adapter.exception.DtoConversionException;


@Component
public class RichiestaOperatoreDtoAdapterImpl extends AbstractDtoAdapter<DbIrideRichiestaOperatore, RichiestaOperatoreDto> implements RichiestaOperatoreDtoAdapter {

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

	public RichiestaOperatoreDtoAdapterImpl() throws DtoConversionException {
		super();
		
	}

	
	

	

	

}
