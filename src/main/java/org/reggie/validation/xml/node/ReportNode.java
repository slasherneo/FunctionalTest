package org.reggie.validation.xml.node;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSeeAlso;

@XmlRootElement(name = "report")
@XmlSeeAlso({ TestNode.class })
public class ReportNode {
	private String name;
	private String categ;
	private StartNode start;
	List<TestNode> test;

	public ReportNode() {
	}

	public ReportNode(String name, String categ) {
		this.name = name;
		this.categ = categ;
		this.test = new ArrayList<TestNode>();
		createStartNode();
	}

	private void createStartNode() {

		// Create start time
		SimpleDateFormat dateformat = new SimpleDateFormat("yyyyMMdd");
		SimpleDateFormat timeformat = new SimpleDateFormat("HHmmss");
		DatetimeFormatNode date = new DatetimeFormatNode(dateformat.format(new Date()));
		DatetimeFormatNode time = new DatetimeFormatNode(timeformat.format(new Date()));
		this.start = new StartNode(date, time);
	}

	@XmlAttribute(name = "name")
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@XmlAttribute(name = "categ")
	public String getCateg() {
		return categ;
	}

	public void setCateg(String categ) {
		this.categ = categ;
	}

	@XmlElement
	public List<TestNode> getTest() {
		return test;
	}

	public void setTest(List<TestNode> test) {
		this.test = test;
	}

	@XmlElement
	public StartNode getStart() {
		return start;
	}

	public void setStart(StartNode start) {
		this.start = start;
	}
}
