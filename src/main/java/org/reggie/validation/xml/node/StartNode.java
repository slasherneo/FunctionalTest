package org.reggie.validation.xml.node;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class StartNode {
	private DatetimeFormatNode date;
	private DatetimeFormatNode time;

	public StartNode() {
	}

	public StartNode(DatetimeFormatNode date, DatetimeFormatNode time) {
		this.date = date;
		this.time = time;
	}

	public DatetimeFormatNode getDate() {
		return date;
	}

	public void setDate(DatetimeFormatNode date) {
		this.date = date;
	}

	public DatetimeFormatNode getTime() {
		return time;
	}

	public void setTime(DatetimeFormatNode time) {
		this.time = time;
	}
}
