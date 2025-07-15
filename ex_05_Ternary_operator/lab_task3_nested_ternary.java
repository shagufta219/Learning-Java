package ex_05_Ternary_operator;

public class lab_task3_nested_ternary {
    public static void main(String[] args) {
        byte marks = 40;

        // Rough logic                                  Code Logic
        // marks = 90+ --> A+                                 marks >= 90
        // marks = 75 to 89 --> A                       75 <= marks < 90
        // marks = 60 to 74--> B                        60 <= marks < 75
        // marks = 40 to 59--> C                        40 <= marks < 60
        // marks < 40 --> Fail                                marks < 90

        String grade = (marks >= 90) ? "A+" :
                (marks >= 75 && marks < 90) ? "A" :
                        (marks >= 60 && marks < 75) ? "B" :
                                (marks >= 40 && marks < 60) ? "C" : "Fail";

        System.out.println(grade);
    }
}
