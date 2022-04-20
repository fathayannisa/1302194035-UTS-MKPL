package lib;

import java.time.LocalDate;
import java.time.Month;
import java.util.LinkedList;
import java.util.List;

public class Employee {
	
	private boolean isForeigner;
	private boolean gender; //true = Laki-laki, false = Perempuan
	
	private int monthlySalary;
	private int otherMonthlyIncome;
	private int annualDeductible;
	
	public Employee(boolean isForeigner, boolean gender) {
		this.isForeigner = isForeigner;
		this.gender = gender;
	
	}

	
}
