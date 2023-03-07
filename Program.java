
public class Program {
    public static void main(String[] args) {

        Peasant peasant = new Peasant(10, 100, 5, 10);
        Sniper sniper = new Sniper(15, 80, 10, 20);
        Bandit bandit = new Bandit(12, 90, 8, 18);
        Crossbowman crossbowman = new Crossbowman(13, 85, 9, 22);
        Magician magician = new Magician(8, 75, 20, 15);
        Monk monk = new Monk(11, 95, 12, 25);
        Spearman spearman = new Spearman(14, 88, 7, 16);
        
        
        // Бандит атакует крестьянина
        bandit.attack(peasant);

        // Арбалетчик атакует Арбалетчика
        crossbowman.attack(sniper);

        // Колдун использует специальную способность на копейщике
        magician.useSpecialAbility(spearman);

        // Монах защищается
        monk.defend();

        // Снайпер получает урон
        sniper.takeDamage(20);

        // Копейщик атакует бандита
        spearman.attack(bandit);

        // Крестьянин получает урон
        peasant.takeDamage(15);

        // Распечатает текущее здоровье всех персонажей
        System.out.println("Peasant health: " + peasant.getHealth());
        System.out.println("Sniper health: " + sniper.getHealth());
        System.out.println("Bandit health: " + bandit.getHealth());
        System.out.println("Crossbowman health: " + crossbowman.getHealth());
        System.out.println("Magician health: " + magician.getHealth());
        System.out.println("Monk health: " + monk.getHealth());
        System.out.println("Spearman health: " + spearman.getHealth());
    }


}
    
    

    

