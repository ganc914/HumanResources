/*
Nombre: Gustavo Navarrete Cruz
Matricula: 2022431
 */
package mx.edu.cesba.main;

import mx.edu.cesba.model.Employee;

public class HR_Main {
    public static void main(String[] args) {
        
        Employee e1= new Employee();
        Employee e2= new Employee();
        
        e1.id = 1;
        e1.firstname = "Lionel";
        e1.lastName = "Messi";
        e1.age = 25;
        e1.email = "messi10@cesba.com";
        e1.phoneNumber  = 442335532;
        e1.salary = 25000;
        e1.hiredate = "02-11-2021";
        
        e2.id = 2;
        e2.firstname = "Cristiano";
        e2.lastName = "Ronaldo";
        e2.age = 27;
        e2.email = "cr7@cesba.com";
        e2.phoneNumber  = 442453222;
        e2.salary = 22000;
        e2.hiredate = "01-10-2009";
        
        e2.getDetails();
        System.out.println("***************************************");
        e1.getDetails();
        
    }
}
