package com.example.languagequiz;

public class PastVerbsQuestionLibrary{
        private String mQuestions [] = {
                "Harry DORMIO for 7 hours last night.",
                "Starbuck doesn't like to read sad books because she always LLORA.",
                "She decides she doesn't want to read anymore and she gets up quickly but SE CAYE and sprains her ankle",
                "Starbuck gets some pain medication that makes her tired so she decides to DORMIR",
                "Starbuck gets really hungry after sleeping so she COME threes slices of pizza",
                "What does LEER mean? HINT:Starbuck likes to do this when she is bored.",
                "Starbuck _________ when she reads sad books.",
                "What does LLORA mean?"
        };

        private String mChoices[][] = {
                {"Slept", "Broke", "Swam"},
                {"Cries", "Throws", "Barks"},
                {"Falls", "Runs", "Draws"},
                { "Swim", "Sleep", "Read"},
                {"Talk", "Throw", "Eats"},
                {"Swim", "Bread", "To read"},
                {"Hand", "Llora", "Dog"},
                {"Sleep", "Draw", "Cry"},
        };

        private String mCorrectAnswers [] = { "Slept", "Cries", "Falls", "Sleep", "Eats", " To read","Llora","Cry",};

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