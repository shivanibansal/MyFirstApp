package com.yahoo.bshivani.example.myfirstapp;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends Activity {
	public EditText etWords;
	public TextView tvLabel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        etWords = (EditText) findViewById(R.id.etWords);
        tvLabel = (TextView) findViewById(R.id.tvLabel);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
    
    public void onSubmit(View v) {
		// TODO Auto-generated method stub
    	String fieldValue = etWords.getText().toString();
    	// Change the text label
    	System.out.println("fieldValue : "+ fieldValue);
    	if(fieldValue.compareTo("") == 0)
    		tvLabel.setText(R.string.nothing_label);
    	else
    	{
    		tvLabel.setText(fieldValue);
    		// fire when the button is pressed
        	Toast.makeText(this, fieldValue, Toast.LENGTH_SHORT).show();
    	}
    	fieldValue = "";
	}
    
}
