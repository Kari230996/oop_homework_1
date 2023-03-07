public class Spearman extends Character{
    public Spearman(int strength, int health, int intelligence, int agility) {
        super(strength, health, intelligence, agility);
    }

    @Override
    public void attack(Character enemy) {
        int damage = this.getStrength() * 2;
        System.out.println("Spearman attacks " + enemy.getClass().getSimpleName() + " with a damage of " + damage);
        enemy.takeDamage(damage);
    }

    @Override
    public void defend() {
        int damageReduced = this.getStrength() / 2;
        System.out.println("Spearman uses defend. Damage reduced by " + damageReduced);
        this.setHealth(this.getHealth() + damageReduced);
    }

    @Override
    public void takeDamage(int damage) {
        this.setHealth(this.getHealth() - damage);
        System.out.println(this.getClass().getSimpleName() + " takes " + damage + " damage. Health is now " + this.getHealth());
    }

    @Override
    public void useSpecialAbility(Character enemy) {
        System.out.println("Spearman uses special ability. Attack damage increased by 50%");
        this.setStrength((int) (this.getStrength() * 1.5));
    }
}
