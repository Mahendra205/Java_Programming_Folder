import java.util.*;

public class ExamStatus {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter marks");
        int marks = sc.nextInt();
        String status = (marks >= 33) ? "pass" : "fail";
        System.out.println(status);
    }
}
