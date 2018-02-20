package core;

/**
 * Created by Velimir on 2/16/2018.
 */

public class Question {

    private String question;
    private String optA;
    private String optB;
    private String optC;
    private String optD;
    private String answer;

    public Question(){
        this.question = "";;
        this.optA = "";;
        this.optB = "";;
        this.optC = "";;
        this.optD = "";
        this.answer = "";
    }

    public Question(String question, String answerA, String answerB, String answerC, String answerD, String answer){
        this.question = question;
        this.optA = answerA;
        this.optB = answerB;
        this.optC = answerC;
        this.optD = answerD;
        this.answer = answer;
    }


    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public String getOptA() {
        return optA;
    }

    public void setOptA(String optA) {
        this.optA = optA;
    }

    public String getOptB() {
        return optB;
    }

    public void setOptB(String optB) {
        this.optB = optB;
    }

    public String getOptC() {
        return optC;
    }

    public void setOptC(String optC) {
        this.optC = optC;
    }

    public String getOptD() {
        return optD;
    }

    public void setOptD(String optD) {
        this.optD = optD;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }
}
