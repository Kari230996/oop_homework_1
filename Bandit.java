import java.util.Random;

public class Bandit extends Character {
    public Bandit(int strength, int health, int intelligence, int agility) {
        super(strength, health, intelligence, agility);

    }

    // Действие

    @Override
    public void attack(Character enemy) {
        int damage = new Random().nextInt(this.getStrength() * 2) + 1;
        System.out.println("Bandit attacks " + enemy.getClass().getSimpleName() + " with a damage of " + damage);
        enemy.takeDamage(damage);
    }

    @Override
    public void defend() {
        this.setHealth(this.getHealth() + 1);
        System.out.println("Bandit uses defend. Health is increased by 1.");
    }

    @Override
    public void takeDamage(int damage) {
        this.setHealth(this.getHealth() - damage);
        System.out.println(
                this.getClass().getSimpleName() + " takes " + damage + " damage. Health is now " + this.getHealth());
    }

    public void useSpecialAbility(Character enemy) {

        int damage = new Random().nextInt(this.getAgility() * 3) + 1;
        System.out.println("Bandit uses special ability. Dealing " + damage + " damage.");
        enemy.takeDamage(damage);

    }
}
