import java.awt.*;
import java.util.Objects;

public class Employee {

    String name;
    int age;
    int salary;


    public Employee(String name, int age, int salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee [" +
                "name = " + name +
                ", age = " + age +
                ", salary = " + salary +
                ']';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return age == employee.age &&
                salary == employee.salary &&
                Objects.equals(name, employee.name);
    }


    public static void main(String[] args) {

        Employee e1 = new Employee("Czesiek Rakieta",60,1500);

        Employee e2 = new Employee("Janusz Petarda",64,1580);

        Employee e3 = new Employee("Dżesika Bomba",27,1950);

        Employee e4 = new Employee("Czesiek Rakieta",60,1500);

        Menager m1 = new Menager("Arnold Boczek", 55,3600,800);

        Menager m2 = new Menager("Ferdynand Kiepski", 60,0,1000);



        if ( e1.equals(e4)){
            System.out.println("Ta sama osoba!!!");
        }
        else{
            System.out.println("Różne osoby");
        }


    }
}

class Menager extends Employee{

    int bonus;

    public Menager(String name, int age, int salary, int bonus) {
        super(name, age, salary);
        this.bonus = bonus;
    }

    @Override
    public String toString() {
        return "Menager[" +
                "name = " + name +
                ", age = " + age +
                ", salary = " + salary +
                ", bonus = " + bonus +
                ']';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Menager menager = (Menager) o;
        return bonus == menager.bonus;
    }


}
