package com.example.rajayambigms.uicontrols;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class RadioButtonActivity extends AppCompatActivity {


    RadioButton rd1;
    RadioButton rd2;
    RadioButton rd3;
    RadioButton rd4;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_radio_button);

        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        rd1 = (RadioButton)findViewById(R.id.radioButton);
        rd2 = (RadioButton)findViewById(R.id.radioButton2);
        rd3 = (RadioButton)findViewById(R.id.radioButton3);
        rd4 = (RadioButton)findViewById(R.id.radioButton4);



    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        int id = item.getItemId();
        if(id == android.R.id.home)
        {
            this.finish();
        }
        return super.onOptionsItemSelected(item);
    }


    public void getcourse(View view)
    {
        String result="";
        if(rd1.isChecked())
        {
            result += rd1.getText().toString();
        }
        if(rd2.isChecked())
        {
            result += rd2.getText().toString();
        }
        if(rd3.isChecked())
        {
            result += rd3.getText().toString();
        }
        if(rd4.isChecked())
        {
            result += rd4.getText().toString();
        }

        Toast.makeText(getApplicationContext(),"You're Course are:" + result,Toast.LENGTH_SHORT).show();
    }


}
