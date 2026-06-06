package org.example;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Quiz {

    public void quizLogic() {

        int correctAnswerCount = 0;
        int wrongAnswerCount = 0;

        Question question1 = new Question("What is Java?", "A database", "A programming Language", "A cloud", "A OS");
        Question question2 = new Question("What is the correct way to declare a variable in Java?", "var name;", "int name;", "name int;", "declare int name;");
        Question question3 = new Question("Which of the following is a valid Java identifier?", "123variable", "variable-name", "variable_name", "variable@name");
        Question question4 = new Question("What is the default value of an int variable in Java?", "0", "1", "null", "undefined");
        Question question5 = new Question("Which keyword is used to create a class in Java?", "class", "Class", "CLASS", "object");

        Map<Question, Character> questionMap = new HashMap<>();
        questionMap.put(question1, 'B');
        questionMap.put(question2, 'B');
        questionMap.put(question3, 'C');
        questionMap.put(question4, 'A');
        questionMap.put(question5, 'A');

        for(Map.Entry<Question, Character> qMap : questionMap.entrySet()){
            System.out.println(qMap.getKey().getQuestion());
            System.out.println("A. " + qMap.getKey().getOption1());
            System.out.println("B. " + qMap.getKey().getOption2());
            System.out.println("C. " + qMap.getKey().getOption3());
            System.out.println("D. " + qMap.getKey().getOption4());

            //  Ask the option to the user
            Scanner scanner = new Scanner(System.in);
            System.out.println("Please enter your answer (A, B, C, or D) & Capital letters : ");
            char userOption = scanner.next().charAt(0);
            int CorrectAnswer = Character.compare(qMap.getValue(), userOption);
            if (CorrectAnswer == 0) {
                System.out.println("Congratulations! You guessed the correct answer.");
                correctAnswerCount++;
            } else {
                System.out.println("Incorrect! The correct answer is: " + qMap.getValue());
                wrongAnswerCount++;
            }
            System.out.println("***** Let's move to the next question *****");
        }
        System.out.println("Quiz completed! You got " + correctAnswerCount + " correct answers and " + wrongAnswerCount + " wrong answers.");

        int percentage = (correctAnswerCount * 100) / questionMap.size();
        System.out.println("Your score: " + percentage + "%");

        if(percentage > 90) {
            System.out.println("Excellent! You have a great understanding of Java.");
        } else if(percentage < 90 && percentage >= 35) {
            System.out.println("Good Luck! You have a great understanding of Java.");
        } else {
            System.out.println("Sorry! You need to improve your knowledge of Java.");
        }
        System.exit(0);
    }
}
