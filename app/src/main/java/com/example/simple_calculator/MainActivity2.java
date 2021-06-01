package com.example.simple_calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity2 extends AppCompatActivity {
    Button b1;
    Button b2;
    Button b3;
    Button b4;
    Button b5;
    Button b6;
    Button b7;
    Button b8;
    Button b9;
    Button bzero;
    Button bzero_0;
    Button b_dot;
    Button b_mul;
    Button b_minus;
    Button b_plus;
    Button b_res;
    Button b_clear;
    Button b_per;
    Button delete;
    Button b_div;
    TextView view;
    float num1;
    float num2;
    Boolean floatNumber=false;
    String op;
    boolean operation = false;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        resultButtonListener();
    }

public  void resultButtonListener(){
    b1 = findViewById(R.id.b01);
    b2 = findViewById(R.id.b02);
    b3 =  findViewById(R.id.b03);
    b4 = findViewById(R.id.b04);
    b5 = findViewById(R.id.b05);
    b6 = findViewById(R.id.b06);
    b7 = findViewById(R.id.b07);
    b8 =  findViewById(R.id.b08);
    b9 = findViewById(R.id.b09);
    bzero= findViewById(R.id.b0);
    bzero_0= findViewById(R.id.b00);
    b_dot=  findViewById(R.id.bdot);
    b_plus=  findViewById(R.id.bplus);
    b_minus=findViewById(R.id.bminus);
    b_mul=  findViewById(R.id.bmul);
    b_div= findViewById(R.id.bdiv);
    delete= findViewById(R.id.del);
    b_clear= findViewById(R.id.bc);
    b_per=findViewById(R.id.bper);
    b_res = findViewById(R.id.bres);
    view = findViewById(R.id.view);

   b1.setOnClickListener(new View.OnClickListener() {
       @Override
       public void onClick(View v) {
       view.setText(view.getText().toString() + "1");

       }
   });

    b2.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            view.setText(view.getText().toString() + "2");

        }
    });
    b3.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            view.setText(view.getText().toString() + "3");

        }
    });
    b4.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            view.setText(view.getText().toString() + "4");

        }
    });
    b5.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            view.setText(view.getText().toString() + "5");

        }
    });
    b6.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            view.setText(view.getText().toString() + "6");

        }
    });
    b7.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            view.setText(view.getText().toString() + "7");

        }
    });
    b8.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            view.setText(view.getText().toString() + "8");

        }
    });
    b9.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            view.setText(view.getText().toString() + "9");

        }
    });
    bzero.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            view.setText(view.getText().toString() + "0");

        }
    });
    bzero_0.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            view.setText(view.getText().toString() + "00");

        }
    });

    b_dot.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            view.setText(view.getText().toString() + ".");
           floatNumber=true;

        }
    });

    b_clear.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            view.setText(null);

            floatNumber=false;
        }
    });
    delete.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            String s;
            s=view.getText().toString();
            String replace="";
            for(int i=0;i<s.length()-1;i++){
                replace=replace+s.charAt(i);
            }
            view.setText(replace.toString());

        }
    });
    b_per.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            view.setText(view.getText().toString() + "%");

        }
    });
    b_plus.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            if (view.getText().toString().length()==0) {
                NoInputWarning();

            } else {
                num1 = Float.parseFloat(view.getText().toString());
                view.setText(null);
                op = "+";

            }
        }
    });
    b_minus.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            if (view.getText().toString().length() == 0) {
                NoInputWarning();

            } else {
                num1 = Float.parseFloat(view.getText().toString());
                view.setText(null);
                op = "-";
            }
        }
    });
    b_div.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            if (view.getText().toString().length() == 0) {
                NoInputWarning();

            } else {
                num1 = Float.parseFloat(view.getText().toString());
                view.setText(null);
                op = "/";

            }
        }
    });
    b_mul.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            if (view.getText().toString().length() == 0) {
                NoInputWarning();

            } else {
                num1 = Float.parseFloat(view.getText().toString());
                view.setText(null);
                op = "*";

            }
        }
    });
    b_res.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            if (view.getText().toString().length() == 0) {
                NoInputWarning();

            } else {
                num2 = Float.parseFloat(view.getText().toString());
                float Result;
                if (floatNumber) {
                    switch (op) {
                        case "+":
                            Result = num1 + num2;
                            view.setText(Float.toString(Result));
                            break;
                        case "-":
                            Result = num1 - num2;
                            view.setText(Float.toString(Result));
                            break;
                        case "*":
                            Result = num1 * num2;
                            view.setText(Float.toString(Result));
                            break;
                        case "/":
                            Result = num1 / num2;
                            view.setText(Float.toString(Result));
                            break;

                    }
                    floatNumber = false;
                } else {
                    int num3;
                    switch (op) {
                        case "+":
                            num3 = (int) (num1 + num2);
                            view.setText(Integer.toString(num3));
                            break;
                        case "-":
                            num3 = (int) (num1 - num2);
                            view.setText(Integer.toString(num3));
                            break;
                        case "*":
                            num3 = (int) (num1 * num2);
                            view.setText(Integer.toString(num3));
                            break;
                        case "/":
                            num3 = (int) (num1 / num2);
                            view.setText(Integer.toString(num3));
                            break;

                    }


                }
            }
        }
    });







}
    public void NoInputWarning(){

        Toast.makeText(MainActivity2.this,"Please input number", Toast.LENGTH_LONG).show();


    }
}