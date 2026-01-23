package task12;

import java.util.Set;

public class Solution {
    public static void main(String[] args) {
        Bowling bowling = new Bowling(3);

        Track track = bowling.acquireTrack();
        Set<PairOfShoes> shoes = bowling.acquireShoes(2);

        bowling.releaseTrack(track);
        bowling.releaseShoes(shoes);
    }
}
