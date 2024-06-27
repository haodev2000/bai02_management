package model;

public class Manager extends Employee{

    private double Bonus;

    public double getBonus() {
        return Bonus;
    }

    public void setBonus(double bonus) {
        Bonus = bonus;
    }

    @Override
    public void salary(double s){
        System.out.println("Total Salary: " + s);
    }
}
