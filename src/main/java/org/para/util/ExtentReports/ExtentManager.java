package org.para.util.ExtentReports;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentManager {

    public static final ExtentReports extentReports = new ExtentReports();
    public synchronized static ExtentReports createExtentReports() {
        ExtentSparkReporter reporter = new ExtentSparkReporter("./extent-reports/extent-report.html");
        reporter.config().setReportName("Sample Project Extent Report");
        extentReports.attachReporter(reporter);
        extentReports.setSystemInfo("Project Name", "Para Bank Testing");
        extentReports.setSystemInfo("Author", "Suraj Tiwary");
        return extentReports;
    }
}
