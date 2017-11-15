package com.example.natt.lab3_exchangerate;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class Activity2 extends AppCompatActivity implements View.OnClickListener{
    TextView text2;
    public String showanswer;
    Button btnBack;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);
        text2 = (TextView) findViewById(R.id.text2);
        Intent intent = getIntent();
        showanswer = getIntent().getStringExtra("rate");
        Toast.makeText(this, showanswer, Toast.LENGTH_SHORT).show();
        text2.setText(showanswer);
        btnBack = (Button) findViewById(R.id.btnBack);
        btnBack.setOnClickListener(this);

    }
    public void onClick(View j) {

        Intent k = new Intent(Activity2.this, MainActivity.class);

        startActivity(k);
    }

}
