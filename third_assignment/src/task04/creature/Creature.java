package task04.creature;

import task04.move.MoveLogic;
import task04.sound.SoundLogic;

public abstract class Creature {
    protected MoveLogic moveLogic;
    protected SoundLogic soundLogic;

    public Creature(MoveLogic moveLogic, SoundLogic soundLogic) {
        this.moveLogic = moveLogic;
        this.soundLogic = soundLogic;
    }

    public abstract String getName();

    public void howDoIMove() {
        moveLogic.move(getName());
    }

    public void howDoISound() {
        soundLogic.sound(getName());
    }
}
