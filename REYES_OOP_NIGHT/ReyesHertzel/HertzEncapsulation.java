
package ReyesHertzel;

import ReyesHertzel.Hertz;

import java.util.Scanner;
public class HertzEncapsulation {
    

     public static void main(String[] args) {                   
        Scanner info = new Scanner(System.in);
        System.out.print("Enter test case number: ");
        int testCase = info.nextInt();

        switch (testCase) {
            case 1:
                System.out.println("Test Case 1: Student under 18");
                Hertz student1 = new Hertz("Jemar Jude", "Maranga", 17, false); 
                System.out.println(student1);
                break;
            case 2:
                System.out.println("Test Case 2: Increase age of student1");
                Hertz student2 = new Hertz("Jemar Jude", "Maranga", 17, false); 
                student2.increaseAge();
                System.out.println(student2);
                break;
            case 3:
                System.out.println("Test Case 3: Student over 18");
                Hertz student3 = new Hertz("Jose", "Cruz", 19, false); 
                System.out.println(student3);
                break;
            default:
                System.out.println("Invalid test case number.");
        }

        info.close();
    }
}