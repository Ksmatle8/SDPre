import java.util.Scanner;

public class Objective3Lab5 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.println("Please enter a number: ");
    int numb1 = input.nextInt();

    System.out.println("Please enter another number: ");
    int numb2 = input.nextInt();

    int sum;
    sum = numb1 + numb2;

    System.out.println("The sum of " + numb1 + " + " + numb2 + " = " + sum);
  }
}
