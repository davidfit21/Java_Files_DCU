import java.util.Scanner;

class HelloWorld {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Name: ");
        String name = input.nextLine();
        System.out.print("Hello, World! ");
        System.out.println(name + " is now a Java programmer!");

        //int age = input.nextInt();
        //double price = input.nextDouble();
        //long id = input.nextLong();
        //boolean employed = input.nextBoolean();


    }
}