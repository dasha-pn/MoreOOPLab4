package lab4.characters;

import java.util.concurrent.ThreadLocalRandom;
import lab4.kickstrategy.KickStrategy;

public abstract class Noble extends Character {
    protected Noble(int minPower, int maxPower, int minHp, int maxHp, KickStrategy strategy) {
        this.power = randIn(minPower, maxPower);
        this.hp = randIn(minHp, maxHp);
        this.kickStrategy = strategy;
    }

    private static int randIn(int min, int max) {
        return ThreadLocalRandom.current().nextInt(min, max + 1);
    }
}
