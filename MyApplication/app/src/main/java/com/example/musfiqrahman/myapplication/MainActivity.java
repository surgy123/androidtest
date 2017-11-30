package com.example.musfiqrahman.myapplication;

import android.app.Dialog;
import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.view.Window;
import android.widget.TextView;

public class MainActivity extends Activity {
    private String tag = "Events";

    private boolean toggle = true;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //---hides the title bar---
        //requestWindowFeature(Window.FEATURE_NO_TITLE);

        setContentView(R.layout.activity_main);

        Button btn = (Button) findViewById(R.id.button_click);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {



                TextView tv = (TextView) findViewById(R.id.textView);
                if(toggle) {
                    tv.setText("Hello Musfiq!");
                    toggle = false;
                }else
                {
                    tv.setText("Hello Yusra!");
                    toggle = true;
                }

                /*

                //showDialog(0);

                //First, use the AlertDialog.Builder to create the alert box interface, like title,
                // message to display, buttons, and button onclick function
                AlertDialog.Builder alertDB = new AlertDialog.Builder(getBaseContext());

                alertDB.setTitle("Alert Dialog Box");
                alertDB.setMessage("Select one of the options!");
                alertDB.setCancelable(false);
                alertDB.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        TextView tv = (TextView) findViewById(R.id.textView);
                        tv.setText("Hello Musfiq!");
                        dialogInterface.dismiss();
                    }
                });

                alertDB.setNegativeButton("No", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        dialogInterface.cancel();
                    }
                });

                // 2. create alert dialog
                AlertDialog alertDialog = alertDB.create();

                // 3. show it
                alertDialog.show();
                */

            }
        });



        Log.d(tag, "Activity Created!");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d(tag, "Activity Started!");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(tag, "Activity Stopped!");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(tag, "Activity Destroyed!");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(tag, "Activity on Paused!");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(tag, "Activity Resumed!");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d(tag, "Activity Restarted!");
    }
}
