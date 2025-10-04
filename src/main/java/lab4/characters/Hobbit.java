package lab4.characters;

import lab4.kickstrategy.CryStrategy;

public class Hobbit extends Character {
    public Hobbit() {
        this.power = 0;
        this.hp = 3;
        this.kickStrategy = new CryStrategy();
    }

    @Override
    public void kick(Character c) {
        kickStrategy.kick(this, c);    
    }
}

