package com.example.rajayambigms.uicontrols;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.Toast;

public class ImageButtonActivity extends AppCompatActivity {

    ImageButton imageButton;
    EditText fName;
    EditText lName;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_image_button);

        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        fName = (EditText)findViewById(R.id.firstName);
        lName = (EditText)findViewById(R.id.lastName);
        imageButton =(ImageButton)findViewById(R.id.imageButton);


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

    public void submitBtn(View view)
    {
        Toast.makeText(getApplicationContext(),"First Name is:"+fName.getText().toString()+"Last Name is"+lName.getText().toString(),Toast.LENGTH_SHORT).show();
    }

}
