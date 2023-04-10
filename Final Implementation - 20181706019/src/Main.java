import java.util.ArrayList;
import java.util.Scanner;

//Abdurrahman Arif Demirel 20181706019
//Warrior Game

public class Main {


    public static void main(String args[]) {
        ArrayList<Warrior> Warriors = new ArrayList<Warrior>(); // Create an ArrayList object
        Warriors.add(new Janissary());
        Warriors.add(new Viking());
        Warriors.add(new Viking());

        Scanner scanner = new Scanner(System.in);

        while (true) {

            for (Warrior m : Warriors) {
                if (m.isAlive) { // Firstly we have to check our warrior dead or alive
                    for (Warrior n : Warriors) {
                        if (n.isAlive) { //Secondly we are checking the target
                            if (m != n) {
                                System.out.println("Do you want to attack " + n + " with " + m);
                                System.out.println("Yes or No?");
                                String input = scanner.next();
                                if (input.toLowerCase().equals("yes")) {
                                    m.Attack(n);
                                    System.out.println("Health: " + n.health);
                                }
                            }
                        }
                    }
                }
            }
        }
    }
}