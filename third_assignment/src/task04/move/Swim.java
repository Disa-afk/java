package task04.move;

public class Swim implements MoveLogic {
    @Override
    public void move(String name) {
        System.out.println(name + " гребет ластами.");
    }
}

