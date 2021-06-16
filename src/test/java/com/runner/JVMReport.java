package com.runner;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;

public class JVMReport {

	public static void generateJVMReport(String jsonLoc) {
		// Path for jvmreport
		File jvmReport = new File(System.getProperty("user.dir") + "\\src\\test\\resources\\Reports");

		List<String> li = new ArrayList<String>();
		li.add(jsonLoc);

		Configuration con = new Configuration(jvmReport, "Facebook Report");
		con.addClassifications("Broswer", "Chrome");
		con.addClassifications("OS", "10 above");
		con.addClassifications("Version", "90");

		// Generate Report
		ReportBuilder builder = new ReportBuilder(li, con);
		builder.generateReports();
	}
}
