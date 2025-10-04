package lab4.kickstrategy;
import lab4.characters.Character;

@FunctionalInterface
public interface KickStrategy {
    void kick(Character whoKick, Character whoIsKicked);
}
