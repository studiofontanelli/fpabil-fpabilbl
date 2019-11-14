package it.csi.fpabil.fpabilbl.business.helper.impl;

import org.apache.commons.lang3.RandomStringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import it.csi.fpabil.fpabilbl.business.adapter.RichiestaOperatoreDtoAdapter;
import it.csi.fpabil.fpabilbl.business.adapter.RichiestaUtenteDtoAdapter;
import it.csi.fpabil.fpabilbl.business.dto.RichiestaOperatoreDto;
import it.csi.fpabil.fpabilbl.business.dto.RichiestaUtenteDto;
import it.csi.fpabil.fpabilbl.business.exception.HelperException;
import it.csi.fpabil.fpabilbl.business.helper.FpabilHelper;
import it.csi.fpabil.fpabilbl.integration.dto.DbIrideRichiestaOperatore;
import it.csi.fpabil.fpabilbl.util.Tracer;



@Service("fpabilHelper")
public class FpabilHelperImpl extends CommonHelperImpl implements FpabilHelper {


	@Autowired
	private RichiestaOperatoreDtoAdapter richiestaOperatoreDtoAdapter;

	@Autowired
	private RichiestaUtenteDtoAdapter richiestaUtenteDtoAdapter;

	@Override
	public Boolean testResources(String arg) throws HelperException {
		return super.testResources(arg);
	}

	@Override
	public String saveRichiesta(RichiestaOperatoreDto request) throws HelperException {
		final String method = "saveRichiesta";
		String result = null;
		try {



			request.setIdStatoRichiestaOperatore(STATO_RICHIESTA_DA_ESAMINARE);


			DbIrideRichiestaOperatore dbIrideRichiestaOperatore = richiestaOperatoreDtoAdapter.convertFrom(request);
			
			result =  RandomStringUtils.randomAlphanumeric(16);
			
			
			dbIrideRichiestaOperatore.setCodiceRichiesta(result);
			

			getDbIrideRichiestaOperatoreMapper().insert(dbIrideRichiestaOperatore);
			
			Tracer.info(LOG, getClass().getName(), method, "ID [" + dbIrideRichiestaOperatore.getIdRichiestaOperatore()+"]= " + result);
			

			if(request.getElencoRichiestaUtenteDto() != null) {
				for(RichiestaUtenteDto richiestaUtente : request.getElencoRichiestaUtenteDto()) {
					richiestaUtente.setIdRichiestaOperatore(dbIrideRichiestaOperatore.getIdRichiestaOperatore());
					getDbIrideRichiestaUtenteMapper().insert(richiestaUtenteDtoAdapter.convertFrom(richiestaUtente));
				} 
			}
			
			

		}
		catch(Exception e) {
			Tracer.error(LOG, getClass().getName(), method, "Exception " + e);
			throw new HelperException("Errore in fase di " + method, e);
		}
		return result;

	}



	/*
		DbIrideRichiestaOperatoreExample example = new DbIrideRichiestaOperatoreExample();
		//example.createCriteria().andLrNomeLike("ANDRE%");
		int count =dbIrideRichiestaOperatoreMapper.countByExample(example);
		if (count > 0)
			result = true;

		if(result)
			throw new NullPointerException("SONO NULLO QUASI NULLISSIMO");
	 */



}
