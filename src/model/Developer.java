package model;

public class Developer extends Employee{

    private  double bonus;
    private double overTimeHours;
    private double hourLyRate;

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    public double getOverTimeHours() {
        return overTimeHours;
    }

    public void setOverTimeHours(double overTimeHours) {
        this.overTimeHours = overTimeHours;
    }

    public double getHourLyRate() {
        return hourLyRate;
    }

    public void setHourLyRate(double hourLyRate) {
        this.hourLyRate = hourLyRate;
    }

    @Override
    public void salary(double s){
        System.out.println(s);
    }
}
