import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("podaj długość boku kwadratu: ");
    int x = scanner.nextInt();

    
    for (int i = 0; i < x; i++) {
      System.out.print("*");
    }
    System.out.println();

    
    for (int i = 0; i < x - 2; i++) {
      System.out.print("*");
      for (int j = 0; j < x - 2; j++) {
        System.out.print(" ");
      }
      System.out.println("*");
    }

   
    for (int i = 0; i < x; i++) {
      System.out.print("*");
    }
    System.out.println();
  }
}