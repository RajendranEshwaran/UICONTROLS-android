package com.example.rajayambigms.uicontrols;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.CheckBox;
import android.widget.Toast;

public class CheckBoxActivity extends AppCompatActivity {

    CheckBox checkBox;
    CheckBox checkBox2;
    CheckBox checkBox3;
    CheckBox checkBox4;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_check_box);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);

        checkBox = (CheckBox)findViewById(R.id.checkBox);
        checkBox2 = (CheckBox)findViewById(R.id.checkBox2);
        checkBox3 = (CheckBox)findViewById(R.id.checkBox3);
        checkBox4 = (CheckBox)findViewById(R.id.checkBox4);



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

    public void getCheckBoxDetails(View view)
    {
        String result = "";
       if(checkBox.isChecked())
       {
           result += checkBox.getText().toString();
       }
       if(checkBox2.isChecked())
       {
           result += checkBox2.getText().toString();
       }
       if(checkBox3.isChecked())
        {
            result += checkBox3.getText().toString();
        }
        if(checkBox4.isChecked())
        {
            result += checkBox4.getText().toString();
        }
        Toast.makeText(getApplicationContext(),"You Have Selected:"+result,Toast.LENGTH_SHORT).show();

    }

}
