package com.corejava.supar;

public class Employee extends Department {
	int e_no;
	String e_name;
	int e_phone;
	String e_addr;
	String e_email;
	int e_sal;
	int e_hra;
	int e_da;
	int e_other;
	int tot;
	public Employee(int code, String name, int phone, String mail, int eno, String ename, int ephon, String eadd,
			String eemail, int esal, int ehr, int eda, int eoth) {
		super(code, name, phone, mail);
		e_no = eno;
		e_name = ename;
		e_phone = ephon;
		e_addr = eadd;
		e_email = eemail;
		e_sal = esal;
		e_hra = ehr;
		e_da = eda;
		e_other = eoth;
	}

	public void empInfo() {
		System.out.println("----EMPLOYEE INFO----");
		System.out.println("EMPLOYEE NUMBER :" + e_no);
		System.out.println("EMPLOYEE NAME :" + e_name);
		System.out.println("EMPLOYEE PHONE :" + e_phone);
		System.out.println("EMPLOYEE ADDRESS :" + e_addr);
		System.out.println("EMPLOYEE EMAIL :" + e_email);
		System.out.println("EMPLOYEE SALARY :" + e_sal);
		System.out.println("EMPLOYEE HRA :" + e_hra);
		System.out.println("EMPLOYEE DA :" + e_da);
		System.out.println("EMPLOYEE OTHER EXP :" + e_other);
	}

	public void calSalary() {
		tot = e_sal + e_da + e_other;
		System.out.println("TOTAL SALARY OF EMP ::" + tot);
	}

	public void salSlip() {
		System.out.println("----SALARY SLIP----");
		System.out.println("EMP NAME :" + e_no);
		System.out.println("DEPT CODE :" + super.d_code);
		System.out.println("DEPT NAME :" + super.d_name);
		System.out.println("EMP BASIC SAL :" + e_sal);
		System.out.println("EMP HRA :" + e_hra);
		System.out.println("EMP DA :" + e_da);
		System.out.println("EMP OTHER EXPENSES :" + e_other);
		System.out.println("TOTAL SALARY :" + tot);
	}
}
