package Giris.paydaycalculator;

public class Employee {

    String name;
    int salary;
    int workHours;
    int hireYear;
    double tax;
    double bonus;
    double raiseSalary;

    Employee(String name, int salary, int workHours, int hireYear){

        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
        this.tax = 0;
        this.bonus= 0;
        this.raiseSalary = 0;
        
    }

    double tax(){


        if (this.salary >= 1000){

            this.tax = (this.salary * 0.03);

        } else {

            this.tax = 0;
        }

            return this.tax;
    }

    double bonus(){

        if(this.workHours >= 40){

            int rest;
            rest = this.workHours - 40;
            this.bonus = rest * 30;

        }

        return this.bonus;

    }

    double raiseSalary(){

        int workSince;
        workSince = 2021 - this.hireYear;

        if(workSince < 10){

            int percent;
            percent = (this.salary * 5) / 100;
            this.raiseSalary = percent;

        } else if (workSince > 10 && workSince < 21) {

            int percent;
            percent = (this.salary * 10) / 100;
            this.raiseSalary = percent;

        } else if (workSince > 19){

            int percent;
            percent = (this.salary * 15) / 100;
            this.raiseSalary = percent;


        }

        return this.raiseSalary;

    }

    void printScreen(){

        System.out.println("Adı: "+this.name);
        System.out.println("Maaşı: "+this.salary);
        System.out.println("Çalışma Saati: "+this.workHours);
        System.out.println("Başlangıç Yılı: "+this.hireYear);
        System.out.println("Vergi: "+tax());
        System.out.println("Bonus: "+bonus());
        System.out.println("Maaş Artışı: "+raiseSalary());
        System.out.println("Vergi ve Bonuslar ile birlikte maaş: "+ (this.salary + (bonus() - tax())));
        System.out.println("Toplam maaş: "+(this.salary + this.raiseSalary));


    }





}
