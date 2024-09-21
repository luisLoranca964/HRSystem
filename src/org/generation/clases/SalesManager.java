package org.generation.clases;

import java.util.HashMap;

public class SalesManager extends SalesRep {
	HashMap<Integer, SalesRep> salesTeam;

	public SalesManager(String firstName, String lastName, int registration, int age, int daysworked,
			int vacationDaysTaken, double salary, int yearsWorked, double salesMade) {
		super(firstName, lastName, registration, age, daysworked, vacationDaysTaken, salary, yearsWorked, salesMade);
		this.salesTeam =new HashMap<>();
	}

	public HashMap<Integer, SalesRep> getSalesTeam() {
		return salesTeam;
	}

	public void setSalesTeam(HashMap<Integer, SalesRep> salesTeam) {
		this.salesTeam = salesTeam;
	}

	@Override
	public String toString() {
		return "SalesManager [salesTeam=" + salesTeam + ", getSalesMade()=" + getSalesMade() + ", toString()="
				+ super.toString() + ", getFirstName()=" + getFirstName() + ", getLastName()=" + getLastName()
				+ ", getRegistration()=" + getRegistration() + ", getAge()=" + getAge() + ", getDaysworked()="
				+ getDaysworked() + ", getVacationDaysTaken()=" + getVacationDaysTaken() + ", getSalary()="
				+ getSalary() + ", getYearsWorked()=" + getYearsWorked() + ", timeToRetirement()=" + timeToRetirement()
				+ ", vacationTimeLeft()=" + vacationTimeLeft() + ", calculateBonus()=" + calculateBonus()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + "]";
	}

	public void addSalesRep(int id, SalesRep rep) {
		salesTeam.put(id, rep);
	}

	public double calculateComission() {
		double teamSales = 0;
		for (SalesRep rep : salesTeam.values()) {
			teamSales += rep.calculateComission();
		}
		return 0.03 * teamSales;
	}
}
