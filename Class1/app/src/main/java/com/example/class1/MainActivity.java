package com.example.class1;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Typeface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText t1,t2;
    Button b1;
    TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        t1 =findViewById(R.id.t1);
        t2 =findViewById(R.id.t2);
        tv = findViewById(R.id.res);
    }

    public void process(View view){
        int n1 =Integer.parseInt(t1.getText().toString());
        int n2 =Integer.parseInt(t2.getText().toString());
        int n3 = n1+n2;

        tv.setText("Sum: " +n3);

    }
}