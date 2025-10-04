package lab4.kickstrategy;

import java.util.concurrent.ThreadLocalRandom;
import lab4.characters.Character;

public class PowerHitStrategy implements KickStrategy {
    @Override
    public void kick(Character whoKick, Character whoIsKicked) {
        int max = Math.max(1, whoKick.getPower());
        int dmg = ThreadLocalRandom.current().nextInt(1, max + 1);
        whoIsKicked.setHp(whoIsKicked.getHp() - dmg);
    }
}
