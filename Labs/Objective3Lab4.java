import java.util.Scanner;

public class Objective3Lab4 {
  public static void main(String[] args) {
    // String firstName;
    // String lastName;
    // int age;

    Scanner input = new Scanner(System.in);

    System.out.println("What is your first name?");
    String firstName = input.next();

    System.out.println("What is your last name?");
    String lastName = input.next();

    System.out.println("What is your age?");
    int age = input.nextInt();

    System.out.println("First Name: " + firstName + ", " + "Last Name: " + lastName + ", " + "Age: " + age);

    input.close();
  }
}
