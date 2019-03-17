package com.example.rajayambigms.uicontrols;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.Toast;
import android.widget.ToggleButton;

public class ToggleButtonActivity extends AppCompatActivity {

    ToggleButton toggleButton;
    ToggleButton toggleButton2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_toggle_button);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);

        toggleButton = (ToggleButton)findViewById(R.id.toggleButton);
        toggleButton2 = (ToggleButton)findViewById(R.id.toggleButton2);

        toggleButton.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {

                if(isChecked)
                {
                    toggleButton.setTextOn("ON");
                }
                else
                {
                    toggleButton.setTextOn("OFF");
                }
            }
        });

        toggleButton2.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked)
                {
                    toggleButton2.setTextOn("ON");
                }
                else
                {
                    toggleButton2.setTextOn("OFF");
                }
            }
        });


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

    public void submitToggleAction(View view)
    {
        Toast.makeText(getApplicationContext(),"Toggle1:"+toggleButton.getText().toString() + "Toggle2:"+toggleButton2.getText().toString(),Toast.LENGTH_LONG).show();

    }
}
