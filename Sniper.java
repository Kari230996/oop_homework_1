public class Sniper extends Character{
    public Sniper(int strength, int health, int intelligence, int agility) {
        super(strength, health, intelligence, agility);
    }
    // Действия
    @Override
    public void attack(Character enemy) {
        int damage = this.getStrength() * 3;
        System.out.println("Sniper attacks " + enemy.getClass().getSimpleName() + " with a damage of " + damage);
        enemy.takeDamage(damage);
    
    }

    @Override
    public void defend() {
        this.setAgility(this.getAgility() + 1);
        System.out.println("Sniper uses defend. Agility is increased by 1.");
    }

    @Override
    public void takeDamage(int damage) {
        this.setHealth(this.getHealth() - damage);
        System.out.println(this.getClass().getSimpleName() + " takes " + damage + " damage. Health is now " + this.getHealth());
    }

    @Override
    public void useSpecialAbility(Character enemy) {
        int damage = this. getIntelligence() * 2;
        System.out.println("Sniper uses special ability. Dealing " + damage + " damage.");
        
    }
}
