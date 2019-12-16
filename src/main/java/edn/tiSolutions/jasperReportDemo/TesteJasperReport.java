package edn.tiSolutions.jasperReportDemo;

import net.sf.jasperreports.engine.*;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;
import net.sf.jasperreports.engine.design.JasperDesign;
import net.sf.jasperreports.engine.xml.JRXmlLoader;
import net.sf.jasperreports.view.JasperViewer;

import java.io.*;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TesteJasperReport {

    public static void main(String[] args) throws FileNotFoundException, JRException {
        Map<String, Object> parameters = new HashMap<>();

        String fileInputPath = System.getProperty("user.dir") + "/jasper-reports/teste.jrxml";
        String fileOutputPath = System.getProperty("user.dir") + "/jasper-reports/teste.pdf";

        List<Employee> list = Employee.getEmployeesMock();

        JRBeanCollectionDataSource dataSource = new JRBeanCollectionDataSource(list);

        parameters.put("CollectionBeanDataSource", dataSource);
        parameters.put("myTitle", "teste joao das couves");

        InputStream inputStream = new FileInputStream(fileInputPath);

        JasperDesign jasperDesign = JRXmlLoader.load(inputStream);

        JasperReport jasperReport = JasperCompileManager.compileReport(jasperDesign);

        JasperPrint jasperPrint = JasperFillManager.fillReport(jasperReport, parameters, new JREmptyDataSource());

        // fast way to preview the report
        JasperViewer.viewReport(jasperPrint);

        // generating pdf file
        File fileOutput = new File(fileOutputPath);
        OutputStream outputStream = new FileOutputStream(fileOutput);
        JasperExportManager.exportReportToPdfStream(jasperPrint, outputStream);

        System.out.println("Report has been generated");
    }

}
