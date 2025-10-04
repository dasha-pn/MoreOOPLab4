package lab4.characters;

import lab4.kickstrategy.PowerHitStrategy;

public class Knight extends Noble {

    public Knight() {
        super(2, 12, 1, 12, new PowerHitStrategy());
    }

    @Override
    public void kick(Character c) {
        kickStrategy.kick(this, c);
    }
}
