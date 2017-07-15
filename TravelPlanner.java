import java.util.Scanner;

class TravelPlanner {
  public static void main(String[] args) {
    greet();
  }

  public static void greet() {
    Scanner input = new Scanner(System.in);

    System.out.println("Welcome to Travel Planner!");
    System.out.print("What is your name? ");
    String name = input.nextLine();
    System.out.print("Nice to meet you " + name + ". Where are you traveling to? ");
    String destination = input.nextLine();
    System.out.println("Great! " + destination + " Sounds like a fun destination.");
  }
}
