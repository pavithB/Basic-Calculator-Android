package com.example.pavithbuddhima.calculatortest1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {


    Button btn0,btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9,btnequal,btndot,btnadd,btnsub,btnmultiply,btndevide,btnclear,btndel;
    TextView display;
    String fValue;
    String sValue;
    String operation;
    String answer;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        display =(TextView) findViewById(R.id.display);

        btn0 =(Button) findViewById(R.id.btn0);
        btn1 =(Button) findViewById(R.id.btn1);
        btn2 =(Button) findViewById(R.id.btn2);
        btn3 =(Button) findViewById(R.id.btn3);
        btn4 =(Button) findViewById(R.id.btn4);
        btn5 =(Button) findViewById(R.id.btn5);
        btn6 =(Button) findViewById(R.id.btn6);
        btn7 =(Button) findViewById(R.id.btn7);
        btn8 =(Button) findViewById(R.id.btn8);
        btn9 =(Button) findViewById(R.id.btn9);
        btnadd =(Button) findViewById(R.id.btnadd);
        btnsub =(Button) findViewById(R.id.btnsub);
        btnmultiply =(Button) findViewById(R.id.btnmultiply);
        btndevide =(Button) findViewById(R.id.btndevide);
//        btndel =(Button) findViewById(R.id.btndel);
        btnclear =(Button) findViewById(R.id.btnclear);
        btndot =(Button) findViewById(R.id.btndot);
        btnequal =(Button) findViewById(R.id.btnequal);

    }

    public void setbtn0(View v){
        display.append("0");

    }
    public void setbtn1(View v){
        display.append("1");

    }
    public void setbtn2(View v){
        display.append("2");

    }
    public void setbtn3(View v){
        display.append("3");

    }
    public void setbtn4(View v){
        display.append("4");

    }
    public void setbtn5(View v){
        display.append("5");

    }
    public void setbtn6(View v){
        display.append("6");

    }
    public void setbtn7(View v){
        display.append("7");

    }
    public void setbtn8(View v){
        display.append("8");

    }
    public void setbtn9(View v){
        display.append("9");

    }
    public void setbtndot(View v){
        display.append(".");

    }

    public void setbtnclear(View v){
        display.setText("");

    }
    public void setbtndel(View v){


        switch (display.getText().toString()) {

            case "":

             break;
            default:

                String text = display.getText().toString();
                display.setText(text.substring(0, text.length() - 1));
            break;

        }
    }
    public void setbtnadd(View v){


        switch (display.getText().toString()) {

            case "":

                break;
            default:

            fValue = display.getText().toString();
            operation = "add";
            display.setText("");
                break;
        }
    }
    public void setbtnsub(View v){


        switch (display.getText().toString()) {

            case "":

                break;
            default:

                fValue = display.getText().toString();
                operation = "sub";
                display.setText("");
                break;
        }

    }
    public void setbtnmultiply(View v){

        switch (display.getText().toString()) {

            case "":

                break;
            default:
                fValue = display.getText().toString();
                operation = "multiply";
                display.setText("");
                break;
        }
    }
    public void setbtndevide(View v){

        switch (display.getText().toString()) {

            case "":

                break;
            default:

                fValue = display.getText().toString();
                operation = "devide";
                display.setText("");
                break;
        }

    }
    public void setbtnequal(View v){

        switch (display.getText().toString()) {

            case "":

                break;
            default:

        sValue = display.getText().toString();

        double value1 , value2 ,result ;
        value1 = Double.parseDouble(fValue);
        value2 = Double.parseDouble(sValue);


        switch (operation) {


            case "add":
                result = value1 + value2;
                answer = String.valueOf(result);
                display.setText(answer);
                break;

            case "sub":
                result = value1 - value2;
                answer = String.valueOf(result);
                display.setText(answer);
                break;

            case "multiply":
                result = value1 * value2;
                answer = String.valueOf(result);
                display.setText(answer);
                break;

            case "devide":
                result = value1 / value2;
                answer = String.valueOf(result);
                display.setText(answer);
                break;
        }
            break;
        }





    }






}
