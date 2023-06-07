import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        int age;
        String name;
        Double cgpa;
        char c;

        Scanner str=new Scanner(System.in);
        Scanner scNum=new Scanner(System.in);

        System.out.println("What is your name?");
        name= scNum.nextLine();

        System.out.println("What is your age? ");
        age= scNum.nextInt();

        System.out.println("What is your cgpa?");
        cgpa=scNum.nextDouble();

        System.out.println("What is your most favorite word?");
        c=str.next().charAt(0);

        System.out.println("\n");

        System.out.println("Welcome to the CyberCrime Universe Mr."+name);
        System.out.println("Your age is : "+age);
        System.out.println("CGPA Found :"+cgpa);
        System.out.println("The magic word is : "+c);

    }
}