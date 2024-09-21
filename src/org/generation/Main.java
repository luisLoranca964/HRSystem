package org.generation;

import org.generation.clases.Employee;
import org.generation.clases.SalesManager;
import org.generation.clases.SalesRep;

public class Main {
    public static void main(String[] args) {
        Employee emp1 = new Employee("Victor", "Pérez", 123, 45, 2000, 5, 50000, 20);
        System.out.println("Tiempo para retiro: " + emp1.timeToRetirement());
        System.out.println("Días de vacaciones restantes: " + emp1.vacationTimeLeft());
        System.out.println("Bono: " + emp1.calculateBonus());
        System.out.println();
        
        SalesRep salesRep1 = new SalesRep("Lupe", "González", 456, 30, 1500, 10, 60000, 10, 100000);
        System.out.println("Tiempo para retiro: " + salesRep1.timeToRetirement());
        System.out.println("Días de vacaciones restantes: " + salesRep1.vacationTimeLeft());
        System.out.println("Bono: " + salesRep1.calculateBonus());
        System.out.println("Comisión: " + salesRep1.calculateComission());
        System.out.println();
        
        SalesManager manager1 = new SalesManager("Carlos", "Lopez", 789, 50, 3000, 15, 80000, 30, 200000);
        System.out.println("Tiempo para retiro: " + manager1.timeToRetirement());
        System.out.println("Días de vacaciones restantes: " + manager1.vacationTimeLeft());
        System.out.println("Bono: " + manager1.calculateBonus());
        System.out.println();
        
        manager1.addSalesRep(1, salesRep1);
        manager1.addSalesRep(2, new SalesRep("Pedro", "Ramírez", 321, 35, 1700, 8, 55000, 12, 80000));

        System.out.println("Comisión del equipo: " + manager1.calculateComission());
    }
}

