package vivz.helpthehangman;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.TextView;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Result extends AppCompatActivity {

    String data;
    int flag;
    ArrayList<CharSequence> used_letters = new ArrayList<CharSequence>();


    public Result() {
        this.data = "abc";
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        TextView result = (TextView) findViewById(R.id.result);
        result.setText("");
       used_letters = getIntent().getCharSequenceArrayListExtra("user_letter");
        String test_word = getIntent().getStringExtra("query_word");
        String strOutput = "";
        String line = "";


        try {
            InputStream  is = getResources().openRawResource(R.raw.dictionary);
//f= getResources().getResourceName(R.raw.dictionary);
            BufferedReader reader = new BufferedReader(new InputStreamReader(is));


            while (( line  = reader.readLine()) != null) {


                String dictionary_word = line;
                int count = 0;
                boolean flag = true;
                for (int i = 0; i <= test_word.length() - 1; i++) {
                    if (test_word.length() != dictionary_word.length()) {
                        flag = false;
                        break;
                    }
                    if (test_word.charAt(i) != dictionary_word.charAt(i) && test_word.charAt(i) != '.') {
                        flag = false;
                        break;
                    }

                    for (int j = 0; j <= used_letters.size() - 1; j++) {
                        if (used_letters.get(j).charAt(0) == dictionary_word.charAt(i)) {
                            flag = false;
                            break;
                        }
                    }
                }
                if (flag) {

                    strOutput = new StringBuilder(String.valueOf(strOutput)).append(dictionary_word).append("\t\t\t\t\t\t\t").toString();


                }
                  }

                is.close();
                if (strOutput == "") {
                    result.setText("There is no result for your query");
                }
                if (strOutput != "") {
                    result.append("The Result is");
                    result.setText(strOutput);
                }


            //       result.setText("There is no result for your query");
        } catch (IOException e) {
            e.printStackTrace();


        }
    }
}

