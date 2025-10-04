package ua.edu.ucu.apps.lab4.strategy;
public class ElfKickStrategy extends KickStrategy{
    @Override
    public void kick(ua.edu.ucu.apps.lab4.Character main, ua.edu.ucu.apps.lab4.Character enemy) {
        if (enemy.getPower() < main.getPower()) {
            enemy.setHp(0);
            System.out.println("Elf kills " + enemy.getClass().getSimpleName() + " (weaker enemy)!");
        } else {
            enemy.setPower(Math.max(0, enemy.getPower() - 1));
            System.out.println("Elf decreases " + enemy.getClass().getSimpleName() + "'s power by 1!");
        }
    }
}
