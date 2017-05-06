package com.mijnrekenmachine.mijnrekenmachine;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button btnplus, btnmin, btnkeer, btndeel;
    private TextView tvresultaat;
    private EditText veldeerstenummer, veldtweedenummer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
    }

    private void init() {
        btnplus =(Button) findViewById(R.id.btnPlus);
        btnmin =(Button) findViewById(R.id.btnMin);
        btnkeer =(Button) findViewById(R.id.btnKeer);
        btndeel =(Button) findViewById(R.id.btnDeel);
        veldeerstenummer =(EditText) findViewById(R.id.veldEersteNummer);
        veldtweedenummer =(EditText) findViewById(R.id.veldTweedeNummer);
        tvresultaat =(TextView) findViewById(R.id.tvResultaat);

        btnplus.setOnClickListener(this);
        btnmin.setOnClickListener(this);
        btnkeer.setOnClickListener(this);
        btndeel.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        String num1 = veldeerstenummer.getText().toString();
        String num2 = veldtweedenummer.getText().toString();

        switch(view.getId()) {
            case R.id.btnPlus:
                int optellen = Integer.parseInt(num1) + Integer.parseInt(num2);
                tvresultaat.setText(String.valueOf(optellen));
                break;
            case R.id.btnMin:
                int aftrekken = Integer.parseInt(num1) - Integer.parseInt(num2);
                tvresultaat.setText(String.valueOf(aftrekken));
                break;
            case R.id.btnKeer:
                int vermenigvuldigen = Integer.parseInt(num1) * Integer.parseInt(num2);
                tvresultaat.setText(String.valueOf(vermenigvuldigen));
                break;
            case R.id.btnDeel:
                int delen = Integer.parseInt(num1) / Integer.parseInt(num2);
                tvresultaat.setText(String.valueOf(delen));
                break;
        }
    }

}
