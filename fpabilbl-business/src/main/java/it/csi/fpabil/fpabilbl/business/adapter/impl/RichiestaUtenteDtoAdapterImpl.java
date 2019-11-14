package it.csi.fpabil.fpabilbl.business.adapter.impl;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

import it.csi.fpabil.fpabilbl.business.adapter.RichiestaUtenteDtoAdapter;
import it.csi.fpabil.fpabilbl.business.dto.RichiestaUtenteDto;
import it.csi.fpabil.fpabilbl.integration.dto.DbIrideRichiestaUtente;
import it.csi.fpabil.fpabilbl.util.adapter.AbstractDtoAdapter;
import it.csi.fpabil.fpabilbl.util.adapter.exception.DtoConversionException;


@Component
public class RichiestaUtenteDtoAdapterImpl extends AbstractDtoAdapter<DbIrideRichiestaUtente, RichiestaUtenteDto> implements RichiestaUtenteDtoAdapter {

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

	public RichiestaUtenteDtoAdapterImpl() throws DtoConversionException {
		super();
		
	}

	@Override
	public RichiestaUtenteDto convertTo(DbIrideRichiestaUtente t) throws DtoConversionException {
		RichiestaUtenteDto dto =  super.convertTo(t);
		dto.setFlagCertificato( StringUtils.equalsIgnoreCase("S", t.getFlagCertificato()) ? true : false );
		dto.setFlagAbilitazione(StringUtils.equalsIgnoreCase("S", t.getFlagAbilitazione()) ? true : false );
		
		return dto;
	}

	@Override
	public DbIrideRichiestaUtente convertFrom(RichiestaUtenteDto v) throws DtoConversionException {
		DbIrideRichiestaUtente dto =  super.convertFrom(v);
		dto.setFlagCertificato( v.isFlagCertificato() ? "S" : "N" );
		dto.setFlagAbilitazione(v.isFlagAbilitazione() ? "S" : "N" );
		return dto;
	}

	
	

	

	

}
