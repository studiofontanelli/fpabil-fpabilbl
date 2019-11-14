package it.csi.fpabil.fpabilbl.business.helper;


import it.csi.fpabil.fpabilbl.business.dto.RichiestaOperatoreDto;
import it.csi.fpabil.fpabilbl.business.exception.HelperException;

public interface FpabilHelper {

	
	public final static int STATO_RICHIESTA_DA_ESAMINARE = 1;
	
	public Boolean testResources(String arg) throws HelperException;
	
	
	public String saveRichiesta(RichiestaOperatoreDto request) throws HelperException;

	
}
