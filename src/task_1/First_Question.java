package task_1;

import java.util.Arrays;

public class First_Question {
    public static void main(String[] args) {
        int a = 9;
        int b = 2;
        int c = 10;
        String GreatestNum =  a > b ? ( a >  c ? "A is big" : "C is big") : (b > c ? "b is big" : "c is big");
        System.out.println(GreatestNum);
    }
}
