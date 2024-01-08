package com.example.demo;

import com.fasterxml.jackson.databind.ObjectMapper;
import net.sf.jasperreports.engine.*;
import net.sf.jasperreports.engine.data.JRBeanArrayDataSource;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;
import net.sf.jasperreports.engine.design.JasperDesign;
import net.sf.jasperreports.engine.xml.JRXmlLoader;
import net.sf.jasperreports.view.JasperViewer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.*;
import java.util.*;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) throws JRException, FileNotFoundException {
		Pou2 pou2 = new Pou2(List.of("ff", "aa", "ss"));
		System.out.println("SSSSS");
		String filePath = "/Users/denissokolov/Downloads/demo/src/main/resources/jasper_templare/POUBS.jrxml";
		Rbs rbs1 = new Rbs("clauseee11111", "cond1");
		Rbs rbs2 = new Rbs("clauseee22", "cond22");
		List<Rbs> rbsList = new ArrayList<>();
		rbsList.add(rbs1);
		rbsList.add(rbs2);

		Pou pou1 = new Pou("cranumber", "clientnameeeee", rbsList);
		List<Pou> listPou = List.of(pou1);
		List<Pou2> pou2List = List.of(pou2);
		PouWrapper pouWrapper = new PouWrapper(pou1);
//		List<Student> studentList = new ArrayList<>();
//				studentList.add(student1);

//		//JRBeanCollectionDataSource dataSource = new JRBeanCollectionDataSource(rbsList);
//		JRBeanCollectionDataSource dataSource = new JRBeanCollectionDataSource(pou2List);
//		Map<String, Object> parameters = new HashMap<>();
//		parameters.put("CollectionBeanParam", dataSource);
//
//		InputStream input = new FileInputStream("/Users/denissokolov/Downloads/demo/src/main/resources/jasper_templare/POUBS.jrxml");
//		JasperDesign jasperDesign = JRXmlLoader.load(input);
//
//		JasperReport report = JasperCompileManager.compileReport(jasperDesign);
//		JasperPrint print = JasperFillManager.fillReport(report, parameters, new JREmptyDataSource());
//	//	JasperViewer.viewReport(print);
//
////		JasperReport report = JasperCompileManager.compileReport(filePath);
////		JasperPrint print = JasperFillManager.fillReport(report, parameters, dataSource);
//		JasperExportManager.exportReportToPdfFile(print,
//				"/Users/denissokolov/Downloads/demo/src/main/resources/jasper_templare/x1.pdf");
		System.out.println("report created");

		ObjectMapper mapper = new ObjectMapper();

//		try {
//
//			// Writing to a file
//			mapper.writeValue(
//					new File("/Users/denissokolov/Downloads/demo/src/main/resources/jsonWrapper.json"),
//					pouWrapper);
//
//		} catch (IOException e) {
//			e.printStackTrace();
//		}

		InputStream input2 = new FileInputStream("/Users/denissokolov/JaspersoftWorkspace/MyReports/FINALjrxml.jrxml");
		JasperDesign jasperDesign2 = JRXmlLoader.load(input2);

		JasperReport report2 = JasperCompileManager.compileReport(jasperDesign2);
//		Map<String, Object> params = new HashMap<>();
//		params.put("SUBREPORT", new File("/Users/denissokolov/JaspersoftWorkspace/MyReports/"));
		JRBeanCollectionDataSource collectionDataSource = new JRBeanCollectionDataSource(listPou);
		JasperPrint jasperPrint = JasperFillManager.fillReport(report2, null, collectionDataSource);
		JasperExportManager.exportReportToPdfFile(jasperPrint,
				"/Users/denissokolov/Downloads/demo/src/main/resources/jasper_templare/x5.pdf");

		SpringApplication.run(DemoApplication.class, args);
	}
}
