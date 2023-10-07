package com.annualTax;

public class tax {
        Details det = new Details();

        if (salary < 500000) {
            int Tax = salary * 0 / 100;
            System.out.println(Tax);
        } else if (salary > 500000 || salary < 1000000) {
            int Tax = salary * 5 / 100;
            System.out.println(Tax);

        } else if (salary > 1000000 || salary < 1500000) {
            int Tax = salary * 10 / 100;
            System.out.println(Tax);

        } else if (salary < 1500000) {
            int Tax = salary * 15 / 100;
            System.out.println(Tax);

        }

}

