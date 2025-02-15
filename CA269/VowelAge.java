import java.util.Scanner;

public class VowelAge {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String name = input.nextLine();
        int age = input.nextInt();

        int vowelCounter = 0;

        for (int i = 0; i < name.length(); i++) {
            if (name.toLowerCase().charAt(i)=='a'||name.toLowerCase().charAt(i)=='e'||name.toLowerCase().charAt(i)=='i'||name.toLowerCase().charAt(i)=='o'||name.toLowerCase().charAt(i)=='u') {
                vowelCounter++;
            }
        }

        if (age < 18) {
            System.out.println("Hello " + name + ", you have " + vowelCounter + " vowels, and you are a minor");
        }

        else {
            System.out.println("Hello " + name + ", you have " + vowelCounter + " vowels, and you are an adult");
        }
    }


}