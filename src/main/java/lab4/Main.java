package lab4;

import lab4.characters.Character;
import lab4.factory.CharacterFactory;

public class Main {
    public static void main(String[] args) {
        Character c1 = CharacterFactory.createCharacter();
        Character c2 = CharacterFactory.createCharacter();
        new GameManager().fight(c1, c2);
    }
}
