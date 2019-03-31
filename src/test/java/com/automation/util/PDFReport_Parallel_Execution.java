package com.automation.util;

import java.awt.print.PrinterException;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.OutputStream;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.jsoup.Jsoup;

import com.github.mkolisnyk.cucumber.reporting.CucumberConsolidatedReport;
import com.github.mkolisnyk.cucumber.reporting.CucumberDetailedResults;
import com.github.mkolisnyk.cucumber.reporting.CucumberFeatureOverview;
import com.google.common.io.Files;
import com.itextpdf.text.Document;
import com.itextpdf.text.html.simpleparser.HTMLWorker;
import com.itextpdf.text.pdf.PdfWriter;
import io.woo.htmltopdf.HtmlToPdf;
import io.woo.htmltopdf.HtmlToPdfObject;
import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;
import net.masterthought.cucumber.Reportable;



public class PDFReport_Parallel_Execution {
	 public static String path="target\\ConsolidatedHtmlReport\\cucumber-html-reports\\";
	
	
	public static void main(String[] args) throws Exception {
		
		consolidateAllJsonAndGenerateHTMLReport();
		generatePassFailPdfReport();
					
	}
	
	public static void consolidateAllJsonAndGenerateHTMLReport(){
		 //this will generate consolidated html reports
		File reportOutputDirectory = new File("target/ConsolidatedHtmlReport");
		List<String> jsonFiles = new ArrayList<>();
		
		File file = new File(System.getProperty("user.dir")+"\\target");
        String[] fileList = file.list();
       
      /*  for(String name:fileList){
        	if(name.endsWith(".json")){
        		
        		jsonFiles.add(System.getProperty("user.dir")+"\\target\\"+name);
        		
        	}
            
        }*/
		jsonFiles.add(System.getProperty("user.dir")+"\\target1\\cucumber.json");
		jsonFiles.add(System.getProperty("user.dir")+"\\target2\\cucumber.json");

		String buildNumber = "1";
		String projectName = "cucumberProject";
		boolean runWithJenkins = false;
		boolean parallelTesting = true;

		Configuration configuration = new Configuration(reportOutputDirectory, projectName);
		// optional configuration - check javadoc
		configuration.setRunWithJenkins(runWithJenkins);
		configuration.setBuildNumber(buildNumber);
	
		// addidtional metadata presented on main page
		configuration.addClassifications("Platform", "Windows");
		configuration.addClassifications("Browser", "Firefox");
		configuration.addClassifications("Branch", "release/1.0");

		// optionally add metadata presented on main page via properties file
		/*List<String> classificationFiles = new ArrayList<>();
		classificationFiles.add("properties-1.properties");
		classificationFiles.add("properties-2.properties");
		configuration.addClassificationFiles(classificationFiles);*/

		ReportBuilder reportBuilder = new ReportBuilder(jsonFiles, configuration);
		Reportable result = reportBuilder.generateReports();
		// and here validate 'result' to decide what to do
		// if report has failed features, undefined steps etc
		System.out.println("finished");
	
		
		
	}
	
	public static void generatePassFailPdfReport(){
		
		//*****************for pass and failed scenario**********************
				
				Iterator it=FileUtils.iterateFiles(new File(path), null, false);
				
				HtmlToPdf h=HtmlToPdf.create();
				List<HtmlToPdfObject> objs=Collections.synchronizedList(new ArrayList<HtmlToPdfObject>());
				
				objs.add(HtmlToPdfObject.forUrl(path+"overview-features.html"));
				while(it.hasNext()){
					File f=(File) it.next();
					if(Files.getFileExtension(f.getAbsolutePath()).equalsIgnoreCase("html") && f.getName().startsWith("report-feature")){
						System.out.println(f.getAbsolutePath());
						objs.add(HtmlToPdfObject.forUrl(f.getAbsolutePath()));
					}
				}
							
				objs.add(HtmlToPdfObject.forUrl(path+"overview-failures.html"));		
				for(HtmlToPdfObject htmlToPdfObject:objs){
					h.object(htmlToPdfObject);
				}
				boolean success=h.convert("target//"+"sample_details_report.pdf");
				System.out.println(success? "PDF report generated": "pdf report generation failed");
						
						
				//***********************end here report for Failed********************		
						
						
			
		
	}
	
	public static void generateTagPDFReport(){
		
		Iterator it=FileUtils.iterateFiles(new File(path), null, false);
	     
		HtmlToPdf h1=HtmlToPdf.create();
		
		//h1.imageQuality(100);
		//List<HtmlToPdfObject> objs=Collections.synchronizedList(new ArrayList<HtmlToPdfObject>());
		List<HtmlToPdfObject> objs=new ArrayList<HtmlToPdfObject>();
		objs.add(HtmlToPdfObject.forUrl(path+"overview-features.html"));
		while(it.hasNext()){
			File f=(File) it.next();
			if(Files.getFileExtension(f.getAbsolutePath()).equalsIgnoreCase("html") && f.getName().startsWith("report-tag")){
				System.out.println(f.getAbsolutePath());
				objs.add(HtmlToPdfObject.forUrl(f.getAbsolutePath()));
			}
		}
					
		objs.add(HtmlToPdfObject.forUrl(path+"overview-tags.html"));		
		for(HtmlToPdfObject htmlToPdfObject:objs){
			h1.object(htmlToPdfObject);
		}
		 
		
		
		
		boolean success=h1.convert("target//"+"sample_details_report_tag.pdf");
		System.out.println(success? " Tag PDF report generated": " Tag pdf report generation failed");
				
		
	}
}
