package manyToMany;

import java.util.Scanner;

public class driver {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Name and email");
        student stu = new student(sc.next(), sc.next());
        subject sub1 = new subject("Java", 4);
        subject sub2 = new subject("C++", 3);
        subject sub3 = new subject("Python", 2);

        System.out.println("Student Name: " + stu.getname());
        System.out.println("Student Email: " + stu.getmailId());

        while (true) {
            System.out.println("Do you want to choose a Subject? (Y/N)");
            char ch = sc.next().charAt(0);
            sc.nextLine(); 

            if (ch == 'y' || ch == 'Y') {
                System.out.println("Enter Subject name (Java / C++ / Python): ");
                String st = sc.nextLine();

                if (st.equalsIgnoreCase("Python")) {
                    System.out.println("Selected Subject: " + sub3.getsubname());
                    System.out.println("Duration: " + sub3.getduration());
                } else if (st.equalsIgnoreCase("Java")) {
                    System.out.println("Selected Subject: " + sub1.getsubname());
                    System.out.println("Duration: " + sub1.getduration());
                } else if (st.equalsIgnoreCase("C++")) {
                    System.out.println("Selected Subject: " + sub2.getsubname());
                    System.out.println("Duration: " + sub2.getduration());
                } else {
                    System.out.println("Invalid Subject Name. Try Again.");
                }
            } else if (ch == 'n' || ch == 'N') {
                System.out.println("Exit");
                break;
            } else {
                System.out.println("Invalid choice!");
            }
        }

        sc.close();
    }
}
