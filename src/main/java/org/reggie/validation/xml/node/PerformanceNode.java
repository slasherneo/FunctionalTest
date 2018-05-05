package org.reggie.validation.xml.node;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class PerformanceNode {
	private String unit = "ms";
	private String mesure;
	private boolean isRelevant;

	public PerformanceNode() {

	}

	public PerformanceNode(String mesure, boolean isRelevant) {
		this.mesure = mesure;
		this.isRelevant = isRelevant;
	}

	@XmlAttribute(name = "unit")
	public String getUnit() {
		return unit;
	}

	@XmlAttribute(name = "mesure")
	public String getMesure() {
		return mesure;
	}

	public void setMesure(String mesure) {
		this.mesure = mesure;
	}

	@XmlAttribute(name = "isRelevant")
	public boolean isRelevant() {
		return isRelevant;
	}

	public void setRelevant(boolean isRelevant) {
		this.isRelevant = isRelevant;
	}
}
