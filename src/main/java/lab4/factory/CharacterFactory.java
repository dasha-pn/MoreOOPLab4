package lab4.factory;

import lab4.characters.Character;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ThreadLocalRandom;
import org.reflections.Reflections;
import lombok.SneakyThrows;

public class CharacterFactory {

    private static final String CHAR_PACKAGE = "lab4.characters";

    @SneakyThrows
    public static Character createCharacter() {
        List<Class<? extends Character>> characters = getAllConcreteCharacters();

        if (characters.isEmpty()) {
            throw new IllegalStateException(
                "No concrete Character subclasses found in package: " + CHAR_PACKAGE
            );
        }

        int idx = ThreadLocalRandom.current().nextInt(characters.size());
        Class<? extends Character> cur_character = characters.get(idx);
        return cur_character.getDeclaredConstructor().newInstance();
    }

    private static List<Class<? extends Character>> getAllConcreteCharacters() {
        Reflections reflections = new Reflections(CHAR_PACKAGE);

        Set<Class<? extends Character>> subTypes = reflections.getSubTypesOf(Character.class);
        List<Class<? extends Character>> concrete = new ArrayList<>();

        for (Class<? extends Character> cl : subTypes) {
            if (!Modifier.isAbstract(cl.getModifiers())) {
                concrete.add(cl);
            }
        }
        return concrete;
    }
}
