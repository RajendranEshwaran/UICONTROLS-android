package com.example.rajayambigms.uicontrols;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Toast;

public class AutocompleteTextActivity extends AppCompatActivity {


    AutoCompleteTextView autoCompleteTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_autocomplete_text);

        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        autoCompleteTextView = (AutoCompleteTextView)findViewById(R.id.autoCompleteTextView);

        String[] values = {"India","United States","China","Australlia","Russia","Canada","England"};

        ArrayAdapter<String> adapter = new ArrayAdapter(this,R.layout.support_simple_spinner_dropdown_item,values);
        autoCompleteTextView.setAdapter(adapter);
        autoCompleteTextView.setThreshold(1);



        autoCompleteTextView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(getApplicationContext(), "Selected Item: " + parent.getSelectedItem(), Toast.LENGTH_SHORT).show();
            
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
