package org.reggie.validation.xml.node;

import javax.xml.bind.annotation.XmlAttribute;

public class DatetimeFormatNode {
	private String format = "YYYYMMDD";
	private String val ;
	
	public DatetimeFormatNode(String date)
	{
		this.val = date;
	}

	@XmlAttribute(name = "format")
	public String getFormat() {
		return format;
	}


	@XmlAttribute(name = "val")
	public String getVal() {
		return val;
	}

	public void setVal(String val) {
		this.val = val;
	}
}
