//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    Scanner scan = new Scanner(System.in);

//    //1.1
//    String name;
//    int age;
//    String city;
//
//    //1.2
//    int a = 5;
//    int b = 8;
//
//    //1.3
//    int year = 3126;
//    int friendsAge = 8;
//    int yearBorn = year - friendsAge;
//    System.out.println(yearBorn);
//
//    //1.4
//    String word = "World";
//    String phrase = "Hello World";
//    String line = "Hello World, my name is Dias";
//    String text = "Hello World it's my first project in java";
//
//    //2.1
//    System.out.println("Enter temperature");
//    int temperatureOutside = scan.nextInt();
//    if (temperatureOutside < 0) {
//        System.out.println("It’s cold outside");
//    } else {
//        System.out.println("It’s warm outside.");
//    }
//
//    //2.2
//    System.out.println("Enter your name and age");
//    name = scan.next();
//    age = scan.nextInt();
//    if(age >= 18 && age <= 28) {
//        System.out.printf("%s, come to the military registration and enlistment office", name);
//        System.out.println();
//    }
//
//    //2.3
//    boolean isHigh, isLow;
//    System.out.println("Enter body temperature in Celsius");
//    double temperature = scan.nextDouble();
//    isHigh = temperature > 37.5;
//    isLow = temperature < 36.0;
//    if (isHigh) {
//        System.out.println("High temperature!");
//    }  else if (isLow) {
//        System.out.println("Low temperature!");
//    }  else {
//        System.out.println("Your temperature is normal.");
//    }
//
//    //2.4
//    System.out.println("Enter your age");
//    age = scan.nextInt();
//    if(age <= 20 || age >= 60) {
//        System.out.println("You don’t have to work.");
//    }
//
//    //2.5
//    int n = 0;
//    while (n < 100) {
//        System.out.println("I will never work for pennies.");
//        n++;
//    }
//
//    //2.6
//    int sum = 0;
//    System.out.println("Enter numbers or ENTER to exit");
//    while (true) {
//        String input = scan.next();
//        if (input.equalsIgnoreCase("ENTER")) {
//            break;
//        }
//        int temp = Integer.parseInt(input);
//        sum += temp;
//    }
//    System.out.println(sum);
//
//    //2.7
//    for (int i = 0; i < 5; i++) {
//        for (int j = 0; j < 10; j++) {
//            System.out.print("Q");
//        }
//        System.out.println();
//    }
//
//    //2.8
//    sum = 0;
//    for (int i = 0; i <= 100; i++) {
//        if(i % 3 == 0) {
//            continue;
//        }
//        sum += i;
//    }
//    System.out.println(sum);
//
//    //2.9
//    for (int i = 1; i < 15; i++) {
//        if (i % 2 == 0) {
//            System.out.println(i);
//        }
//    }
//
//    //2.10
//    System.out.print("Enter a start, end, multiple: ");
//    int start = scan.nextInt();
//    int end = scan.nextInt();
//    int multiple = scan.nextInt();
//    sum = 0;
//    for (int i = start; i < end; i++) {
//        if(i % multiple == 0) {
//            sum += i;
//        }
//    }
//    System.out.println(sum);

    //2.11
    for (int i = 10; i >= 1; i-=2) {
        for (int j = 10; j > i; j-=2) {
            System.out.print(" ");
        }
        for (int k = 0; k < i; k++) {
            System.out.print("8");
        }

        System.out.println();
    }
}
