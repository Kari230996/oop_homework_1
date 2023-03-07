public class Monk extends Character{
    public Monk(int strength, int health, int intelligence, int agility) {
        super(strength, health, intelligence, agility);
    }

    @Override
    public void attack(Character enemy) {
        int damage = this.getStrength() + this.getAgility();
        System.out.println("Monk attacks " + enemy.getClass().getSimpleName() + " with a damage of " + damage);
        enemy.takeDamage(damage);
    }

    @Override
    public void defend() {
        int damageReduced = this.getAgility() * 2;
        System.out.println("Monk uses defend. Damage reduced by " + damageReduced);
        this.setHealth(this.getHealth() + damageReduced);
    }

    @Override
    public void takeDamage(int damage) {
        this.setHealth(this.getHealth() - damage);
        System.out.println(this.getClass().getSimpleName() + " takes " + damage + " damage. Health is now " + this.getHealth());
    }

    @Override
    public void useSpecialAbility(Character enemy) {
        int agilityIncreased = this.getIntelligence() * 2;
        System.out.println("Monk uses special ability. Agility increased by " + agilityIncreased);
        this.setAgility(this.getAgility() + agilityIncreased);
    }

}
