package com.example.musfiqrahman.firsttestapp;

import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



    }

    public void btnClickEventHandler(View v){
        Uri number = Uri.parse("tel:711");
        Intent callIntent = new Intent(Intent.ACTION_DIAL, number);

        PackageManager pm = getPackageManager();
        if((pm.queryIntentActivities(callIntent, PackageManager.MATCH_DEFAULT_ONLY)).size() > 0){
            startActivity(callIntent);
        }

    }

    public void mapBtnClickEventHandler(View v){

        Uri truAddress = Uri.parse("geo:0,0?q="+Uri.encode("805 TRU Way"));
        Intent mapTRUIntenet = new Intent(Intent.ACTION_VIEW, truAddress);


        if(mapTRUIntenet.resolveActivity(getPackageManager()) != null){
            startActivity(mapTRUIntenet);
        }

    }
}
