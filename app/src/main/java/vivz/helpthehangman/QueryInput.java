package vivz.helpthehangman;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.KeyEvent;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.view.inputmethod.EditorInfo;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class QueryInput extends AppCompatActivity {


    String data;
    int flag;

    String query_word;
    ArrayList<CharSequence> used_letter = new ArrayList<CharSequence>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_query_input);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        EditText t = (EditText) findViewById(R.id.edit_message);

       t.setOnEditorActionListener(new TextView.OnEditorActionListener() {
            @Override
            public boolean onEditorAction(TextView v, int actionId, KeyEvent event) {
             //   if (actionId == EditorInfo.IME_ACTION_DONE) {

                    sendMessage();

            //    }
                return false;
            }
        });


    }

    public void onCheckboxClicked(View view) {
        boolean checked = ((CheckBox) view).isChecked();
        switch (view.getId()) {
            case R.id.a:
                if (checked) {
                    used_letter.add("a");
                    break;
                } else {
                    used_letter.remove("a");
                    break;
                }
            case R.id.b:
                if (checked) {
                    used_letter.add("b");
                    break;
                } else {
                    used_letter.remove("b");
                    break;
                }
            case R.id.c:
                if (checked) {
                    used_letter.add("c");
                    break;
                } else {
                    used_letter.remove("c");
                    break;
                }
            case R.id.d:
                if (checked) {
                    used_letter.add("d");
                    break;
                } else {
                    used_letter.remove("d");
                    break;
                }
            case R.id.e:
                if (checked) {
                    used_letter.add("e");
                    break;
                } else {
                    used_letter.remove("e");
                    break;
                }
            case R.id.f:
                if (checked) {
                    used_letter.add("f");
                    break;
                } else {
                    used_letter.remove("f");
                    break;
                }
            case R.id.g:
                if (checked) {
                    used_letter.add("g");
                    break;
                } else {
                    used_letter.remove("g");
                    break;
                }
            case R.id.h:
                if (checked) {
                    used_letter.add("h");
                    break;
                } else {
                    used_letter.remove("h");
                    break;
                }
            case R.id.i:
                if (checked) {
                    used_letter.add("i");
                    break;
                } else {
                    used_letter.remove("i");
                    break;
                }
            case R.id.j:
                if (checked) {
                    used_letter.add("j");
                    break;
                } else {
                    used_letter.remove("j");
                    break;
                }
            case R.id.k:
                if (checked) {
                    used_letter.add("k");
                    break;
                } else {
                    used_letter.remove("k");
                    break;
                }
            case R.id.l:
                if (checked) {
                    used_letter.add("l");
                    break;
                } else {
                    used_letter.remove("l");
                    break;
                }
            case R.id.m:
                if (checked) {
                    used_letter.remove("m");
                    break;
                } else {
                    used_letter.remove("m");
                    break;
                }
            case R.id.n:
                if (checked) {
                    used_letter.remove("n");
                    break;
                } else {
                    used_letter.remove("n");
                    break;
                }
            case R.id.o:
                if (checked) {
                    used_letter.add("o");
                    break;
                } else {
                    used_letter.remove("o");
                    break;
                }
            case R.id.p:
                if (checked) {
                    used_letter.add("p");
                    break;
                } else {
                    used_letter.remove("p");
                    break;
                }
            case R.id.q:
                if (checked) {
                    used_letter.add("q");
                    break;
                } else {
                    used_letter.remove("q");
                    break;
                }
            case R.id.r:
                if (checked) {
                    used_letter.add("r");
                    break;
                } else {
                    used_letter.remove("r");
                    break;
                }
            case R.id.s:
                if (checked) {
                    used_letter.add("s");
                    break;
                } else {
                    used_letter.remove("s");
                    break;
                }
            case R.id.t:
                if (checked) {
                    used_letter.add("t");
                    break;
                } else {
                    used_letter.remove("t");
                    break;
                }
            case R.id.u:
                if (checked) {
                    used_letter.add("u");
                    break;
                } else {
                    used_letter.remove("u");
                    break;
                }
            case R.id.v:
                if (checked) {
                    used_letter.add("v");
                    break;
                } else {
                    used_letter.remove("v");
                    break;
                }
            case R.id.w:
                if (checked) {
                    used_letter.add("w");
                    break;
                } else {
                    used_letter.remove("w");
                    break;
                }
            case R.id.x:
                if (checked) {
                    used_letter.add("x");
                    break;
                } else {
                    used_letter.remove("x");
                    break;
                }
            case R.id.y:
                if (checked) {
                    used_letter.add("y");
                    break;
                } else {
                    used_letter.remove("y");
                    break;
                }
            case R.id.z:
                if (checked) {
                    used_letter.add("z");
                    break;
                } else {
                    used_letter.remove("z");
                    break;
                }
            default:
        }
    }


    public void sendMessage(View view) {
        Intent intent = new Intent(this, Result.class);
        this.query_word = ((EditText) findViewById(R.id.edit_message)).getText().toString();
        intent.putCharSequenceArrayListExtra("user_letter", used_letter);
        intent.putExtra("query_word", this.query_word);
        startActivity(intent);
    }


    public void sendMessage() {
        Intent intent = new Intent(this, Result.class);
        this.query_word = ((EditText) findViewById(R.id.edit_message)).getText().toString();
        query_word = query_word.toLowerCase();
        intent.putCharSequenceArrayListExtra("user_letter", used_letter);
        intent.putExtra("query_word", this.query_word);
        startActivity(intent);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_query_input, menu);
        return true;

    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
