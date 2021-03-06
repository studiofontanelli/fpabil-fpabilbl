package it.csi.fpabil.fpabilbl.business.exception;

import java.util.List;

import it.csi.fpabil.fpabilbl.dto.ErrorDetail;
import it.csi.fpabil.fpabilbl.util.XmlSerializer;

;

/**
 * @author andreafontanelli
 *
 */
public class HelperException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = -1924852710233061982L;

	
	private List<ErrorDetail> errorDetails;
	
	public HelperException() {
		super();
	}
	
	public HelperException(List<ErrorDetail> errorDetails) {
		super();
		this.errorDetails = errorDetails;
	}
	

	public HelperException(String message, Throwable cause) {
		super(message, cause);

	}
	public HelperException(String message, Throwable cause, List<ErrorDetail> errorDetails) {
		super(message, cause);
		this.errorDetails = errorDetails;

	}
	
	public HelperException(String message) {
		super(message);

	}
	public HelperException(String message, List<ErrorDetail> errorDetails) {
		super(message);
		this.errorDetails = errorDetails;
	}

	
	public HelperException(Throwable cause) {
		super(cause);

	}

	public List<ErrorDetail> getErrorDetails() {
		return errorDetails;
	}

	public void setErrorDetails(List<ErrorDetail> errorDetails) {
		this.errorDetails = errorDetails;
	}



}