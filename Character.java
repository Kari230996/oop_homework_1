

public abstract class Character {
    // Свойства
    private int strength;
    private int health;
    private int intelligence;
    private int agility;

    public Character(int strength, int health, int intelligence, int agility) {
        this.strength = strength;
        this.health = health;
        this.intelligence = intelligence;
        this.agility = agility;
    }

    // Методы
    public abstract void attack(Character enemy);

    public abstract void defend();

    public abstract void useSpecialAbility(Character enemy);

    public abstract void takeDamage(int damage);

    // Геттеры и сеттеры для свойств

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getIntelligence() {
        return intelligence;
    }

    public void setIntelligence(int intelligence) {
        this.intelligence = intelligence;
    }

    public int getAgility() {
        return agility;
    }

    public void setAgility(int agility) {
        this.agility = agility;
    }

}