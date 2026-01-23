package task03;

import java.util.ArrayList;
import java.util.List;

public class BloodDB implements DB {

    private final List<BloodSample> samples = new ArrayList<>();

    public BloodDB() {
        samples.add(new BloodSample(1, "A", "+", "Alex", "Dr. House", "City Hospital"));
        samples.add(new BloodSample(2, "B", "-", "Bob", "Dr. Wilson", "Central Clinic"));
    }

    @Override
    public BloodSample getById(int id) {
        for (BloodSample s : samples) {
            if (s != null && s.toString().contains("id=" + id)) {
                return s;
            }
        }
        return null;
    }
}
