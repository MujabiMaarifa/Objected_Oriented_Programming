import java.util.Scanner;

//create a program that calculates the average age of students in a class from user input
class Ages{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);


        System.out.println("\nStudent ages: ");
        int[] ages = {23, 24, 25 , 26, 27};




        for(int age : ages)
        {
            System.out.println(age);
        }

        int i,sum=0;
        for(i=0; i<ages.length; i++){
            sum+=ages[i];

        }
        System.out.println("\nThe sum of ages: "+sum);

    }
}