package ex_01_Java_Basics;

import java.util.Scanner;

public class Lab004_Percentage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter English marks : ");
        int num1 = sc.nextInt();
        System.out.print("Enter Hindi marks : ");
        int num2 = sc.nextInt();
        System.out.print("Enter Science marks : ");
        int num3 = sc.nextInt();
        System.out.print("Enter Maths marks : ");
        int num4 = sc.nextInt();
        System.out.print("Enter Social Science marks : ");
        int num5 = sc.nextInt();
        System.out.println( "Enter Total No. of marks ");
        int num6 = sc.nextInt();

        int sum = num1 + num2 + num3 + num4 +num5 ;
        float percentage = (sum * 100f)/num6;
        System.out.print("Total percentage obtain by student is : "+percentage);
    }
}
