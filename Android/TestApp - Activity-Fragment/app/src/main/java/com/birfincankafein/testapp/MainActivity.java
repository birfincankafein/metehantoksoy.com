package com.birfincankafein.testapp;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;


public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.i("ACTIVITY", "onCreate");
    }
    @Override
    public void onStart(){
        super.onStart();
        Log.i("ACTIVITY", "onStart");
    }
    @Override
    public void onResume(){
        super.onResume();
        Log.i("ACTIVITY", "onResume");
    }

    @Override
    public void onPause(){
        super.onPause();
        Log.i("ACTIVITY", "onPause");
    }
    @Override
    public void onStop(){
        super.onStop();
        Log.i("ACTIVITY", "onStop");
    }
    @Override
    public void onDestroy(){
        super.onDestroy();
        Log.i("ACTIVITY", "onDestroy");
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        Log.i("ACTIVITY", "");
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
    public void buttonClick(View view) {
        getFragmentManager().beginTransaction().replace(R.id.container,new BlankFragment()).commit();
    }
}
