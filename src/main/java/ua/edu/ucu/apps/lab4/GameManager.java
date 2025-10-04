package ua.edu.ucu.apps.lab4;

public class GameManager {
    public void fight(Character c1, Character c2) {
        System.out.println("\n=== FIGHT BEGINS ===");
        System.out.println(c1.getClass().getSimpleName() + 
                         " (HP: " + c1.getHp() + ", Power: " + c1.getPower() + ")");
        System.out.println("VS");
        System.out.println(c2.getClass().getSimpleName() + 
                         " (HP: " + c2.getHp() + ", Power: " + c2.getPower() + ")");
        System.out.println("===================\n");
        
        int round = 1;
        while (c1.isAlive() && c2.isAlive()) {
            System.out.println("--- Round " + round + " ---");
            
            // Character 1 attacks
            if (c1.isAlive()) {
                c1.kick(c2);
                System.out.println(c2.getClass().getSimpleName() + 
                                 " HP: " + c2.getHp() + ", Power: " + c2.getPower());
            }
            
            // Character 2 attacks if still alive
            if (c2.isAlive()) {
                c2.kick(c1);
                System.out.println(c1.getClass().getSimpleName() + 
                                 " HP: " + c1.getHp() + ", Power: " + c1.getPower());
            }
            
            System.out.println();
            round++;
        }
        
        System.out.println("=== FIGHT ENDS ===");
        if (c1.isAlive()) {
            System.out.println(c1.getClass().getSimpleName() + " WINS!");
        } else if (c2.isAlive()) {
            System.out.println(c2.getClass().getSimpleName() + " WINS!");
        } else {
            System.out.println("DRAW! Both characters defeated!");
        }
        System.out.println("==================\n");
    }
}