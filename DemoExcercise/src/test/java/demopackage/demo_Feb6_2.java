package demopackage;

import java.util.Scanner;

public class demo_Feb6_2 {


    public static void main(String[] args) {


        Scanner sc= new Scanner(System.in);
        System.out.println("Enter No. of working days");
        int workingDays=sc.nextInt();
        System.out.println("Enter The role");
        String Role= sc.next();
        if(Role.equals("Manager"))
        {
            System.out.println("salary is"+workingDays*500);
        }
        else if (Role.equals("Staff"))
        {

            System.out.println("salary is"+workingDays*350);
        }
        else if (Role.equals("Clerk"))
        {

            System.out.println("salary is"+workingDays*200);
        }
       else {
            System.out.println("Enter valid input");
        }
    }




}
