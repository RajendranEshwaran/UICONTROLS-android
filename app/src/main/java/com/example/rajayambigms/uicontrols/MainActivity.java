package com.example.rajayambigms.uicontrols;

import android.app.FragmentTransaction;
import android.content.Intent;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.Objects;


public class MainActivity extends AppCompatActivity {

    Button textViewBtn;
    Button editViewBtn;
    Button autoCompBtn;
    Button imageBtn;
    Button toggleBtn;
    Button checkboxBtn;
    Button progressBtn;
    Button spinnerBtn;
    Button datepickerBtn;
    Button timepickerBtn;
    Button seekbarBtn;
    Button ratingBtn;
    Button textclockBtn;
    Button alertBtn;
    Button switchBtn;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        textViewBtn = (Button)findViewById(R.id.textViewBtn);
        editViewBtn = (Button)findViewById(R.id.editTextBtn);
        autoCompBtn = (Button)findViewById(R.id.autoCompBtn);
        imageBtn = (Button)findViewById(R.id.imageBtn);
        toggleBtn = (Button)findViewById(R.id.toggleBtn);
        checkboxBtn = (Button)findViewById(R.id.checkboxBtn);
        progressBtn = (Button)findViewById(R.id.progressBtn);
        spinnerBtn = (Button)findViewById(R.id.spinnerBtn);
        datepickerBtn = (Button)findViewById(R.id.datepickerBtn);
        timepickerBtn = (Button)findViewById(R.id.timepickerBtn);
        seekbarBtn = (Button)findViewById(R.id.seekbarBtn);
        ratingBtn = (Button)findViewById(R.id.ratingBtn);
        textclockBtn = (Button)findViewById(R.id.textclockBtn);
        alertBtn = (Button)findViewById(R.id.alertBtn);
        switchBtn = (Button)findViewById(R.id.switchBtn);


    }


    public void goTextViewActivity(View view)
    {
        Intent intent = new Intent(MainActivity.this,TextViewActivity.class);
        startActivity(intent);
    }
    public void gotoEditTextActivity(View view)
    {
        Intent intent = new Intent(MainActivity.this,editTextActivity.class);
        startActivity(intent);
    }

}
