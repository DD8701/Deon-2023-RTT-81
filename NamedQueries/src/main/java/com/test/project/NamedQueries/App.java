package com.test.project.NamedQueries;

import com.perscholas.controller.EmployeeController;

public class App 
{
    public static void main( String[] args )
    {
    	EmployeeController e = new EmployeeController();
    	//e.createEmployeeTable();
    	//e.findEmployeeByname();
        //e.findEmployeeById(); 
    	e.ShowOfficeCodes_AsDepartment();
}
}