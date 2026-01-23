package task04.creature;

import task04.move.MoveLogic;
import task04.sound.SoundLogic;

public class Cow extends Creature {

    public Cow(MoveLogic moveLogic, SoundLogic soundLogic) {
        super(moveLogic, soundLogic);
    }

    @Override
    public String getName() {
        return "Корова";
    }

    public void giveMilk() {
        System.out.println(getName() + " дает молоко.");
    }
}
