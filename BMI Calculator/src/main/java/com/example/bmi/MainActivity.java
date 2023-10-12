package com.example.bmi;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView result;
        EditText wthint,htfthint,htinhint;
        Button calbutton;

        result=findViewById(R.id.result);
        wthint=findViewById(R.id.wthint);
        htfthint=findViewById(R.id.htfthint);
        htinhint=findViewById(R.id.htinhint);
        calbutton=findViewById(R.id.calcbutton);

        calbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int wt=Integer.parseInt(wthint.getText().toString());
                int inch=Integer.parseInt(htinhint.getText().toString());
                int foot=Integer.parseInt(htfthint.getText().toString());

                int totalinch= (foot*12) + inch;
                double ht=(totalinch*2.53)/100;
                double bmi= wt/(Math.pow(ht,2));
                if(bmi<18)
                    result.setText("You are muttal");
                else if(bmi>25)
                    result.setText("you are bhaesa");
                else
                    result.setText("you are g@y unless you are shreyansh");


            }
        });



    }
}