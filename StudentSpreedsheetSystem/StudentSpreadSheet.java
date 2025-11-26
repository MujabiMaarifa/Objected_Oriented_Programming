import java.util.Scanner;

public class StudentSpreadSheet {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Header of the student marksheet
        System.out.println("\n\t\t\t\t Dedan Kimathi University of Technology");
        System.out.println("\t\t\t\t   School of Computer Science and IT");
        System.out.println("\t\t\t\t     Department of Computer Science");
        System.out.println("\t\t\t\t       Academic Year: 2024/2025");
        System.out.println("\t\t\t\t STUDENT MARKSHEET (SECOND YEAR RESULTS)\n");

        //student 1 details
        String regNo, fullName, status;
        char grade;
        double unit1, unit2, unit3, unit4, unit5, unit6, unit7;
        double total, average;
        //Input student details
        System.out.println("------- Student 1 Details:\n");
        System.out.print("Enter Registration Number: ");
        regNo = scanner.nextLine();
        System.out.print("Enter Full Name: ");
        fullName = scanner.nextLine();

        //student scores in the seven units
        System.out.print("\nEnter score for CCS2207: ");
        unit1 = scanner.nextDouble();
        System.out.print("Enter score for SMA2215: ");
        unit2 = scanner.nextDouble();
        System.out.print("Enter score for CCS2208: ");
        unit3 = scanner.nextDouble();
        System.out.print("Enter score for CCS2209: ");
        unit4 = scanner.nextDouble();
        System.out.print("Enter score for CCS2210: ");
        unit5 = scanner.nextDouble();
        System.out.print("Enter score for CCS2211: ");
        unit6 = scanner.nextDouble();
        System.out.print("Enter score for IGS2202: ");
        unit7 = scanner.nextDouble();

        //total and average
        total = unit1 + unit2 + unit3 + unit4 + unit5 + unit6 + unit7;
        average = total / 7;

        //student 2 details
        scanner.nextLine();
        System.out.println("\n------- Student 2 Details:\n");
        String regNo2, fullName2, status2;
        double unit1_2, unit2_2, unit3_2, unit4_2, unit5_2, unit6_2, unit7_2;
        double total2, average2;

        //Input student 2 details 
        System.out.print("Enter Registration Number: ");
        regNo2 = scanner.nextLine();
        System.out.print("Enter Full Name: ");
        fullName2 = scanner.nextLine();
        //student 2 scores in the seven units
        System.out.print("\nEnter score for CCS2207: ");
        unit1_2 = scanner.nextDouble();
        System.out.print("Enter score for SMA2215: ");
        unit2_2 = scanner.nextDouble();
        System.out.print("Enter score for CCS2208: ");
        unit3_2 = scanner.nextDouble();
        System.out.print("Enter score for CCS2209: ");
        unit4_2 = scanner.nextDouble();
        System.out.print("Enter score for CCS2210: ");
        unit5_2 = scanner.nextDouble();
        System.out.print("Enter score for CCS2211: ");
        unit6_2 = scanner.nextDouble();
        System.out.print("Enter score for IGS2202: ");
        unit7_2 = scanner.nextDouble();
        //total and average for student 2
        total2 = unit1_2 + unit2_2 + unit3_2 + unit4_2 + unit5_2 + unit6_2 + unit7_2;
        average2 = total2 / 7;

        //student 3 details
        scanner.nextLine();
        System.out.println("\n------- Student 3 Details:\n");
        String regNo3, fullName3, status3;
        double unit1_3, unit2_3, unit3_3, unit4_3, unit5_3, unit6_3, unit7_3;
        double total3, average3;

        System.out.print("Enter Registration Number: ");
        regNo3 = scanner.nextLine();
        System.out.print("Enter Full Name: ");
        fullName3 = scanner.nextLine();
        //student 3 scores in the seven units
        System.out.print("\nEnter score for CCS2207: ");
        unit1_3 = scanner.nextDouble();
        System.out.print("Enter score for SMA2215: ");
        unit2_3 = scanner.nextDouble();
        System.out.print("Enter score for CCS2208: ");
        unit3_3 = scanner.nextDouble();
        System.out.print("Enter score for CCS2209: ");
        unit4_3 = scanner.nextDouble();
        System.out.print("Enter score for CCS2210: ");
        unit5_3 = scanner.nextDouble();
        System.out.print("Enter score for CCS2211: ");
        unit6_3 = scanner.nextDouble();
        System.out.print("Enter score for IGS2202: ");
        unit7_3 = scanner.nextDouble();
        //total and average for student 3
        total3 = unit1_3 + unit2_3 + unit3_3 + unit4_3 + unit5_3 + unit6_3 + unit7_3;
        average3 = total3 / 7;

        //student 4 details
        scanner.nextLine();
        System.out.println("\n------- Student 4 Details:\n");
        String regNo4, fullName4, status4;
        double unit1_4, unit2_4, unit3_4, unit4_4, unit5_4, unit6_4, unit7_4;
        double total4, average4;

