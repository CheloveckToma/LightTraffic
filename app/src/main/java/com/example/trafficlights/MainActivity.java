package com.example.trafficlights;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.ContextCompat;

import android.content.Context;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {
private ConstraintLayout CL;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        CL = findViewById(R.id.ConsraintLayout);
    }
    public void onClickRedButton(View view){
        CL.setBackgroundColor(ContextCompat.getColor(this,R.color.colorRed));
    }
    public void onClickGreenButton(View view){
        CL.setBackgroundColor(ContextCompat.getColor(this,R.color.colorGreen));
    }
    public void onClickOrangeButton(View view){
        CL.setBackgroundColor(ContextCompat.getColor(this,R.color.colorOrange));
    }
}
