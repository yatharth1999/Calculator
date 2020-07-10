package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.SparseIntArray;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.lang.reflect.Array;

public class MainActivity extends AppCompatActivity {
    private Button bu1;
    private Button bu2;
    private Button bu3;
    private Button bu4;
    private Button bu5;
    private Button bu6;
    private Button bu7;
    private Button bu8;
    private Button bu9;
    private Button bu0;
    private Button pl;
    private Button min;
    private Button dev;
    private Button mul;
    private Button eq;
    private Button b;
    String s ="",f="";
    TextView T;
    int j=0,l=0,k=0,q=0,w=0;
    double r;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        T = findViewById(R.id.textView);
        bu0= findViewById(R.id.b0);
        bu1= findViewById(R.id.b1);
        bu2= findViewById(R.id.b2);
        bu3= findViewById(R.id.b3);
        bu4= findViewById(R.id.b4);
        bu5= findViewById(R.id.b5);
        bu6= findViewById(R.id.b6);
        bu7= findViewById(R.id.b7);
        bu8= findViewById(R.id.b8);
        bu9= findViewById(R.id.b9);
        pl=findViewById(R.id.plus);
        min=findViewById(R.id.minus);
        eq=findViewById(R.id.equal);
        b=findViewById(R.id.errase);
        mul=findViewById(R.id.multiply);
        dev=findViewById(R.id.divide);
        eq=findViewById(R.id.equal);


        bu0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                s +="0";
                f +="0";
                T.setText(s);
            }
        });
        bu1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                s +="1";
                f +="1";
                T.setText(s);
            }
        });
        bu2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                s +="2";
                f +="2";
                T.setText(s);
            }
        });
        bu3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                s +="3";
                f +="3";
                T.setText(s);
            }
        });
        bu4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                s +="4";
                f +="4";
                T.setText(s);
            }
        });
        bu5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                s +="5";
                f +="5";
                T.setText(s);
            }
        });
        bu6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                s +="6";
                f +="6";
                T.setText(s);
            }
        });
        bu7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                s +="7";
                f +="7";
                T.setText(s);
            }
        });
        bu8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                s +="8";
                f +="8";
                T.setText(s);
            }
        });
        bu9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                s +="9";
                f +="9";
                T.setText(s);
            }
        });
        pl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (r==0&j==0){
                    r=Integer.parseInt(f);
                    f="";
                    s+="+";
                    j=j+1;
                    T.setText(s);
                }
                else{
                    add();
                    j=j+1;
                }


            }
        });
        mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (r==0&q==0){
                    r=Integer.parseInt(f);
                    f="";
                    s+="*";
                    q=q+1;
                    T.setText(s);
                }
                else{
                    mul();
                    q=q+1;
                }


            }
        });
        dev.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (r==0&w==0){
                    r=Integer.parseInt(f);
                    f="";
                    s+="/";
                    w=w+1;
                    T.setText(s);
                }
                else{
                    div();
                    w=w+1;
                }


            }
        });

        min.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (r==0&l==0){
                    r=Integer.parseInt(f);
                    f="";
                    s+="-";
                    l=l+1;
                    T.setText(s);
                }
                else{
                    sub();
                    l=l+1;
                }


            }
        });
        eq.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                for(int i=0;i<w;i++){
                    div();
                }
                for(int i=0;i<q;i++){
                    mul();
                }
                for(int i=0;i<j;i++){
                    add();
                }
                for(int i=0;i<l;i++){
                    sub();
                }
                T.setText("="+String.valueOf(r));
                s="";
                f="";
                r=0;
                j=0;
                l=0;
                q=0;
                w=0;
            }
        });
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (k == 0) {
                    try {
                        if (s != null) {
                            StringBuffer sb = new StringBuffer(s);
                            sb = sb.deleteCharAt(sb.length() - 1);
                            s = sb.toString();
                            T.setText(s);
                        }
                        if (f != null) {
                            StringBuffer sb = new StringBuffer(f);
                            sb = sb.deleteCharAt(sb.length() - 1);
                            f = sb.toString();

                        }
                    } catch (Exception e) {

                    }
                    k = k + 1;
                }
            else{
                    s = "";
                    f = "";
                    r = 0;
                    j = 0;
                    l = 0;
                    k= 0;
                    q=0;
                    w=0;
                    T.setText(s);
                }

            }});

    }
    private void div(){

        try {
            int a =Integer.parseInt(f);
            if (a!=0){
            r=r/a;
            s+="/";
            T.setText(s);
            f="";}

        }catch (Exception e) {

        }
    }
    private void mul(){

        try {
            int a =Integer.parseInt(f);
            r=r*a;
            s+="*";
            T.setText(s);
            f="";
        }catch (Exception e) {

        }
    }
    private void add(){

        try {
            int a =Integer.parseInt(f);
            r=r+a;
            s+="+";
            T.setText(s);
            f="";
        }catch (Exception e) {

        }
    }
    private void sub(){

        try {
            int a =Integer.parseInt(f);
            r=r-a;
            s+="-";
            T.setText(s);
            f="";
        }catch (Exception e) {

        }
    }
}