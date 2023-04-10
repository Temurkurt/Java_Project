import java.util.Scanner;

public class Janissary extends Warrior {

    //Constructor of Janissary
    //In this constructor variables using from parent class via inheritance
    public Janissary(){
        Scanner scanner = new Scanner(System.in); // We defined a scanner to read our values

        isAlive = true;

        System.out.println("Please enter a health value for your Janissary.");
        boolean isHealthValid = false;
        do {
            String temp = scanner.nextLine();

            try {
                this.health = Integer.parseInt(temp);
                isHealthValid = true;
            }
            catch (NumberFormatException nfe) { // We are checking the input is integer or not
                isHealthValid = false;
                System.out.println("Health is not valid!");
            }
        }while (!isHealthValid);

        System.out.println("Please enter a attack rate value for your Janissary.");
        boolean isAttackRateValid = false;
        do {
            String temp = scanner.nextLine();

            try {
                this.attack_rate = Integer.parseInt(temp);
                isAttackRateValid = true;
            }
            catch (NumberFormatException nfe) { // We are checking the input is integer or not
                isAttackRateValid = false;
                System.out.println("Attack Rate is not valid!");
            }
        }while (!isAttackRateValid);

        System.out.println("Please enter a defense rate value for your Janissary.");
        boolean isDefenseRateValid = false;
        do {
            String temp = scanner.nextLine();

            try {
                this.defense_rate = Integer.parseInt(temp);
                isDefenseRateValid = true;
            }
            catch (NumberFormatException nfe) { // We are checking the input is integer or not
                isDefenseRateValid = false;
                System.out.println("Defense Rate is not valid!");
            }
        }while (!isDefenseRateValid);
    }

    //We are using these from parent class via inheritance.
    @Override
    protected void Attack(Warrior target) {
        System.out.println("Get aim, fire! Muskets are on the target. Janissary attacked.");
        target.Defend(attack_rate);
    }
    @Override
    protected void Defend(int taken_damage){
        System.out.println("Seems like real defense not a another hit and run tactic. Janissary defended himself.");
        int absolute_damage = taken_damage - defense_rate; // We are calculating the absolute damage with difference of the defence rate and taken damage.
        if (absolute_damage > 0) { // if target got damage
            if(health - absolute_damage > 0){ // life check
                health -= absolute_damage; // damage taken by target
            }
            else {
                health = 0;
                isAlive = false; // target is KIA
            }
        }
    }
}

