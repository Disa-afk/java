package task03;

public class Solution {

    public static void main(String[] args) {
        DB db = new BloodDBProxy();

        System.out.println(db.getById(1));
        System.out.println(db.getById(2));
    }
}
