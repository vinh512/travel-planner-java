import java.util.Scanner;

class TravelPlanner {

  public static void main(String[] args) {
    greet();
    budgetTime();
  }

  public static void greet() {
    Scanner input = new Scanner(System.in);
    System.out.println("Welcome to Travel Planner!");
    System.out.print("What is your name? ");
    String name = input.nextLine();
    System.out.print("Nice to meet you " + name + ". Where are you traveling to? ");
    String destination = input.nextLine();
    System.out.println("Great! " + destination + " Sounds like a fun destination.");
    System.out.println("\n**********\n");
  }

  public static void budgetTime() {
    Scanner input = new Scanner(System.in);
    System.out.print("How many days are you going to stay there? ");
    int daysStayed = input.nextInt();
    System.out.print("How much money(USD) are you planning to spend on your trip? ");
    float budget = input.nextFloat();
    float hours = daysStayed * 24;
    float minutes = hours * 60;
    float budgetPerDay = budget / daysStayed;
    System.out.println("If you are traveling for " + daysStayed + " days, that is the same as " + hours + " hours or " + minutes + " minutes.");
    System.out.println("If your budget is $" + budget + ", that is $" + budgetPerDay + " per day.");
    System.out.println("\n**********\n");
  }

}
