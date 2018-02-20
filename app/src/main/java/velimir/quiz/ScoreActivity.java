package velimir.quiz;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class ScoreActivity extends AppCompatActivity {
     TextView mCorrect, mIncorrect;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_score);

        mCorrect = (TextView)findViewById(R.id.correctAnswers);
        mIncorrect = (TextView)findViewById(R.id.incorrectAnswers);

        Intent intent = getIntent();
        int correct = intent.getIntExtra("CORRECT_ANSWERS", 0);
        int incorrect = intent.getIntExtra("INCORRECT_ANSWERS", 0);

        mCorrect.setText(mCorrect.getText() + "   "+String.valueOf(correct));
        mIncorrect.setText(mIncorrect.getText() + "   "+ String.valueOf(incorrect));



    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        Intent intent = new Intent(this, QuizInfoActivity.class);
        startActivity(intent);
    }

    public void onButtonReplayClick(View view){
        Intent intent = new Intent(this, PlayGameActivity.class);
        startActivity(intent);
    }
}
