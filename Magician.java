public class Magician extends Character{
    public Magician(int strength, int health, int intelligence, int agility) {
        super(strength, health, intelligence, agility);
    }

    @Override
    public void attack(Character enemy) {
        int damage = this.getIntelligence() * 2;
        System.out.println("Magician attacks " + enemy.getClass().getSimpleName() + " with a damage of " + damage);
        enemy.takeDamage(damage);
    }

    @Override
    public void defend() {
        this.setAgility(this.getAgility() + 1);
        System.out.println("Magician uses defend. Agility is increased by 1.");
    }

    @Override
    public void takeDamage(int damage) {
        this.setHealth(this.getHealth() - damage);
        System.out.println(this.getClass().getSimpleName() + " takes " + damage + " damage. Health is now " + this.getHealth());
    }

    @Override
    public void useSpecialAbility(Character enemy) {
        int healthRestored = this.getIntelligence() * 2;
        System.out.println("Magician uses special ability. Restoring " + healthRestored + " health.");
        this.setHealth(this.getHealth() + healthRestored);
    }
}
