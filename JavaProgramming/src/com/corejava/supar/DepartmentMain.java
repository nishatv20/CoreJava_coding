package com.corejava.supar;

public class DepartmentMain {
	public static void main(String[] args) {
		Employee e1 = new Employee(111, "ACCOUNTS", 8341178, "account@gmail", 614, "NISHAT", 8956678, "VIMAN N E-20",
				"nishat@yahoo", 20000, 4000, 6000, 800);
		Employee e2 = new Employee(112, "RESEARCH", 8341177, "research@gmail", 615, "RAJESH", 8956677, "FC RDJ-20",
				"rajesh@yahoo", 12000, 4000, 6000, 800);
		Employee e3 = new Employee(113, "ADMIN", 8341171, "admins@gmail", 616, "PANKAJ", 8956676, "NASHIK-20",
				"pankaj@yahoo", 10000, 4000, 6000, 800);
		Employee e4 = new Employee(114, "QUALITY", 8341172, "quality@gmail", 617, "SHAURYA", 8956670, "MUMBAI E-20",
				"shaur@yahoo", 60000, 4000, 6000, 800);
		Employee e5 = new Employee(115, "MARKETING", 8341170, "market@gmail", 618, "ANKIT", 8956674, "NAGP E-20",
				"ankit@yahoo", 40000, 4000, 6000, 800);

		e1.empInfo();
		e1.disDept();
		e1.calSalary();
		e1.salSlip();
	}
}
