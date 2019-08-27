package it.csi.fpabil.fpabilbl.business.helper.impl;

import org.springframework.stereotype.Service;

import it.csi.fpabil.fpabilbl.business.exception.HelperException;
import it.csi.fpabil.fpabilbl.business.helper.FpabilHelper;



@Service("fpabilHelper")
public class FpabilHelperImpl extends CommonHelperImpl implements FpabilHelper{

	
	

	@Override
	public Boolean testResources(String arg) throws HelperException {
		return super.testResources(arg);
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
