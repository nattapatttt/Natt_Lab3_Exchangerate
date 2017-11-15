package com.example.natt.lab3_exchangerate;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    TextView tvTitle;
    EditText edInput;
    RadioButton rbtUS;
    RadioButton rbtJapan;
    Button btnExc;
    float rate = 0;
    final float usrate = 40;
    final float jprate = 30;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tvTitle = (TextView) findViewById(R.id.tvTitle);
        edInput = (EditText) findViewById(R.id.edInput);
        rbtUS = (RadioButton) findViewById(R.id.rbtUS);
        rbtJapan = (RadioButton) findViewById(R.id.rbtJapan);
        btnExc = (Button) findViewById(R.id.btnExc);
        btnExc.setOnClickListener(this);

    }

    public void onClick(View v) {

        if (rbtUS.isChecked()) {
            float input = Float.parseFloat(edInput.getText().toString());
            rate = input * usrate;
            edInput.setText(String.valueOf(rate));
        }
        if (rbtJapan.isChecked()) {
            float input = Float.parseFloat(edInput.getText().toString());
            rate = input * jprate;
            edInput.setText(String.valueOf(rate));
        }

        String s = Float.toString(rate);
        Toast.makeText(this, s, Toast.LENGTH_SHORT).show();
        Intent i = new Intent(MainActivity.this, Activity2.class);
        i.putExtra("rate", s);
        startActivity(i);

    }
}
