package com.example.languagequiz;

public class QuestionLibrary {

    private String mQuestions [] = {
            "When Starbuck gets bored, she grabs a book and begins to LEER.",
            "Starbuck doesn't like to read sad books because she always LLORA.",
            "She decides she doesn't want to read anymore and she gets up quickly but SE CAYE and sprains her ankle",
            "Starbuck gets some pain medication that makes her tired so she decides to DORMIR",
            "Starbuck gets really hungry after sleeping so she COME threes slices of pizza",
            "What does LEER mean? HINT:Starbuck likes to do this when she is bored.",
            "Starbuck _________ when she reads sad books.",
            "What does LLORA mean?"
    };

    private String mChoices[][] = {
            {"Swim", "Read", "Apple", "Shirt"},
            {"Cries", "Throws", "Barks", "Makes"},
            {"Falls", "Runs", "Draws", "Apple"},
            { "Swim", "Sleep", "Read","Create"},
            {"Talk", "Throw", "Eats", "Draw"},
            {"Swim", "Bread", "To read", "Jumps"},
            {"Hand", "Llora", "Dog", "Sleep"},
            {"Sleep", "Draw", "Cry", "Think"},
    };

    private String mCorrectAnswers [] = { "Read", "Cries", "Falls", "Sleep", "Eats", " To read","Llora","Cry",};

    public String getQuestion (int a) {
        String question = mQuestions [a];
        return question;
    }
    public String getChoice1 (int a){
        String choice0 = mChoices [a][0];
        return choice0;
    }
    public String getChoice2 (int a) {
        String choice1 = mChoices [a] [1];
        return choice1;
    }
    public String getChoice3 (int a) {
        String choice2 = mChoices [a] [2];
        return choice2;
    }

    public String getCorrectAnswer (int a){
        String answer = mCorrectAnswers [a];
        return answer;
    }
}
