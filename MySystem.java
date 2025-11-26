import java.util.Scanner;
class MySystem{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        boolean isLoggedin = true;
        boolean isAdmin = false;
        int securityLevel;

        System.out.println("Enter security level(1-3): ");
        securityLevel = input.nextInt();

        String Access = (isLoggedin &&(isAdmin && securityLevel <= 2)) ? "Access Granted" : "Access Denied";
        System.out.println(Access);

        input.close();
    }
}