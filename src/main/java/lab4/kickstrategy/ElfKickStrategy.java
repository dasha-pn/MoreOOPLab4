package lab4.kickstrategy;
import lab4.characters.Character;

public class ElfKickStrategy implements KickStrategy {
    @Override
    public void kick(Character whoKick, Character whoIsKicked) {
        if (whoIsKicked.getPower() < whoKick.getPower()) {
            whoIsKicked.setHp(0);
        } else {
            int newPower = Math.max(0, whoIsKicked.getPower() - 1);
            whoIsKicked.setPower(newPower);
        }
    }
}
