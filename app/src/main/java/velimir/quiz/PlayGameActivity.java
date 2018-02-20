package velimir.quiz;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;

import core.Question;

public class PlayGameActivity extends AppCompatActivity {

    private TextView questionTextView;
    private Button aButton, bButton, cButton, dButton;
    private int listCounter = 0;
    private int correctAnswer = 0;
    private int incorrectAnswer = 0;


    private ArrayList<Question> listQuestions = new ArrayList<>();


    @Override
    protected void onCreate(final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_play_game);

        questionTextView = (TextView) findViewById(R.id.textView_question);
        aButton = (Button) findViewById(R.id.btn_firstAnswer);
        bButton = (Button) findViewById(R.id.btn_secondAnswer);
        cButton = (Button) findViewById(R.id.btn_thirdAnswer);
        dButton = (Button) findViewById(R.id.btn_fourthAnswer);

        populateListQuestions();

        if(savedInstanceState != null){
            listCounter = savedInstanceState.getInt("LIST_COUNTER");
            correctAnswer = savedInstanceState.getInt("CORRECT");
            incorrectAnswer = savedInstanceState.getInt("INCORRECT");
        }
        populateFields();




    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putInt("LIST_COUNTER", listCounter);
        outState.putInt("CORRECT", correctAnswer);
        outState.putInt("INCORRECT", incorrectAnswer);

    }

    private void populateListQuestions() {

        listQuestions.add(new Question("What is the capital city of Serbia?", "Nis", "Beograd", "Novi Sad", "Kragujevac", "Beograd"));
        listQuestions.add(new Question("What is the capital city of Austria?", "Vienna", "Graz", "Linz", "Wels", "Vienna"));
        listQuestions.add(new Question("What is the capital city of Spain?", "Sevilha", "Barcelona", "Madrid", "Valensia", "Madrid"));
        listQuestions.add(new Question("What is the capital city of Portugal?", "Porto", "Lisbon", "Braga", "Faro", "Lisbon"));
        listQuestions.add(new Question("What is the capital city of Brasil?", "Fortaleza", "Sao Paulo", "Brasilia", "Recife", "Brasilia"));

    }

    private void populateFields() {

        questionTextView.setText(listQuestions.get(listCounter).getQuestion().toString());
        aButton.setText(listQuestions.get(listCounter).getOptA().toString());
        bButton.setText(listQuestions.get(listCounter).getOptB().toString());
        cButton.setText(listQuestions.get(listCounter).getOptC().toString());
        dButton.setText(listQuestions.get(listCounter).getOptD().toString());

    }



    private void showScore() {
        Intent intent = new Intent(this, ScoreActivity.class);
        intent.putExtra("CORRECT_ANSWERS", correctAnswer);
        intent.putExtra("INCORRECT_ANSWERS", incorrectAnswer);
        startActivity(intent);
    }


    public void onButtonClick(View view) {

        switch (view.getId()) {
            case R.id.btn_firstAnswer:
                if (aButton.getText().toString().equals(listQuestions.get(listCounter).getAnswer())) {
                    correctAnswer++;

                } else {
                    incorrectAnswer++;

                }

                if (listCounter < listQuestions.size() - 1) {

                    listCounter++;
                    populateFields();
                } else {

                    showScore();
                }

                break;

            case R.id.btn_secondAnswer:
                if (bButton.getText().toString().equals(listQuestions.get(listCounter).getAnswer())) {
                    correctAnswer++;
                } else {
                    incorrectAnswer++;
                }

                if (listCounter < listQuestions.size() - 1) {

                    listCounter++;
                    populateFields();
                } else {
                    showScore();
                }


                break;
            case R.id.btn_thirdAnswer:
                if (cButton.getText().toString().equals(listQuestions.get(listCounter).getAnswer())) {
                    correctAnswer++;
                } else {
                    incorrectAnswer++;
                }

                if (listCounter < listQuestions.size() - 1) {

                    listCounter++;
                    populateFields();
                } else {
                    showScore();
                }


                break;
            case R.id.btn_fourthAnswer:
                if (dButton.getText().toString().equals(listQuestions.get(listCounter).getAnswer())) {
                    correctAnswer++;
                } else {
                    incorrectAnswer++;
                }

                if (listCounter < listQuestions.size() - 1) {

                    listCounter++;
                    populateFields();
                } else {

                    showScore();
                }

                break;
        }

    }



}
