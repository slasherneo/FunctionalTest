package org.reggie.validation.xml.node;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class ResultNode {
	private SuccessNode success;
	private String errorlog;
	private PerformanceNode performance;

	public ResultNode() {

	}

	public ResultNode(SuccessNode success, PerformanceNode performance, String errorlog) {
		this.success = success;
		this.performance = performance;
		this.errorlog = errorlog;
	}

	@XmlElement
	public SuccessNode getSuccess() {
		return success;
	}

	public void setSuccess(SuccessNode success) {
		this.success = success;
	}

	@XmlElement
	public String getErrorlog() {
		return errorlog;
	}

	public void setErrorlog(String errorlog) {
		this.errorlog = errorlog;
	}

	@XmlElement
	public PerformanceNode getPerformance() {
		return performance;
	}

	public void setPerformance(PerformanceNode performance) {
		this.performance = performance;
	}
}
