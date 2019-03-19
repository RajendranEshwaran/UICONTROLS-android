package com.example.rajayambigms.uicontrols;

import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import java.util.ArrayList;

public class DialogActivity extends AppCompatActivity {

    Button bt1;
    Button bt2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dialog);

        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        bt1= (Button)findViewById(R.id.showDialogBtn);
        bt2= (Button)findViewById(R.id.showItemDialogBtn);
        final String[] values = {"Action","Escape","Shooting","Puzzle"};
        final ArrayList<Integer> valuelist = new ArrayList();
        final boolean icount[] = new boolean[values.length];


        bt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                AlertDialog.Builder ad1 = new AlertDialog.Builder(DialogActivity.this);
                ad1.setTitle("www.Ready4Games.com")
                        .setMessage("Welcome to Ready4Games Page")
                        .setCancelable(false)
                        .setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {

                                Toast.makeText(getApplicationContext(),"Welcome to Ready4games",Toast.LENGTH_SHORT).show();
                            }
                        }).setNegativeButton("No", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Toast.makeText(DialogActivity.this,"Selected Option: No",Toast.LENGTH_SHORT).show();
                    }
                });
                AlertDialog dialog  = ad1.create();
                dialog.show();
            }
        });

        bt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                AlertDialog.Builder ad2 = new AlertDialog.Builder(DialogActivity.this);
                ad2.setTitle("Welcome to Ready4Games")
                        .setCancelable(false)
                        .setMultiChoiceItems(values, icount, new DialogInterface.OnMultiChoiceClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which, boolean isChecked) {
                                if (isChecked) {
                                    // If user select a item then add it in selected items
                                    valuelist.add(which);
                                } else if (valuelist.contains(which)) {
                                    // if the item is already selected then remove it
                                    valuelist.remove(Integer.valueOf(which));
                                }

                            }
                        }).setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {

                        String msg = "";

                        for(int i=0; i < valuelist.size();i++)
                        {
                            msg = msg + "\n" + (i + 1) + " : " + values[valuelist.get(i)];
                        }
                        Toast.makeText(getApplicationContext(), "Total " + valuelist.size() + " Items Selected.\n" + msg, Toast.LENGTH_SHORT).show();                    }
                }).setNegativeButton("No", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Toast.makeText(DialogActivity.this,"Selected Option: No",Toast.LENGTH_SHORT).show();
                    }
                });
                AlertDialog dialog  = ad2.create();
                dialog.show();
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
