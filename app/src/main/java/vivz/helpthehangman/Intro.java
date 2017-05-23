package vivz.helpthehangman;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;

public class Intro extends AppCompatActivity {

    Context c;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intro);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        c = this;

        Button start = (Button) findViewById(R.id.start);
        Button exit = (Button) findViewById(R.id.exit);
        Button about = (Button) findViewById(R.id.about);

        start.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i = new Intent();
                i.setClassName("vivz.helpthehangman","vivz.helpthehangman.QueryInput");

                  startActivity(i);

            }
        });

        about.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i = new Intent();
                i.setClassName("vivz.helpthehangman", "vivz.helpthehangman.About");

                startActivity(i);

            }
        });

        exit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                AlertDialog.Builder alertbuild = new AlertDialog.Builder(c);

                alertbuild.setMessage("Are you sure you want to exit ?");
                //   alertbuild.setCancelable(false);

                alertbuild.setPositiveButton("Yes", new DialogInterface.OnClickListener() {

                    @Override
                    public void onClick(DialogInterface dialog, int which) {
//MainActivity.super.onBackPressed();

                        finish();
                    }
                });


                alertbuild.setNegativeButton("No", new DialogInterface.OnClickListener() {

                    @Override
                    public void onClick(DialogInterface dialog, int which) {
//MainActivity.super.onBackPressed();

                    }


                });


                alertbuild.create().show();


            }
        });


    }

}
