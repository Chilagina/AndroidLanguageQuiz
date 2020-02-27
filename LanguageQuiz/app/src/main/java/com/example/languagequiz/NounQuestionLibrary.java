package com.example.languagequiz;

public class NounQuestionLibrary {

        private String mQuestions [] = {
                "The old man waited alone, he sat at the MESA while he wrote in his notebook.",
                "Suddendly a beautiful young MUJER walked in, she was wearing a red dress.",
                "Her blonde PELO reached her exposed shoulders."


        };

        private String mChoices[][] = {
                {"Table", "Car", "Apple"},
                {"Boy", "Dog", "Woman"},
                {"Fingers", "Hair", "Eyes"},

        };

        private String mCorrectAnswers [] = { "Table", "Woman", "Hair", };

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

