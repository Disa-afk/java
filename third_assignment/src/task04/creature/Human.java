package task04.creature;

import task04.move.MoveLogic;
import task04.sound.SoundLogic;

public class Human extends Creature {

    public Human(MoveLogic moveLogic, SoundLogic soundLogic) {
        super(moveLogic, soundLogic);
    }

    @Override
    public String getName() {
        return "Человек";
    }

    public void searchMeaningOfLife() {
        System.out.println(getName() + " ищет смысл жизни.");
    }
}
