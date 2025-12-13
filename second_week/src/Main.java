private class Person {
    private String firstName;
    private String lastName;
    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }
    private String getFirstName() {
        return firstName;
    }
    private String getLastName() {
        return lastName;
    }
    private String getFullName(){
        return firstName + " " + lastName;
    }
}

public static void printHydrogenInfo() {
    System.out.println("Hydrogen:");
    System.out.println("This is a chemical element of the periodic system with the designation H and atomic number 1.");
    System.out.println("Is the lightest element in the table.");
    System.out.println("Hydrogen is used in:");
    System.out.println("-Chemical industry;");
    System.out.println("-Oil refining industry;");
    System.out.println("-Aviation;");
    System.out.println("-Electricity.");
}

public static void printJavaInfo() {
    System.out.println("Java Island:");
    System.out.println("Included in Indonesia.");
    System.out.println("The states of Mataram, Majapahit, Demak originated on the island.");
    System.out.println("Java is the most populated island in the world:");
    System.out.println("The total population is 140 million people.");
    System.out.println("Population density - 1061 people/km²");
    System.out.println("One of the famous varieties of coffee, Kopi Luwak, is produced here.");
}

public static void print1(){
    System.out.println("I am a poet, my name is Tsvetik.");
    System.out.println("Hello from me to you all.");
}

public static void printPersonInfo(String name, String surname, String meal){
    System.out.println("Brief Dossier:");
    System.out.println("Name: " + name);
    System.out.println("LastName: " + surname);
    System.out.println("Favorite dish: " + meal);
}

public static void createCrew(String navigator, String pilot, String secondPilot, String flightEngineer){
    System.out.println("The four to conquer space:");
    System.out.println("Navigator: " + navigator);
    System.out.println("Pilot: " + pilot);
    System.out.println("Co-pilot: " + secondPilot);
    System.out.println("Flight Engineer: " + flightEngineer);
}

public static void printArray(int[] array) {
    for (int i : array) {
        System.out.print(i + ", ");
    }
    System.out.println();
}

public static void reverseArray(int[] array) {
    for (int i = 0; i < array.length / 2; i++) {
        int temp = array[i];
        array[i] = array[array.length - 1 - i];
        array[array.length - 1 - i] = temp;
    }
}

public static void universalMethod(){}

public static void universalMethod(int num){}

public static void universalMethod(String name){}

public static void universalMethod(Boolean bool){}

public static void universalMethod(int num, String name){}

public static void universalMethod(int num, Boolean bool){}

public static void universalMethod(String name, int num){}

public static void universalMethod(Boolean bool, int num){}

public static void universalMethod(int num, String name, Boolean bool){}

public static void universalMethod(int num, Boolean bool, String name){}

public static void signIn(String username){
    if(username.equalsIgnoreCase("user")){
        return;
    }
    System.out.println("Welcome " + username);
    System.out.println("Missed you very much, " + username);
}

public static long cube(long num) {
    return num * num * num;
}

public static int getMaxValue(int[] array) {
    int max = Integer.MIN_VALUE;
    for (int value : array) {
        if (value > max) {
            max = value;
        }
    }
    return max;
}
public static int getMinValue(int[] array) {
    int min = Integer.MAX_VALUE;
    for (int value : array) {
        if (value < min) {
            min = value;
        }
    }
    return min;
}
public static void printArray2(int[] array) {
    for (int i : array) {
        System.out.print(i + " ");
    }
    System.out.println();
}

public static void printSqrt(int[] array) {
    String line = "The square root for the number ";
    for (int i = 0; i < array.length; i++) {
        int element = array[i];
        double elementSqrt = Math.sqrt(element);
        System.out.println(line + element + " equals " + elementSqrt);
    }
}

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

//Task 2
//public class Terran {}
//public  class Human extends Terran {}
//public class Woman extends Human { }

//Task 3
public class Vehicle {
    double maxSpeed;
}
public class Car extends Vehicle {
    int wheelCount;
    double weight;
}

public class ElectricCar extends Car {
    int electricEnginePower;
}

//Task 4
public class Entity {
    public void move(){
        System.out.println("I'm moving.");
    }
    public void eat(){
        System.out.println("I'm eating.");
    }
}

public class Human extends Entity {
    public void speak(){
        System.out.println("I can communicate.");
    }
}

public class JavaDeveloper extends Human {
    public void code(){
        System.out.println("I know how to communicate in Java.");
    }
}


void main () {
    Scanner scan = new Scanner (System.in);

    printHydrogenInfo();
    printJavaInfo();

    print1();

    String firstName = "Olga";
    String lastName = "Kipriyanovna";
    String favoriteDish = "Dumplings";
    printPersonInfo(firstName, lastName, favoriteDish);

    String navigator = "John";
    String pilot = "Gender";
    String secondPilot = "George";
    String flightEngineer = "Ringo";
    createCrew(navigator, pilot, secondPilot, flightEngineer);

    int[] array = {11, 22, 33, 44, 55, 55, 66, 77, 88, 99};
    printArray(array);
    reverseArray(array);
    printArray(array);

    signIn("user");

    System.out.println(cube(3));

    Person person = new Person("Ivan", "Ivanov");
    System.out.println("Dossier.");
    System.out.println("Name: " + person.getFirstName());
    System.out.println("LastName: " + person.getLastName());
    System.out.println("Full name: " + person.getFullName());

    int[] array2 = {123, 7, -14, 67, 16, 98, 75, 576};
    System.out.println("In array: ");
    printArray2(array2);
    System.out.println("Minimum number: " + getMinValue(array2));
    System.out.println("Maximum number: " + getMaxValue(array2));

    int[] array3 = {15,64,9,51,42};
    printSqrt(array3);

    Solution.printCityPopulation("Jakarta", 25.3);
    Solution.printCityPopulation("Seoul", 25.2);
    Solution.printCityPopulation("Delhi", 23.1);
    Solution.printCityPopulation("New York", 21.6);

    String s1 = new String();
    String s2 = new String();
    String s3 = new String();
    String s4 = new String();
    String s5 = new String();
    String s6 = new String();
    String s7 = new String();
    String s8 = new String();
    String s9 = new String();
    String s10 = new String();

    int[] arr1 = new int[]{};
    int[] arr2 = new int[]{};
    int[] arr3 = new int[]{};
    int[] arr4 = new int[]{};
    int[] arr5 = new int[]{};

    Scanner scan1 = new Scanner(System.in);
    Scanner scan2 = new Scanner(System.in);
}