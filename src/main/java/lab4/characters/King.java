package lab4.characters;

import lab4.kickstrategy.PowerHitStrategy;

public class King extends Noble {
    public King() {
        super(5, 15, 5, 15, new PowerHitStrategy());
    }

    @Override
    public void kick(Character c) {
        kickStrategy.kick(this, c);    
    }
}
