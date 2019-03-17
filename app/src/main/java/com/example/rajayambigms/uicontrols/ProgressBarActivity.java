package com.example.rajayambigms.uicontrols;

import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.ProgressBar;
import android.widget.TextView;

public class ProgressBarActivity extends AppCompatActivity {

    ProgressBar pb1;
    ProgressBar pb2;
    int prog = 0;
    Handler handler;
    TextView progText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_progress_bar);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);

        pb1 = (ProgressBar)findViewById(R.id.progressBar);
        pb2 = (ProgressBar)findViewById(R.id.progressBar2);
        progText = (TextView)findViewById(R.id.textView6);
        handler = new Handler();
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

    public void startProgress(View view)
    {
        prog = pb1.getProgress();
        new Thread(new Runnable() {
            public void run() {
                while (prog < 100) {
                    prog += 1;
                    // Update the progress bar and display the current value in text view
                    handler.post(new Runnable() {
                        public void run() {
                            pb1.setProgress(prog);
                            progText.setText(prog+"/"+pb1.getMax());
                        }
                    });
                    try {
                        // Sleep for 100 milliseconds to show the progress slowly.
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }).start();
    }
    
}
