package lab4.characters;

import lab4.kickstrategy.KickStrategy;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Getter
@AllArgsConstructor
@NoArgsConstructor
public abstract class Character {
    @Setter
    protected int power;

    protected int hp;

    public void setHp(int hp) {
        this.hp = Math.max(0, hp);
    }

    protected KickStrategy kickStrategy;

    public abstract void kick(Character c);

    public boolean isAlive() {
        return this.hp > 0;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + "{hp=" + hp + ", power=" + power + "}";
    }
}
