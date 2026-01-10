package ex_01_Java_Basics;

import java.util.Scanner;

public class Lab014_IfElse {
    public static void main(String[] args) {
        byte m1, m2, m3;
        Scanner sc = new Scanner(System.in);
        System.out.println("Marks of physics");
        m1 = sc.nextByte();
        System.out.println("Marks of Chemistry");
        m2 = sc.nextByte();
        System.out.println("Marks of Maths");
        m3 = sc.nextByte();
        Float avg = (m1 + m2 +m3)/3f ;
        System.out.println("Your percentage is : " + avg +"%");
        if (avg>40 && m1>33 && m2>33 && m3 >33)
        {
            System.out.println("You have been promoted");

        }
        else
        {
            System.out.println("Sorry you are fail, Average percantage needed to qualify is 40%");
        }

    }
}
