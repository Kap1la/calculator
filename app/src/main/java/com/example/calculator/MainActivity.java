package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button b0, b1, b2, b3, b4, b5, b6, b7, b8, b9, bplus, bminus, bslash, btimes, bdot, bequals;
    Button bC;
    TextView ed1;
    float res1, res2;
    Boolean Add, Sub, Mul, Div;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b0 = (Button) findViewById(R.id.b0);
        b1 = (Button) findViewById(R.id.b1);
        b2 = (Button) findViewById(R.id.b2);
        b3 = (Button) findViewById(R.id.b3);
        b4 = (Button) findViewById(R.id.b4);
        b5 = (Button) findViewById(R.id.b5);
        b6 = (Button) findViewById(R.id.b6);
        b7 = (Button) findViewById(R.id.b7);
        b8 = (Button) findViewById(R.id.b8);
        b9 = (Button) findViewById(R.id.b9);
        bplus = (Button) findViewById(R.id.bplus);
        bminus = (Button) findViewById(R.id.bminus);
        bslash = (Button) findViewById(R.id.bslash);
        btimes = (Button) findViewById(R.id.btimes);
        bdot = (Button) findViewById(R.id.bdot);
        bequals = (Button) findViewById(R.id.bequals);
        bC = (Button) findViewById(R.id.bC);
        ed1 = (EditText) findViewById(R.id.editText);
        b0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ed1.setText(ed1.getText() + "0");
            }
        });
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ed1.setText(ed1.getText() + "1");
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ed1.setText(ed1.getText() + "2");
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ed1.setText(ed1.getText() + "3");
            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ed1.setText(ed1.getText() + "4");
            }
        });
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ed1.setText(ed1.getText() + "5");
            }
        });
        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ed1.setText(ed1.getText() + "6");
            }
        });
        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ed1.setText(ed1.getText() + "7");
            }
        });
        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ed1.setText(ed1.getText() + "8");
            }
        });
        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ed1.setText(ed1.getText() + "9");
            }
        });
        bdot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ed1.setText(ed1.getText() + ".");
            }
        });
        bplus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(ed1 != null){
                    res1 = Float.parseFloat(ed1.getText()+"");
                    Add = true;
                    ed1.setText(null);
                }else {
                    ed1.setText("");
                }
            }
        });
        bminus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(ed1 != null){
                    res1 = Float.parseFloat(ed1.getText()+"");
                    Sub = true;
                    ed1.setText(null);
                }else {
                    ed1.setText("");
                }
            }
        });
        btimes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(ed1 != null){
                    res1 = Float.parseFloat(ed1.getText()+"");
                    Mul = true;
                    ed1.setText(null);
                }else {
                    ed1.setText("");
                }
            }
        });
        bslash.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(ed1 != null){
                    res1 = Float.parseFloat(ed1.getText()+"");
                    Div = true;
                    ed1.setText(null);
                }else {
                    ed1.setText("");
                }
            }
        });
        bequals.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                res2 = Float.parseFloat(ed1.getText()+"");
                if(Add==true){
                    ed1.setText(res1+res2+"");
                    Add = false;
                }else if(Sub==true){
                    ed1.setText(res1-res2+"");
                    Sub = false;
                }else if(Mul==true){
                    ed1.setText(res1*res2+"");
                    Mul = false;
                }else if(Div==true){
                    ed1.setText(res1/res2+"");
                    Div = false;
                }
            }
        });
        bC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ed1.setText("");
            }
        });
    }
}
