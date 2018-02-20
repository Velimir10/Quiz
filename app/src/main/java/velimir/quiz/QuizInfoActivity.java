package velimir.quiz;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;

import core.Question;

public class QuizInfoActivity extends AppCompatActivity {

    private Button buttonStartPlay;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz_info);

        buttonStartPlay = (Button) findViewById(R.id.button_startPlay);
    }

    public void onButtonStartPlay(View view){

        Intent intent = new Intent(this, PlayGameActivity.class);
        startActivity(intent);

    }





}
