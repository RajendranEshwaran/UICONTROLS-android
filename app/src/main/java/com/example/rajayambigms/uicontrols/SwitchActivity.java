package com.example.rajayambigms.uicontrols;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.Switch;
import android.widget.Toast;

public class SwitchActivity extends AppCompatActivity {

    Switch sw1;
    Switch sw2;
    Button bt;
    ImageView im1;
    ImageView im2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_switch);

        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        sw1= (Switch)findViewById(R.id.switch1);
        sw2 = (Switch)findViewById(R.id.switch2);
        im1= (ImageView) findViewById(R.id.imageView);
        im2 = (ImageView) findViewById(R.id.imageView2);

        sw1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {

                valueChange();
            }
        });
        sw2.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {

                valueChange();
            }
        });
        bt = (Button)findViewById(R.id.getIndicateBtn);
        bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String result="";
                if(sw1.isChecked())
                {
                    result += sw1.getText().toString();
                    im1.setVisibility(View.VISIBLE);
                }
                if(sw2.isChecked())
                {
                    result += sw2.getText().toString();
                    im2.setVisibility(View.VISIBLE);
                }
                if(!sw1.isChecked())
                {
                    im1.setVisibility(View.GONE);
                }
                if(!sw2.isChecked())
                {
                    im2.setVisibility(View.GONE);
                }
                Toast.makeText(getApplicationContext(),result ,Toast.LENGTH_SHORT).show();
            }
        });

    }

    public void valueChange()
    {
        String result="";
        if(sw1.isChecked())
        {
            result += sw1.getText().toString();
            im1.setVisibility(View.VISIBLE);
        }
        if(sw2.isChecked())
        {
            result += sw2.getText().toString();
            im2.setVisibility(View.VISIBLE);
        }
        if(!sw1.isChecked())
        {
            im1.setVisibility(View.GONE);
        }
        if(!sw2.isChecked())
        {
            im2.setVisibility(View.GONE);
        }
        Toast.makeText(getApplicationContext(),result ,Toast.LENGTH_SHORT).show();
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
}
