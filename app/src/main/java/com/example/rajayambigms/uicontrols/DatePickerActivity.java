package com.example.rajayambigms.uicontrols;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.TextView;

public class DatePickerActivity extends AppCompatActivity {


    DatePicker datePicker;
    Button getDate;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_date_picker);

        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        datePicker = (DatePicker)findViewById(R.id.datePicker);
        getDate = (Button)findViewById(R.id.getDateBtn);
        textView =(TextView)findViewById(R.id.resultDateTxt);

        getDate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                textView.setText("Selected Date: "+ datePicker.getDayOfMonth()+"/"+ (datePicker.getMonth() + 1)+"/"+datePicker.getYear());
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
}
