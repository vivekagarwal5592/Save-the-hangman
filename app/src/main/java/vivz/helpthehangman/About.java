package vivz.helpthehangman;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.TextView;

public class About extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


        TextView about_text = (TextView)findViewById(R.id.about_text);

        about_text.setText("This game will assist you in solving the game Hangman. Just type your half found word and replace the missing letter with a " +
                "dot. This will give you all the possible results with the given combination.");

    }

}
