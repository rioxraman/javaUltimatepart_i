//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package com.codewithmosh;

public class Main {
    public Main() {
    }

    public static void main(String[] args) {
        Employee employee = new Employee(50000, 20);
        Employee.printNumberOfEmployees();
        int wage = employee.calculateWage();
        System.out.println(wage);
    }
}
