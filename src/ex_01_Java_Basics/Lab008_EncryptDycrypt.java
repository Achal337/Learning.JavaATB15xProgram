package ex_01_Java_Basics;

public class Lab008_EncryptDycrypt {
    public static void main(String[] args) {
        char grade = 'A';
        // encrypting
                grade = (char)(grade + 8);
        System.out.println(grade);
        // Dycrypted
        grade = (char) (grade - 8);
        System.out.println("Your actual grade is : " + grade);

    }
}
