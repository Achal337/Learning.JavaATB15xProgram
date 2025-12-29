package ex_01_Java_Basics;

import java.util.Scanner;

public class Lab005_KmToMiles {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Kilometer :");
        float num1 = sc.nextFloat();
        float m1 = num1 * 0.621371f;
        System.out.print(num1+"Km : " + m1+"miles");
    }
}
