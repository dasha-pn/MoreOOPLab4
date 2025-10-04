package lab4.characters;
import lab4.kickstrategy.ElfKickStrategy;

public class Elf extends Character {

    public Elf() {
        this.power = 10;
        this.hp = 10;
        this.kickStrategy = new ElfKickStrategy();
    }

    @Override
    public void kick(Character enemy) {
        kickStrategy.kick(this, enemy);
    }
}
