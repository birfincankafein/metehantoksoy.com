package com.metehantoksoy.customadapterexample;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.SimpleAdapter;

import java.util.ArrayList;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Persons is creating
        ArrayList<Person> persons = new ArrayList<Person>();
        persons.add(new Person("Ahmet Uzun","ISTANBUL",R.drawable.ahmet_uzun));
        persons.add(new Person("Ayşe Kanmaz","ANKARA",R.drawable.ayse_kanmaz));

        // Adapter is creating
        PersonAdapter personAdapter = new PersonAdapter(this,R.layout.layout_listview_itemtemplate,persons);

        // Finding listview and persons will short in listview.
        ListView listviewPerson = (ListView)findViewById(R.id.listView_persons);
        if(listviewPerson != null){
            listviewPerson.setAdapter(personAdapter);
        }


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
}
