import java.util.Scanner;

public class UserInput {
    public static void main(String[] args){
        //create scanner object
        Scanner scanner = new Scanner(System.in);
        String name;
        int age;
        boolean citizen;

        System.out.println("Enter your name: ");
        name = scanner.nextLine();

        System.out.println("Enter your age: ");
        age = scanner.nextInt();

        System.out.println("Are you a citizen (true/false)? : ");
        citizen = scanner.nextBoolean();

        var message = (age > 18 && citizen) ? "You are elgible to vote" : "You are not eligible to vote or you are not a citizen";
        System.out.println(message);
        scanner.close();
    }
}