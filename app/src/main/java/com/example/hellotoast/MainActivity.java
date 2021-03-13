package com.example.hellotoast;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private int mcount = 0;
    private TextView mShowCount;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mShowCount = (TextView) findViewById(R.id.show_count);
    }

    public void countUp(View view) {
        mcount++;
        if (mShowCount != null)
            mShowCount.setText(Integer.toString(mcount));
    }

    public void showToast(View view) {
        Toast toast = Toast.makeText(this, R.string.app_name,
                Toast.LENGTH_SHORT);
        toast.show();
    }
}