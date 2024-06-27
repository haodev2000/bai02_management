package Main;

import model.Developer;
import model.Manager;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.println("-----------Manage------------");
       Manager manager = new Manager();
        System.out.println("Nhập id: ");
        String intID = sc.nextLine();
        manager.setId(intID);

        System.out.println("Nhập ManagerName: ");
        String name = sc.nextLine();
        manager.setName(name);

        System.out.println("Nhập baseSalary : ");
        Double doubleM = sc.nextDouble();
        manager.setBaseSalary(doubleM);

        System.out.println("Nhập Bonus : ");
        Double bonus = sc.nextDouble();
        manager.setBonus(bonus);

        Double totaM = manager.getBonus() + manager.getBaseSalary();




        System.out.println("-----------Developer------------");
        Developer developer = new Developer();
        System.out.println("Nhập id: ");
        String intIDM = sc.next();
        manager.setId(intIDM);

        System.out.println("Programmer Name : ");
        String developerName = sc.next();
        developer.setName(developerName);

        System.out.println("Nhập baseSalary : ");
        Double doubleD = sc.nextDouble();
        developer.setBaseSalary(doubleD);

        System.out.println("Nhập OverTime Hours: ");
        Double overTime = sc.nextDouble();
        developer.setOverTimeHours(overTime);

        System.out.println("Nhập HourLyRate: ");
       Double hourLyRate = sc.nextDouble();
        developer.setHourLyRate(hourLyRate);

        Double totaD = doubleD + (overTime * hourLyRate);



        //List
       System.out.println("--------List------------" + manager.getName());
       System.out.println("ManagerName: " + manager.getName());
       System.out.println("BaseSalary : " + manager.getBaseSalary());
       System.out.println("Bonus : " + manager.getBonus());
       manager.salary(totaM);
     System.out.println("-----------------------------------------------");
       System.out.println("ProgrammerName: " + developer.getName());
       System.out.println("BaseSalary: " + developer.getBaseSalary());
       System.out.println("OverTime Hours: " + developer.getOverTimeHours());
       System.out.println("HourLyRate: " + developer.getHourLyRate());
       developer.salary(totaD);


    }

}
