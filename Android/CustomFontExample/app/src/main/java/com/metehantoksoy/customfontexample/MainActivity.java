package com.metehantoksoy.customfontexample;

import android.graphics.Typeface;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.style.StyleSpan;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // TR: Typeface ataması için TextView'lar bulunuyor.
        // EN: Finding TextViews for setting typeface
        TextView mTextView_Header = (TextView) findViewById(R.id.textView_header);
        TextView mTextView_MultipleFont = (TextView) findViewById(R.id.textView_multiplefont);

        // TR: Typeface Tanımlamaları
        // EN: Typeface Definitions
        Typeface FontBleedingCowboys= Typeface.createFromAsset(getAssets(),"fonts/Bleeding_Cowboys.ttf");
        Typeface FontBlok= Typeface.createFromAsset(getAssets(),"fonts/Blok.ttf");

        // TR: Birden fazla font kullanılacak metin tanımlanıyor. İstenirse strings dosyasından da çekilebilir veya TextView'ın içindeki metin kullanılabilir.
        // EN: Defining text for using multiple font. If you want, you will get this text from strings file or getting text form TextView.
        String[] strings = new String[]{"Multiple ","Font"};
        String totalString = "Multiple Font";
        int currentLength = 0;

        SpannableString styledString = new SpannableString(totalString);
        styledString.setSpan(FontBlok,0,strings[0].length(),0);
        currentLength+=strings[0].length();

        styledString.setSpan(FontBleedingCowboys,currentLength,currentLength+strings[1].length(),0);

        // TR: İlk font ataması yapılıyor.
        // EN: Setting first font.
        mTextView_Header.setTypeface(FontBlok);

        // TR: Multiple font'lu yazı TextView'a atanıyor.
        // Assigning Multiple Fonted Text to TextView.
        mTextView_MultipleFont.setText(styledString);


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
