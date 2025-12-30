package ex_01_Java_Basics;

public class Lab012_DetectSpaces {
    public static void main(String[] args) {
        String name = "This String Contains   double  and triple space ";
        System.out.println(name.indexOf("   "));
        System.out.println(name.indexOf("  "));
    }
}
