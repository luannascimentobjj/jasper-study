package br.com.caelum.financas.relatorio;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;

import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JRExporter;
import net.sf.jasperreports.engine.JRExporterParameter;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.ReportContext;
import net.sf.jasperreports.engine.export.JRPdfExporter;
import net.sf.jasperreports.engine.export.JRXlsExporter;
import br.com.caelum.financas.ConnectionFactory;

public class TesteGeraRelatorio {

	public static void main(String[] args) throws SQLException, JRException, FileNotFoundException {

		//JasperCompileManager.compileReportToFile("financas.jrxml");
					
		Connection conexao = new ConnectionFactory().getConnection();
		
		Map<String, Object> parametros = new HashMap<String, Object>();

		JasperPrint jasperPrint =  JasperFillManager.fillReport("gasto_por_mes_subreport1.jasper", parametros, conexao);
		JRExporter exporter = new JRPdfExporter();		
		exporter.setParameter(JRExporterParameter.JASPER_PRINT, jasperPrint);
		exporter.setParameter(JRExporterParameter.OUTPUT_STREAM, new FileOutputStream("gasto_por_mes.pdf"));
		exporter.exportReport();
		conexao.close();
	}
}
