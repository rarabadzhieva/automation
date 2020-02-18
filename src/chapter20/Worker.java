package chapter20;

import java.text.DecimalFormat;

public class Worker extends Human implements Comparable<Worker>{

    private int salary;
    private double hours;

    public int getSalary() {
        return salary;
    }

    public double getHours() {
        return hours;
    }

    public Worker(int salary, double hours) {
        super();
        this.salary=salary;
        this.hours=hours;
    }

    public Worker(String firstName, String familyName, int salary, double hours) {
        super(firstName, familyName);
        this.salary=salary;
        this.hours=hours;
    }

    public double salaryPerHour() {
        return salary / hours;
    }

    public int compareTo(Worker o) {
        double workerSalary=salaryPerHour();
        double anotherWorkerSalary=o.salaryPerHour();
        if (workerSalary>anotherWorkerSalary) {
            return -1;
        } else if (workerSalary==anotherWorkerSalary) {
            return 0;
        }
        return 1;
    }

    @Override
    public String toString() {
        return "Worker " + this.getFirstName() + this.getFamilyName() +
                " salary " + salary + " hours " + hours + " per hour " +
                new DecimalFormat("#0.00").format(salaryPerHour());
    }
}
