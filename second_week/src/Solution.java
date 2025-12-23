public class Solution {
    public static String city = "Tokyo";
    public static double population = 34.5;


    public static void printCityPopulation(String city, double population) {
        System.out.println("The population of the city " + city + " is " + population + " million people.");
        System.out.println("While the most populous city " + getCity() + " has a population of " + getPopulation() + " million people.");
    }

    public static String getCity() {
        return city;
    }

    public static double getPopulation() {
        return population;
    }
}