package com.example.dima.intentssample;

import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.util.Log;
import android.view.View;
import android.content.Intent;

import java.net.URI;

public class
        MainActivity extends AppCompatActivity {

    public static final String TAG = "Main Activity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
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

    public void nextPage(View view) {
        Log.d(TAG, "Switching to next page");
        Intent intent = new Intent(this, SecondActivity.class);
        startActivity(intent);
    }

    public void showMaps(View view) {
        Log.d(TAG, "Switching to maps");
        Intent intent = new Intent(this, MapsActivity.class);
        startActivity(intent);
    }


    public void goMaps2(View view) {
        Log.d(TAG, "Switching to maps 2");
        Intent intent = new Intent(this, MapsActivity2.class);
        startActivity(intent);
    }


    public void navUnic(View view) {

        Uri unicUri = Uri.parse("google.navigation:q=University+of+Nicosia");
        Intent mapIntenet = new Intent(Intent.ACTION_VIEW, unicUri);
        mapIntenet.setPackage("com.google.android.apps.maps");
        startActivity(mapIntenet);
        //TTT
    }
}
