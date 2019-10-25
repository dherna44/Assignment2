import java.util.Scanner;
public class Assgn2 {
    public static void main(String[] args){



        Student[] Std = new Student[10];
        Scanner in = new Scanner(System.in);

        for (int i=0; i<9;i++) {

            System.out.println("Student Details, Department of ILT");

            System.out.println("\nHow many students do you want to enter data for?: ");
            in.nextLine();
            System.out.println("\nFirst Name: ");
            String Fname = in.nextLine();
            System.out.println("\nLast Name: ");
            String LName = in.nextLine();
            System.out.println("\nPeopleSoft ID: ");
            int id = in.nextInt();
            in.nextLine();
            System.out.println("\nClass Standing: ");
            String classYr = in.nextLine();
            System.out.println("\nE-Mail: ");
            String eMail = in.nextLine();
            System.out.println("\nAddress: ");
            String Address = in.nextLine();
            Std[i].setVals(Fname, LName, id, classYr, eMail, Address);

        }

        for (int i=0; i<9; i++){
            System.out.println("Student Info: " + Std[i].getVals());
        }

    }
}