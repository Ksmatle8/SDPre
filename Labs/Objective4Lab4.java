import java.util.Scanner;

public class Objective4Lab4 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.println("Please enter a number: ");
    int userNum = input.nextInt();

    if (userNum % 2 == 0) {
      System.out.println("This number is even.");
    }
    else {
      System.out.println("This number is odd.");
    }
    input.close();

  }
}
