package com.employeemanagement;

import java.util.ArrayList;
import java.util.List;

import com.dao.EmployeeDao;
import com.entity.Employee;
import com.entity.Project;

public class App {
	public static void main(String[] args) {

		Employee emp1 = new Employee();
		emp1.setEmpName("Sonu");
		emp1.setLocation("Mumbai");
		emp1.setSalary(75000);
		Employee emp2 = new Employee();
		emp2.setEmpName("Palis");
		emp2.setLocation("Patna");
		emp2.setSalary(80000);
		Employee emp3 = new Employee();
		emp3.setEmpName("Rangbazz");
		emp3.setLocation("Ranchi");
		emp3.setSalary(50000);

		Project pro1 = new Project();
		pro1.setProjectName("Airline reservation system");
		pro1.setBudget(5500000);
		Project pro2 = new Project();
		pro2.setProjectName("Data visualization software.");
		pro2.setBudget(1200000);
		Project pro3 = new Project();
		pro3.setProjectName("Network packet sniffer.");
		pro3.setBudget(2500000);

		// creating project list

		// this list for emp1
		List<Project> pList1 = new ArrayList<>();
		pList1.add(pro1);
		pList1.add(pro2);

		// this list for emp2
		List<Project> pList2 = new ArrayList<>();
		pList2.add(pro1);
		pList2.add(pro3);

		// this list for emp3
		List<Project> pList3 = new ArrayList<>();
		pList3.add(pro1);
		pList3.add(pro2);
		pList3.add(pro3);

		// assigning projects to employee
		emp1.setProjects(pList1);
		emp2.setProjects(pList2);
		emp3.setProjects(pList3);

		// saving employee and projects
		EmployeeDao employeeDao = new EmployeeDao();
//		employeeDao.saveEmployee(emp1);
//		employeeDao.saveEmployee(emp2);
//		employeeDao.saveEmployee(emp3);

		// to get/search employee
		Employee searchEmp = employeeDao.getEmployee(4);
		List<Project> emProjects = (List<Project>) searchEmp.getProjects();

		System.out.println("\n------------------------------\n" + "ID | Name | Salary | Location"
				+ "\n------------------------------");
		System.out.println(searchEmp.getEmpId() + "    " + searchEmp.getEmpName() + "   " + searchEmp.getSalary()
				+ "   " + searchEmp.getLocation());
		System.out.println("\n---------\nProjects |\n---------");

		emProjects.forEach(pl -> System.out.print("> " + pl.getProjectName() + "\n"));

		// to update employee
//		searchEmp.setEmpName("Sujal");
//		employeeDao.updateEmployee(searchEmp);

		// to delete employee
//		employeeDao.deleteEmployee(6);

		// to increase salary
//		employeeDao.increaseEmployeeSalary(3, 10);

		// to delete project
//		ProjectDao projectDao = new ProjectDao();
//		projectDao.deleteProject(6);
	}
}
