package com.cybage.DatabaseHandling;

import java.io.File;
import java.io.FileOutputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

// Main (App) class shown only
// not its Connection class
public class Database {

	// Main driver method
	public static void main(String[] args) throws Exception
	{
		
		//SQL connection
		Class.forName("com.mysql.jdbc.Driver");

		//connection to the MySQL with valid username and password
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/employee","root","admin@123");

		//execution of query
		Statement statement = connection.createStatement();
		ResultSet resultSet = statement.executeQuery("select * from employee.employeedetails");

		// Create a workbook 
		XSSFWorkbook workbook = new XSSFWorkbook();

		// Create a spreadsheet inside a workbook
		XSSFSheet spreadsheet1= workbook.createSheet("employee");
		XSSFRow row = spreadsheet1.createRow(1);
		XSSFCell cell;

		// in the first row Header Name is getting created.
		cell = row.createCell(1);
		cell.setCellValue("Name");

		cell = row.createCell(2);
		cell.setCellValue("Age");

		cell = row.createCell(3);
		cell.setCellValue("Address");
		
		int i = 2;

		while (resultSet.next()) 
		{
			row = spreadsheet1.createRow(i);
			cell = row.createCell(1);
			cell.setCellValue(resultSet.getInt("Name"));

			cell = row.createCell(2);
			cell.setCellValue(resultSet.getString("age"));
			
			cell = row.createCell(3);
			cell.setCellValue(resultSet.getString("Address"));

			i++;
		}

		
		FileOutputStream output = new FileOutputStream(new File("E:\\GIT\\DatabaseConnect.xlsx"));

		workbook.write(output);

		output.close();

		System.out.println("Data has been added successfully in the excel");
	}
}
