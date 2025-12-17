package livius;

import java.util.*;

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

        List<String> moreQuestions = new ArrayList<>();
        moreQuestions.add("q4");
        moreQuestions.add("q5");
        moreQuestions.add("q4");
        moreQuestions.add("q4");
        System.out.println(moreQuestions.size());
        System.out.println(moreQuestions.get(1));
        System.out.println(moreQuestions.contains("q4"));
        System.out.println(moreQuestions.isEmpty());
        System.out.println(moreQuestions.lastIndexOf("q4"));
        System.out.println(moreQuestions.size());

        Set<String> countriesToVisit = new HashSet<>();
        countriesToVisit.add("France");
        countriesToVisit.add("Germany");
        countriesToVisit.add("Spain");
        countriesToVisit.add("France");
        System.out.println(countriesToVisit);

        Map<String, Integer> countryToPopulation = new HashMap<>();
        countryToPopulation.put("USA", 331000000);
        countryToPopulation.put("United Kingdom", 67330000);
        countryToPopulation.put("Austria", 8950000);
        System.out.println(countryToPopulation.get("USA"));
        System.out.println(countryToPopulation.get("Germany"));
        System.out.println(countryToPopulation);



        for (int i = 0; i < moreQuestions.size(); i++) {
            System.out.println(moreQuestions.get(i));
        }

        for(Map.Entry<String, Integer> entry : countryToPopulation.entrySet()) {
            System.out.println("Key: " + entry.getKey() + "  Value: " + entry.getValue());
        }
    }
}