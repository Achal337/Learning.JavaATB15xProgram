package ex_01_Java_Basics;

import java.util.Scanner;

public class Lab011_ReplaceWithName {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Provide Any Name : ");
        String name = s.nextLine();

        String letter = "Dear <|name|> , Thanks a lot ";
        letter = letter.replace("<|name|>",name);
        System.out.println(letter);
    }
}
