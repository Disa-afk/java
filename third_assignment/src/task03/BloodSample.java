package task03;

public class BloodSample {

    private final int id;
    private final String group;
    private final String rhesus;
    private final String owner;
    private final String doctor;
    private final String hospital;

    public BloodSample(int id, String group, String rhesus,
                       String owner, String doctor, String hospital) {
        this.id = id;
        this.group = group;
        this.rhesus = rhesus;
        this.owner = owner;
        this.doctor = doctor;
        this.hospital = hospital;
    }

    @Override
    public String toString() {
        return "BloodSample{" +
                "id=" + id +
                ", group='" + group + '\'' +
                ", rhesus='" + rhesus + '\'' +
                ", owner='" + owner + '\'' +
                ", doctor='" + doctor + '\'' +
                ", hospital='" + hospital + '\'' +
                '}';
    }
}
