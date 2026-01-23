package task12;

import java.util.*;

public class Bowling {

    private final Queue<Track> tracks = new LinkedList<>();
    private final Queue<PairOfShoes> shoesShelf = new LinkedList<>();

    public Bowling(int tracksNumber) {
        for (int i = 1; i <= tracksNumber; i++) {
            tracks.add(new Track(i));
        }
        for (int size = 38; size <= 45; size++) {
            for (int i = 0; i < 50 / (45-38+1); i++) {
                shoesShelf.add(new PairOfShoes(size));
            }
        }
    }

    public synchronized Track acquireTrack() {
        Track track = tracks.poll();
        if (track != null) {
            track.setPrice(100 - tracks.size() * 10);
        }
        return track;
    }

    public synchronized void releaseTrack(Track track) {
        System.out.printf("C дорожки №%d сняли бронь\n", track.getNumber());
        tracks.offer(track);
    }

    public synchronized Set<PairOfShoes> acquireShoes(int number) {
        if (shoesShelf.size() < number) return null;
        Set<PairOfShoes> shoes = new HashSet<>();
        for (int i = 0; i < number; i++) {
            shoes.add(shoesShelf.poll());
        }
        return shoes;
    }

    public synchronized void releaseShoes(Set<PairOfShoes> shoes) {
        System.out.printf("В гардероб вернули %d пар обуви\n", shoes.size());
        shoesShelf.addAll(shoes);
    }
}
