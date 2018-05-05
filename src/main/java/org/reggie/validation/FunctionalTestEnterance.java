package org.reggie.validation;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.StringWriter;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

import org.reggie.validation.xml.node.PerformanceNode;
import org.reggie.validation.xml.node.ReportNode;
import org.reggie.validation.xml.node.ResultNode;
import org.reggie.validation.xml.node.SuccessNode;
import org.reggie.validation.xml.node.TestNode;

public class FunctionalTestEnterance {

	public static void main(String[] args) throws JAXBException, IOException {
		JAXBContext context = JAXBContext.newInstance(ReportNode.class);
		Marshaller marshaller = context.createMarshaller();

		marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);

		// Create Root
		ReportNode report = new ReportNode("APIs Test", "AAE");

		// Create result #1
		SuccessNode ses_1 = new SuccessNode(true, "100");
		PerformanceNode perfer_node_1 = new PerformanceNode("1.56", true);
		ResultNode result_1 = new ResultNode(ses_1, perfer_node_1, "");
		TestNode test_1 = new TestNode("API1", "yes", "Good Test man", result_1);
		report.getTest().add(test_1);

		// Create result #2
		SuccessNode ses_2 = new SuccessNode(true, "100");
		PerformanceNode perfer_node_2 = new PerformanceNode("1.72", true);
		ResultNode result_2 = new ResultNode(ses_2, perfer_node_2, "");
		TestNode test_2 = new TestNode("API2", "yes", "Good Test man", result_2);
		report.getTest().add(test_2);

		// Create result #3
		SuccessNode ses_3 = new SuccessNode(true, "100");
		PerformanceNode perfer_node_3 = new PerformanceNode("1.12", true);
		ResultNode result_3 = new ResultNode(ses_3, perfer_node_3, "");
		TestNode test_3 = new TestNode("COM1", "yes", "Good Test man", result_3);
		report.getTest().add(test_3);

		// Output
		StringWriter writer = new StringWriter();
		marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
		marshaller.marshal(report, writer);
		System.out.println(writer.toString());

		File file = new File(args[0],"functional_test.xml");
		if (!file.exists()) {
			System.out.println(file.createNewFile());
		}
		FileWriter fw = new FileWriter(file, false);
		fw.write(writer.toString());
		fw.close();
	}

}
