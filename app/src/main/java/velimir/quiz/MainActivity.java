package velimir.quiz;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private TextView exit;
    private TextView play, about;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        play = (TextView)findViewById(R.id.play);
        about = (TextView)findViewById(R.id.about);
        exit = (TextView) findViewById(R.id.text_exit);

    }


   public void onPlayClick(View view){
       Intent intent = new Intent(this, QuizInfoActivity.class);
       startActivity(intent);
   }

   public void onAboutClick(View view){
       Intent intent = new Intent(this, AboutActivity.class);
       startActivity(intent);

   }

   public void onExitClick(View view){
      finish();

   }
}
