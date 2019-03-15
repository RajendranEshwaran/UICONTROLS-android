package com.example.rajayambigms.uicontrols;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import java.security.PublicKey;


public class editTextActivity extends AppCompatActivity {

    TextView getTxtName;
    TextView getTxtPwd;
    TextView getTxtEmail;
    TextView getTxtDate;
    TextView getTxtPhone;

    EditText TxtName;
    EditText TxtPwd;
    EditText TxtEmail;
    EditText TxtDate;
    EditText TxtPhone;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_text);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);

        getTxtName = (TextView)findViewById(R.id.textViewResultName);
        getTxtPwd  = (TextView)findViewById(R.id.textViewResultPwd);
        getTxtEmail = (TextView)findViewById(R.id.textViewResultEmail);
        getTxtDate = (TextView)findViewById(R.id.textViewResultDate);
        getTxtPhone = (TextView)findViewById(R.id.textViewResultPhone);

        TxtName = (EditText)findViewById(R.id.editTextName);
        TxtPwd  = (EditText)findViewById(R.id.editTextPwd);
        TxtEmail = (EditText)findViewById(R.id.editTextEmail);
        TxtDate = (EditText)findViewById(R.id.editTextBirth);
        TxtPhone = (EditText)findViewById(R.id.editTextPhone);
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

    public void showInputData(View view)
    {
        getTxtName.setText("Your Name: " + TxtName.getText().toString());
        getTxtPwd.setText("Your Password: " + TxtPwd.getText().toString());
        getTxtEmail.setText("Your Email: " + TxtEmail.getText().toString());
        getTxtDate.setText("Your Date: " + TxtDate.getText().toString());
        getTxtPhone.setText("Your Phone: " + TxtPhone.getText().toString());

    }
}
