package org.generation.clases;

public class SalesRep extends Employee {
	private double salesMade;

	public SalesRep(String firstName, String lastName, int registration, int age, int daysworked, int vacationDaysTaken,
			double salary, int yearsWorked, double salesMade) {
		super(firstName, lastName, registration, age, daysworked, vacationDaysTaken, salary, yearsWorked);
		this.salesMade = salesMade;
	}

	public double getSalesMade() {
		return salesMade;
	}

	public void setSalesMade(double salesMade) {
		this.salesMade = salesMade;
	}

	public double calculateComission() {
		 return 0.1 * salesMade;
	}

	@Override
	public String toString() {
		return "SalesRep [salesMade=" + salesMade + ", getFirstName()=" + getFirstName() + ", getLastName()="
				+ getLastName() + ", getRegistration()=" + getRegistration() + ", getAge()=" + getAge()
				+ ", getDaysworked()=" + getDaysworked() + ", getVacationDaysTaken()=" + getVacationDaysTaken()
				+ ", getSalary()=" + getSalary() + ", getYearsWorked()=" + getYearsWorked() + ", toString()="
				+ super.toString() + ", timeToRetirement()=" + timeToRetirement() + ", vacationTimeLeft()="
				+ vacationTimeLeft() + ", calculateBonus()=" + calculateBonus() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + "]";
	}
	
}
