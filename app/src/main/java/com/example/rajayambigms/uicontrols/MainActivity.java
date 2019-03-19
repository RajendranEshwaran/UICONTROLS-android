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
    public void gotoAutocompleteTextActivity(View view)
    {
        Intent intent = new Intent(MainActivity.this,AutocompleteTextActivity.class);
        startActivity(intent);
    }

    public void gotoToogleActivity(View view)
    {
        Intent intent = new Intent(MainActivity.this,ToggleButtonActivity.class);
        startActivity(intent);
    }

    public void gotoImageButtonActivity(View view)
    {
        Intent intent = new Intent(MainActivity.this,ImageButtonActivity.class);
        startActivity(intent);
    }

    public void gotoCheckBoxActivity(View view)
    {
        Intent intent = new Intent(MainActivity.this,CheckBoxActivity.class);
        startActivity(intent);
    }

    public void gotoRadioButtonActivity(View view)
    {
        Intent intent = new Intent(MainActivity.this,RadioButtonActivity.class);
        startActivity(intent);
    }

    public void gotoProgressBarActivity(View view)
    {
        Intent intent = new Intent(MainActivity.this,ProgressBarActivity.class);
        startActivity(intent);
    }

    public void gotoSpinnerActivity(View view)
    {
        Intent intent = new Intent(MainActivity.this,SpinnerActivity.class);
        startActivity(intent);
    }

    public void gotoSeekbarActivity(View view)
    {
        Intent intent = new Intent(MainActivity.this,SeekBarActivity.class);
        startActivity(intent);
    }
    public void gotoDatePickerActivity(View view)
    {
        Intent intent = new Intent(MainActivity.this,DatePickerActivity.class);
        startActivity(intent);
    }
    public void gotoTimerPickerActivity(View view)
    {
        Intent intent = new Intent(MainActivity.this,TimePickerActivity.class);
        startActivity(intent);
    }
    public void gotoRatingBarActivity(View view)
    {
        Intent intent = new Intent(MainActivity.this,RatingBarActivity.class);
        startActivity(intent);
    }
    public void gotoTextClockActivity(View view)
    {
        Intent intent = new Intent(MainActivity.this,TextClockActivity.class);
        startActivity(intent);
    }
    public void gotoSwitchActivity(View view)
    {
        Intent intent = new Intent(MainActivity.this,SwitchActivity.class);
        startActivity(intent);
    }
    public void gotoDialogActivity(View view)
    {
        Intent intent = new Intent(MainActivity.this,DialogActivity.class);
        startActivity(intent);
    }
}
