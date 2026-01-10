package ex_01_Java_Basics;

import java.util.Scanner;

public class Lab017_WebsiteType {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Provide the Website URL ");
        String website = sc.next();
         if (website.endsWith(".com"))
        {
            System.out.println("It is a Commercial Website");
        }
        else if (website.endsWith(".in")){
            System.out.println("It is an Indian Website");
        }
        else if (website.endsWith(".org")){
            System.out.println("It is an Organization Website");
        }

         else  {
            System.out.println("Does not recorgnize the type of website");
        }
    }
}
