public class Peasant extends Character{
    public Peasant(int strength, int health, int intelligence, int agility) {
        super(strength, health, intelligence, agility);
    }

    
    // Действия
    @Override
    public void attack(Character enemy) {
        // Крестьянин не атакует
    }

    @Override
    public void defend() {
        // Крестьянин не защищается
    }

    @Override
    public void takeDamage(int damage) {
        this.setHealth(this.getHealth() - damage);
        System.out.println(this.getClass().getSimpleName() + " takes " + damage + " damage. Health is now " + this.getHealth());
    }

    @Override
    public void useSpecialAbility(Character enemy) {
        // Крестьянин не имеет специальных возможностей
    }
}
