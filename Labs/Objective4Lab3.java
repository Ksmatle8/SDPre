import java.util.Scanner;

public class Objective4Lab3 {
    public static void main(String[] args) {
      Scanner input = new Scanner(System.in);

      System.out.println("Please enter a number: ");
      int userNum = input.nextInt();

      if (userNum < 0) {
        System.out.println("This number is less than zero.");
      }
      else if (userNum == 0){
        System.out.println("This number is equal to zero.");
      }
      else {
        System.out.println("This number is greater than zero.");
      }
      input.close();
  }
}
