package com.geektech.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    private TextView tvResult;
    private Integer first, second;
    private Boolean isOperationClick;
    private String operation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tvResult = findViewById(R.id.tvResult);
    }

    public void onNumberClick(View view) {
        switch (view.getId()) {
            case R.id.btn_one:
            //    if (tvResult.getText().toString().equals("0")) {
              //      tvResult.setText("1");
             //   } else if (isOperationClick) {
              //      tvResult.setText("1");
            //    } else {
              //      tvResult.append("1");
                //      }
                setNumber("1");
                break;
            case R.id.btn_two:
                setNumber("2");
            break;
            case R.id.btn_three:
                setNumber("3");
                break;
            case R.id.btn_four:
                setNumber("4");
                break;
            case R.id.btn_five:
                setNumber("5");
                break;
            case R.id.btn_six:
                setNumber("6");
                break;
            case R.id.btn_seven:
                setNumber("7");
                break;
            case R.id.btn_eight:
                setNumber("8");
                break;
            case R.id.btn_nine:
                setNumber("9");
                break;
            case R.id.btn_zero:
                setNumber("0");
                break;


            case R.id.btn_clear:
                tvResult.setText("0");
                first=0;
                second=0;
                break;
        }

        isOperationClick = false;
    }

    public void onOperationClick(View view) {

        switch (view.getId()) {
            case R.id.btn_plus:
                first = Integer.parseInt(tvResult.getText().toString());
                operation = "+";
                break;
            case R.id.btn_minus:
                first=Integer.parseInt(tvResult.getText().toString());
                operation = "-";
            case R.id.btn_mult:
                first = Integer.parseInt(tvResult.getText().toString());
                operation="*";
                break;
            case R.id.btn_div:
                first = Integer.parseInt(tvResult.getText().toString());
                operation="/";
                break;
            case  R.id.btn_point:
                first=Integer.parseInt(tvResult.getText().toString());

                break;

            case R.id.btn_pm:
                first=Integer.parseInt(tvResult.getText().toString());

                break;


            case R.id.btn_procent:
                first=Integer.parseInt(tvResult.getText().toString());
                operation="%";
                break;


            case R.id.btn_equal:
                second = Integer.parseInt(tvResult.getText().toString());
                switch (operation){
                    case "+":
                        Integer result = first +second;
                        tvResult.setText(result.toString());
                        break;
                    case "-":
                        Integer minus = first - second;
                        tvResult.setText(minus.toString());
                        break;
                    case "*":
                        Integer mult=first*second;
                        tvResult.setText(mult.toString());
                        break;
                    case "/":
                        Integer div=first/second;
                        tvResult.setText(div.toString());
                        break;
                }

        }
        isOperationClick = true;
    }

    private void setNumber(String number){
        if (tvResult.getText().toString().equals("0")) {
            tvResult.setText(number);
        } else if (isOperationClick) {
            tvResult.setText(number);
        } else {
            tvResult.append(number);
        }
    }
}






