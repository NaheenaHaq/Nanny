package com.example.administrator.nanny;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.net.Uri;
import android.renderscript.Sampler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Nanny extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nanny);
        final TextView textView = (TextView) findViewById(R.id.budget1);
        final TextView textView = (TextView) findViewById(R.id.category1);
        final TextView textView = (TextView) findViewById(R.id.text1);
        final EditText editText = (EditText) findViewById(R.id.edutext);
        final Button button = (Button) findViewById(R.id.button1);
editText.setText(toString().);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                SharedPreferences prefs = this.getSharedPreferences(
                        "com.example.administrator.nanny", Context.MODE_PRIVATE);
                int budget = "com.example.administrator.nanny.budget";


                long l = prefs.getLong(budgetKey, new Sampler.Value().getValue());








            }

        });

    }




    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_nanny, menu);
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
