package task04;

import task04.creature.Cow;
import task04.move.Fly;
import task04.sound.Meow;

public class Solution {
    public static void main(String[] args) {
        Cow cow = new Cow(new Fly(), new Meow());
        cow.howDoIMove();
        cow.howDoISound();
        cow.giveMilk();
    }
}