        System.out.print("Enter Registration Number: ");
        regNo4 = scanner.nextLine();
        System.out.print("Enter Full Name: ");
        fullName4 = scanner.nextLine();
        //student 4 scores in the seven units
        System.out.print("\nEnter score for CCS2207: ");
        unit1_4 = scanner.nextDouble();
        System.out.print("Enter score for SMA2215: ");
        unit2_4 = scanner.nextDouble();
        System.out.print("Enter score for CCS2208: ");
        unit3_4 = scanner.nextDouble();
        System.out.print("Enter score for CCS2209: ");
        unit4_4 = scanner.nextDouble();
        System.out.print("Enter score for CCS2210: ");
        unit5_4 = scanner.nextDouble();
        System.out.print("Enter score for CCS2211: ");
        unit6_4 = scanner.nextDouble();
        System.out.print("Enter score for IGS2202: ");
        unit7_4 = scanner.nextDouble();
        //total and average for student 4
        total4 = unit1_4 + unit2_4 + unit3_4 + unit4_4 + unit5_4 + unit6_4 + unit7_4;
        average4 = total4 / 7;

        //student 5 details
        scanner.nextLine();
        System.out.println("\n------- Student 5 Details:\n");
        String regNo5, fullName5, status5;
        double unit1_5, unit2_5, unit3_5, unit4_5, unit5_5, unit6_5, unit7_5;
        double total5, average5;

        System.out.print("Enter Registration Number: ");
        regNo5 = scanner.nextLine();
        System.out.print("Enter Full Name: ");
        fullName5 = scanner.nextLine();
        //student 5 scores in the seven units
        System.out.print("\nEnter score for CCS2207: ");
        unit1_5 = scanner.nextDouble();
        System.out.print("Enter score for SMA2215: ");
        unit2_5 = scanner.nextDouble();
        System.out.print("Enter score for CCS2208: ");
        unit3_5 = scanner.nextDouble();
        System.out.print("Enter score for CCS2209: ");
        unit4_5 = scanner.nextDouble();
        System.out.print("Enter score for CCS2210: ");
        unit5_5 = scanner.nextDouble();
        System.out.print("Enter score for CCS2211: ");
        unit6_5 = scanner.nextDouble();
        System.out.print("Enter score for IGS2202: ");
        unit7_5 = scanner.nextDouble();
        //total and average for student 5
        total5 = unit1_5 + unit2_5 + unit3_5 + unit4_5 + unit5_5 + unit6_5 + unit7_5;
        average5 = total5 / 7;

        //student score sheet
        System.out.println("\nStudent Score Sheet:\n");
        System.out.println("--------------------------------------------------------------------------------------------------------------------------------------\n");
        System.out.println("Reg No.\t\t\tFull Name\t\tCCS2207\tSMA2215\tCCS2208\tCCS2209\tCCS2210\tCCS2211\tIGS2202\tTotal\tAverage\tStatus\tGrade\n");
        System.out.println("--------------------------------------------------------------------------------------------------------------------------------------\n");
        System.out.printf("%s\t%s\t\t%.2f\t%.2f\t%.2f\t%.2f\t%.2f\t%.2f\t%.2f\t%.2f\t%.2f\n", regNo, fullName, unit1, unit2, unit3, unit4, unit5, unit6, unit7, total, average);
        System.out.printf("%s\t%s\t\t%.2f\t%.2f\t%.2f\t%.2f\t%.2f\t%.2f\t%.2f\t%.2f\t%.2f\n", regNo2, fullName2, unit1_2, unit2_2, unit3_2, unit4_2, unit5_2, unit6_2, unit7_2, total2, average2);
        System.out.printf("%s\t%s\t\t%.2f\t%.2f\t%.2f\t%.2f\t%.2f\t%.2f\t%.2f\t%.2f\t%.2f\n", regNo3, fullName3, unit1_3, unit2_3, unit3_3, unit4_3, unit5_3, unit6_3, unit7_3, total3, average3);
        System.out.printf("%s\t%s\t\t%.2f\t%.2f\t%.2f\t%.2f\t%.2f\t%.2f\t%.2f\t%.2f\t%.2f\n", regNo4, fullName4, unit1_4, unit2_4, unit3_4, unit4_4, unit5_4, unit6_4, unit7_4, total4, average4);
        System.out.printf("%s\t%s\t\t%.2f\t%.2f\t%.2f\t%.2f\t%.2f\t%.2f\t%.2f\t%.2f\t%.2f\n", regNo5, fullName5, unit1_5, unit2_5, unit3_5, unit4_5, unit5_5, unit6_5, unit7_5, total5, average5);
        System.out.println("--------------------------------------------------------------------------------------------------------------------------------------\n\n");
        scanner.close();
    }
}