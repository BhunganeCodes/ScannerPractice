package za.co.bhunganecodes;

import java.util.Scanner;

class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        System.out.print("How tall are you?: ");
        double height = scanner.nextDouble();

        System.out.print("Are you amazing? (true/false): ");
        boolean isAmazing = scanner.nextBoolean();

        User user = new User(name, age, height);

        System.out.println(user.getAge());
        System.out.println(user.getName());
        System.out.println(user.getHeight());
        System.out.println(user.getIsAmazing());

        scanner.close();
    }
}
