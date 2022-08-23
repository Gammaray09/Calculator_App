package com.example.calculator_app;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void findSum(View view){
        EditText firstNumber = findViewById(R.id.firstValue);
        EditText secondNumber = findViewById(R.id.secondValue);
        TextView output = findViewById(R.id.output);



    }

    public void findDifference(View view){
        EditText firstNumber = findViewById(R.id.firstValue);
        EditText secondNumber = findViewById(R.id.secondValue);
        TextView output = findViewById(R.id.output);

        double num1 = Double.parseDouble(firstNumber.getText().toString());
        double num2 = Double.parseDouble(secondNumber.getText().toString());

        double Difference = num1 - num2;
        output.setText(""+Difference);
    }

    public void findProduct(View view){
        EditText firstNumber = findViewById(R.id.firstValue);
        EditText secondNumber = findViewById(R.id.secondValue);
        TextView output = findViewById(R.id.output);

        if(firstNumber.getText().toString().equals("") || secondNumber.getText().toString().equals("")){
            output.setText("Empty Input");
        }else{
            double num1 = Double.parseDouble(firstNumber.getText().toString());
            double num2 = Double.parseDouble(secondNumber.getText().toString());


            double Product = num1 * num2;
            output.setText(""+Product);
        }
    }

    public void findQuotient(View view){
        EditText firstNumber = findViewById(R.id.firstValue);
        EditText secondNumber = findViewById(R.id.secondValue);
        TextView output = findViewById(R.id.output);

        double num1 = Double.parseDouble(firstNumber.getText().toString());
        double num2 = Double.parseDouble(secondNumber.getText().toString());

        double Quotient = num1 / num2;
        output.setText(""+Quotient);
    }
}