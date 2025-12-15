package livius;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        String q1 = "who?";
        String q2 = "what?";
        String q3 = "where?";
        String q4 = "why?";
        String[] questions = new String[4];
        questions[0] = "who?";
        questions[1] = "what?";
        questions[2] = "where?";
        questions[3] = "why?";
        String[] answers = new String[4];
        answers[0] = "me";
        answers[1] = "that";
        answers[2] = "there";
        answers[3] = "idk";

        for (int x = 0; x < 5; x++) {
            outputQaA(questions, answers);
        }
        for (int x = 0; x < 5; x++) {
            outputQaA(questions, answers);
        }
        for (int x = 0; x < 5; x++) {
            outputQaA(questions, answers);
        }
        for (int x = 0; x < 5; x++) {
            outputQaA(questions, answers);
        }
        }


        public static void outputQaA(String[] questions, String[] answers) {
            for (int i = 0; i < 4; i++) {
                System.out.println("Q: " + questions[i] + "| A: " + answers[i]);
            }
        }

        public static int sum(int x, int y) {
            int summ = x + y;
            System.out.println(summ);
            return summ;
        }
    }