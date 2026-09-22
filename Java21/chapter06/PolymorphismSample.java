package chapter06;

public class PolymorphismSample {

    public static void main(String[] args) {
        Character[] characters = {
                new Knight("さとし", 100, 0),
                new Priest("かずなり", 100, 100),
                new Magician("じゅん", 100, 100),
                new Character("まなぶ", 100, 0)
        };

        for(Character character : characters) {
            character.attack();
        }

    }

}