package com.example.gautham.myappportfolio;

import android.content.Context;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;


public class MainActivity extends ActionBarActivity {




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


    public void toastSS(View view){
        Context context1 = getApplicationContext();
        int duration1 = Toast.LENGTH_SHORT;
        Toast toast1 = new Toast(context1);
        CharSequence text1 = "This button will launch my Spotify streamer app!";
        toast1.makeText(context1,text1,duration1).show();
    }
    public void toastSA(View view){
        Context context1 = getApplicationContext();
        int duration1 = Toast.LENGTH_SHORT;
        Toast toast1 = new Toast(context1);
        CharSequence text1 = "This button will launch my Scores app!";
        toast1.makeText(context1,text1,duration1).show();
    }
    public void toastLA(View view){
        Context context1 = getApplicationContext();
        int duration1 = Toast.LENGTH_SHORT;
        Toast toast1 = new Toast(context1);
        CharSequence text1 = "This app will launch my Library app!";
        toast1.makeText(context1,text1,duration1).show();
    }
    public void toastBIB(View view){
        Context context1 = getApplicationContext();
        int duration1 = Toast.LENGTH_SHORT;
        Toast toast1 = new Toast(context1);
        CharSequence text1 = "This button will launch my Build it bigger app!";
        toast1.makeText(context1,text1,duration1).show();
    }
    public void toastXYZR(View view){
        Context context1 = getApplicationContext();
        int duration1 = Toast.LENGTH_SHORT;
        Toast toast1 = new Toast(context1);
        CharSequence text1 = "This button will launch my XYZ reader app!";
        toast1.makeText(context1,text1,duration1).show();
    }
    public void toastCS(View view){
        Context context1 = getApplicationContext();
        int duration1 = Toast.LENGTH_SHORT;
        Toast toast1 = new Toast(context1);
        CharSequence text1 = "This button will launch my Capstone app!";
        toast1.makeText(context1,text1,duration1).show();
    }
}
