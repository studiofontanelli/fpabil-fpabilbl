package it.csi.fpabil.fpabilbl.business.exception;

import java.util.List;

import it.csi.fpabil.fpabilbl.dto.ErrorDetail;

;

/**
 * @author andreafontanelli
 *
 */
public class UnauthorizedHelperException extends HelperException {

	
	/**
	 * 
	 */
	private static final long serialVersionUID = 58261297403731707L;

	public UnauthorizedHelperException() {
		super();
	}
	
	public UnauthorizedHelperException(String message, Throwable cause) {
		super(message, cause);

	}
	
	public UnauthorizedHelperException(String message) {
		super(message);

	}
	



}