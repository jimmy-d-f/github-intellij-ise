import java.util.Scanner;

public class zooExercise1
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Hello, and welcome to the Mesozoic Eden Park Zoo- where you all are welcome!\n\n" +
                "To start your journey, please select from one of the following options: \n\n" +
                "1. Enter the zoo.");

        int enter = sc.nextInt();
        switch (enter)
        {
            case 1:
                System.out.println("\nMay I please have your first and last name, in the format ´firstName, lastName´?");
                String name = sc.next();

                String[] parts = name.split(",");
                String firstName = parts[0].trim();

                System.out.println("Welcome " + firstName + "!\n\n" +
                        "Is anybody else joining you today to visit the zoo?");
                String people = sc.next();

                boolean placeholder = true;
                while(placeholder)
                {

                    if (people.equalsIgnoreCase("yes")) {
                        System.out.println("\nThat is great to hear! It is always nice to see more people visiting the zoo!");
                        System.out.print("How many people are you bringing?");
                        int numPeople = sc.nextInt();
                        sc.nextLine();
                        System.out.println("\n\n");

                        String[] names = new String[numPeople];
                        int[] ages = new int[numPeople];

                        for (int i = 0; i < numPeople; i++) {
                            System.out.print("Enter name of person " + (i + 1) + ": ");
                            names[i] = sc.nextLine();

                            System.out.print("Enter age of " + names[i] + ": ");
                            ages[i] = sc.nextInt();
                            sc.nextLine();
                        }

                        for (int i = 0; i < numPeople; i++) {
                            System.out.println("\n\nGreat to meet you, " + names[i] + "!");
                        }

                        int minors = 0;
                        int majors = 0;

                        for (int age : ages) {
                            if (age < 18) {
                                minors++;
                            }

                            if (age > 18) {
                                majors++;
                            }
                        }

                        System.out.println("\n\n");
                        System.out.println("You had " + minors + " minor people!");
                        System.out.println("You had " + majors + " people over 18 years of age!");

                        int cost = (10 * minors) + (20 * majors);

                        System.out.println("The price for adults is 20$ and for minors it is 10$. This means your total amount is " + cost +
                                " euros.");

                        System.out.println("Please pay now. Enter the amount you owe.\n");
                        int owe = sc.nextInt();
                        sc.nextLine();

                        while (owe > owe - cost) {
                            owe -= cost;
                            System.out.println("You owe " + owe + "!");
                        }

                        System.out.println("Thank you! You may now enter the zoo. Enjoy!");

                    }

                    else if (people.equalsIgnoreCase("no"))
                    {
                        placeholder = false;
                    }
                }
        }
    }
}