package it.csi.fpabil.fpabilbl.business.helper;


import java.util.List;

import it.csi.fpabil.fpabilbl.business.dto.ComuneDto;
import it.csi.fpabil.fpabilbl.business.dto.OperatoreDto;
import it.csi.fpabil.fpabilbl.business.dto.ProvinciaDto;
import it.csi.fpabil.fpabilbl.business.dto.StatoEsteroDto;
import it.csi.fpabil.fpabilbl.business.dto.TipoDocumentoDto;
import it.csi.fpabil.fpabilbl.business.exception.HelperException;

public interface AnagraficheHelper {

	/**
	 * 
	 * @return
	 * @throws HelperException
	 */
	public List<ProvinciaDto> getProvince() throws HelperException;
	
	
	/**
	 * 
	 * @param codiceProvincia
	 * @return
	 * @throws HelperException
	 */
	public List<ComuneDto> getComuniByProvincia(String codiceProvincia) throws HelperException;
	
	/**
	 * 
	 * @return
	 * @throws HelperException
	 */
	public List<StatoEsteroDto> getStatiEsteri() throws HelperException;
	
	
	/**
	 * 
	 * @return
	 * @throws HelperException
	 */
	public OperatoreDto getOperatore(String gruppoOperatore, String codiceOperatore) throws HelperException;
	
	
	
	public List<TipoDocumentoDto> getTipiDocumento() throws HelperException;

	
}
