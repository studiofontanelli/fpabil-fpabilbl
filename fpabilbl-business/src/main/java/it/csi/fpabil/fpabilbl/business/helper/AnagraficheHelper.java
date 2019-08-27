package it.csi.fpabil.fpabilbl.business.helper;


import java.util.List;

import it.csi.fpabil.fpabilbl.business.dto.ProvinciaDto;
import it.csi.fpabil.fpabilbl.business.exception.HelperException;

public interface AnagraficheHelper {


	public List<ProvinciaDto> getProvince() throws HelperException;

	
}
