package ex_01_Java_Basics;

import java.util.Scanner;

public interface Lab015_IncomeTax {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Provide your salary");
        Float salary = sc.nextFloat();
        Float  tax = 0f;
        if (salary<2.5f)
        {
            tax =0.f;
        }
        else if (salary>2.5f && salary<5.0f)
        {
            tax =  0.05f*(salary- 2.5f);
        }
        else if(salary>5.0f && salary<10.0f)
        {
            tax = ( 0.05f *(5.0f-2.5f) + 0.2f*(salary-5.f));

        }
        else if(salary>10.0f)
        {
            tax = (float) (0.05*(5.0f-2.5f) + 0.2*(10.0f-5.0f) +0.3f*(salary-10.f));
        }
           float netSalary = salary -tax;
        System.out.println("Total Salary :"+salary);
        System.out.println("Tax Deducted :" + tax);
        System.out.println("Salary After Tax :" +netSalary);
    }
}
