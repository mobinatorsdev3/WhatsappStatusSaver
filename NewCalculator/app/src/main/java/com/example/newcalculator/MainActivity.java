package com.example.newcalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    Button btn0,btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9,btndot,btnadd,btnsub,btnmul,btndiv,btnmode,btnclear,btnequal;
    EditText ed1;
    int res1,res2;
    Boolean add,sub,mul,div,mode;
    int ans;
    void storepre(){
        res1 = Integer.parseInt( ed1.getText()+"");
    }
    void setfalse(){
        add=sub=mul=div=false;
    }

    void clear(){
        res1 = Integer.parseInt(null);
        ed1.setText(null);
        setfalse();

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn0 = (Button) findViewById(R.id.btn0);
        btn1 = (Button) findViewById(R.id.btn1);
        btn2 = (Button) findViewById(R.id.btn2);
        btn3 = (Button) findViewById(R.id.btn3);
        btn4 = (Button) findViewById(R.id.btn4);
        btn5 = (Button) findViewById(R.id.btn5);
        btn6 = (Button) findViewById(R.id.btn6);
        btn7 = (Button) findViewById(R.id.btn7);
        btn8 = (Button) findViewById(R.id.btn8);
        btn9 = (Button) findViewById(R.id.btn9);
        btndot = (Button) findViewById(R.id.btndot);
        btnadd = (Button) findViewById(R.id.btnadd);
        btnsub = (Button) findViewById(R.id.btnsub);
        btnmul = (Button) findViewById(R.id.btnmul);
        btndiv = (Button) findViewById(R.id.btndiv);
        btnmode = (Button) findViewById(R.id.btnmode);
        btnclear = (Button) findViewById(R.id.btnclear);
        btnequal = (Button) findViewById(R.id.btnequal);
        ed1 = (EditText) findViewById(R.id.ed1);

        btn0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ed1.setText(ed1.getText() +"0");
            }
        });


        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ed1.setText(ed1.getText() +"1");
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ed1.setText(ed1.getText() +"2");
            }
        });

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ed1.setText(ed1.getText() +"3");
            }
        });

        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ed1.setText(ed1.getText() +"4");
            }
        });
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ed1.setText(ed1.getText() +"5");
            }
        });
        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ed1.setText(ed1.getText() +"6");
            }
        });
        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ed1.setText(ed1.getText() +"7");
            }
        });
        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ed1.setText(ed1.getText() +"8");
            }
        });
        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ed1.setText(ed1.getText() +"9");
            }
        });
        btndot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ed1.setText(ed1.getText() +".");
            }
        });


        btnadd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (ed1==null){
                    ed1.setText("");
                }
                else{
                    storepre();
                    setfalse();
                    add=true;
                    ed1.setText(null);

                }
            }
        });

        btnsub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (ed1==null){
                    ed1.setText("");
                }
                else{
                    storepre();
                    setfalse();
                    sub=true;
                    ed1.setText(null);

                }
            }
        });

        btnmul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (ed1==null){
                    ed1.setText("");
                }
                else{
                    storepre();
                    setfalse();
                    mul=true;
                    ed1.setText(null);

                }
            }
        });

        btndiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (ed1==null){
                    ed1.setText("");
                }
                else{
                    storepre();
                    setfalse();
                    div=true;
                    ed1.setText(null);

                }
            }
        });

        btnmode.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (ed1==null){
                    ed1.setText("");
                }
                else{
                    storepre();
                    setfalse();
                    mode=true;
                    ed1.setText(null);

                }
            }
        });



        btnequal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (add){
                    ed1.setText(res1+Integer.parseInt(ed1.getText()+"")+"");
                }
                if (sub){
                    ed1.setText(Integer.parseInt(ed1.getText()+"")-res1+"");
                }
                if (mul){
                    ed1.setText(Integer.parseInt(ed1.getText()+"")*res1+"");
                }
                if (div){
                    ed1.setText(Integer.parseInt(ed1.getText()+"")/res1+"");
                }
                if (mode){
                    ed1.setText(Integer.parseInt(ed1.getText()+"")%res1+"");
                }
            }
        });

        btnclear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clear();

            }
        });


    }
}