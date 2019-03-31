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
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import org.apache.commons.io.FileUtils;
//import org.jsoup.Jsoup;

import com.github.mkolisnyk.cucumber.reporting.CucumberConsolidatedReport;
import com.github.mkolisnyk.cucumber.reporting.CucumberDetailedResults;
import com.github.mkolisnyk.cucumber.reporting.CucumberFeatureOverview;
import com.google.common.io.Files;
import com.itextpdf.text.Document;
import com.itextpdf.text.html.simpleparser.HTMLWorker;
import com.itextpdf.text.pdf.PdfWriter;
//import com.openhtmltopdf.DOMBuilder;
//import com.openhtmltopdf.pdfboxout.PdfRendererBuilder;

//import io.woo.htmltopdf.HtmlToPdf;
//import io.woo.htmltopdf.HtmlToPdfObject;
//import net.masterthought.cucumber.Configuration;
//import net.masterthought.cucumber.ReportBuilder;
//import net.masterthought.cucumber.Reportable;

/*import com.github.mkolisnyk.cucumber.reporting.CucumberDetailedResults;*/


/**Where is it used?
Consolidated report is actually a combination of any other reports produced by the library. It is used when we need to provide single file report from multiple different reports. Typically, it may be needed for:

E-mail HTML-based body containing multiple reports
PDF which groups multiple reports
All above cases for multiple reports of the same type to show some slices of the same data set (e.g. if we would like to view multiple retrospective reports for all available branches)
*/
public class cucumberConsolidateReport {
	 public static String path="target\\cucumber-JVM-reports\\cucumber-html-reports\\";
	 
	
	
	public static void main(String[] args) throws Exception {
		
		// consolidated report
		String stringarray[]={"fff","fsfd"};
		CucumberConsolidatedReport results = new CucumberConsolidatedReport();
		results.setOutputDirectory("target");
		results.setOutputName("cucumber-results");
		results.setPdfPageSize("A4 landscape");
		results.setSourceFile("target/cucumber.json");
		
		results.execute(
			new File("./src/test/resources/configuration.json"),
			true
		,stringarray);
		
		
	
		
	}		
	
}
