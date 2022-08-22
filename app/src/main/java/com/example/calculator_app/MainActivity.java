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

        int num1 = Integer.parseInt(firstNumber.getText().toString());
        int num2 = Integer.parseInt(secondNumber.getText().toString());

        int sum = num1 + num2;
        output.setText(""+sum);
    }

    public void findDifference(View view){
        EditText firstNumber = findViewById(R.id.firstValue);
        EditText secondNumber = findViewById(R.id.secondValue);
        TextView output = findViewById(R.id.output);

        int num1 = Integer.parseInt(firstNumber.getText().toString());
        int num2 = Integer.parseInt(secondNumber.getText().toString());

        int Difference = num1 - num2;
        output.setText(""+Difference);
    }

    public void findProduct(View view){
        EditText firstNumber = findViewById(R.id.firstValue);
        EditText secondNumber = findViewById(R.id.secondValue);
        TextView output = findViewById(R.id.output);

        int num1 = Integer.parseInt(firstNumber.getText().toString());
        int num2 = Integer.parseInt(secondNumber.getText().toString());

        int Product = num1 * num2;
        output.setText(""+Product);
    }

    public void findQuotient(View view){
        EditText firstNumber = findViewById(R.id.firstValue);
        EditText secondNumber = findViewById(R.id.secondValue);
        TextView output = findViewById(R.id.output);

        int num1 = Integer.parseInt(firstNumber.getText().toString());
        int num2 = Integer.parseInt(secondNumber.getText().toString());

        int Quotient = num1 / num2;
        output.setText(""+Quotient);
    }
}