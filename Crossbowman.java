public class Crossbowman extends Character {
    public Crossbowman(int strength, int health, int intelligence, int agility) {
        super(strength, health, intelligence, agility);
    }

    @Override
    public void attack(Character enemy) {
        int damage = this.getStrength() + this.getIntelligence();
        System.out.println("Crossbowman attacks " + enemy.getClass().getSimpleName() + " with a damag of " + damage);
        enemy.takeDamage(damage);

    }

    @Override
    public void defend() {
        this.setAgility(this.getAgility() + 1);
        System.out.println("Crossbowman uses defend. Agility is increased by 1.");

    }

    @Override
    public void takeDamage(int damage) {
        this.setHealth(this.getHealth() - damage);
        System.out.println(this.getClass().getSimpleName() + " takes " + damage + " damage. Health is now " + this.getHealth());
    }

    @Override
    public void useSpecialAbility(Character enemy) {
        int damage = this.getIntelligence() * 3;
        System.out.println("Crossbowman uses special ability. Dealing " + damage + " damage.");
    }

}
