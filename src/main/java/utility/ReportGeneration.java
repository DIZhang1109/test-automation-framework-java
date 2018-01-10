package utility;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Di on 11/01/18.
 * This Java class is used to generate various cucumber reports
 *
 * @author Di
 */
public class ReportGeneration {

    public static void main(String[] args) {
        File reportOutputDirectory = new File("build/cucumber-reports");
        List<String> jsonFiles = new ArrayList<>();
        jsonFiles.add("build/cucumber-reports/json-report/cucumber.json");
        Configuration configuration = new Configuration(reportOutputDirectory, "Gradle-Java-Test Automation");

        new ReportBuilder(jsonFiles, configuration).generateReports();
    }
}
