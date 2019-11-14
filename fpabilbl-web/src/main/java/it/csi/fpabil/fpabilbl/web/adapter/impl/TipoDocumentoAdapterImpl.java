package it.csi.fpabil.fpabilbl.web.adapter.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Service;

import it.csi.fpabil.fpabilbl.business.dto.TipoDocumentoDto;
import it.csi.fpabil.fpabilbl.util.adapter.AbstractDtoAdapter;
import it.csi.fpabil.fpabilbl.util.adapter.exception.DtoConversionException;
import it.csi.fpabil.fpabilbl.web.adapter.TipoDocumentoAdapter;
import it.csi.fpabil.fpabilbl.web.rest.dto.TipoDocumento;


@Service
public class TipoDocumentoAdapterImpl extends AbstractDtoAdapter<TipoDocumento, TipoDocumentoDto> implements TipoDocumentoAdapter {

	@Autowired
	private ApplicationContext applicationContext;
	
	@Override
	public ApplicationContext getApplicationContext() {
		return applicationContext;
	}

	public TipoDocumentoAdapterImpl() throws DtoConversionException {
		super();
		
	}

	/**
	 * 
	 */
	private static final long serialVersionUID = 2496302119657112488L;

	

	

	

}
