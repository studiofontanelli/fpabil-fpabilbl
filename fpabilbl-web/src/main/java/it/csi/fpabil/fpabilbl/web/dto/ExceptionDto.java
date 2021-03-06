package it.csi.fpabil.fpabilbl.web.dto;

import java.util.List;

import org.springframework.http.HttpStatus;

import it.csi.fpabil.fpabilbl.dto.ErrorDetail;
import it.csi.fpabil.fpabilbl.util.XmlSerializer;

public class ExceptionDto implements java.io.Serializable {

	private static final long serialVersionUID = -2517870193254779853L;

	private Integer status;
	private String code;
	private String title;
	private List<ErrorDetail> errorDetails;
	
	public ExceptionDto(HttpStatus httpCode, String title) {
		super();
		this.setStatus(httpCode.value());
		this.setCode(httpCode.getReasonPhrase());
		this.setTitle(title);
	}

	public ExceptionDto(HttpStatus httpCode, String title, List<ErrorDetail> details) {
		this(httpCode, title);
		this.setErrorDetails(details);
	}

	public Integer getStatus() {
		return status;
	}

	public String getTitle() {
		return title;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public List<ErrorDetail> getErrorDetails() {
		return errorDetails;
	}

	public void setErrorDetails(List<ErrorDetail> errorDetails) {
		this.errorDetails = errorDetails;
	}

	

	

}
