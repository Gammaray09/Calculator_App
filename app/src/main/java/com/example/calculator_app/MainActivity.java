package com.example.calculator_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    double answer = 0.0;

    public void findSum(View view){
        EditText firstNumber = findViewById(R.id.firstValue);
        EditText secondNumber = findViewById(R.id.secondValue);
        TextView output = findViewById(R.id.output);
        if(firstNumber.getText().toString().equals("") || secondNumber.getText().toString().equals("")){
            output.setText("Empty Input");
        }else {
            double num1 = Double.parseDouble(firstNumber.getText().toString());
            double num2 = Double.parseDouble(secondNumber.getText().toString());

            double sum = num1 + num2;
            output.setText("" + sum);
            answer = sum;
        }
        closeKeyboard();

    }

    public void findDifference(View view){
        EditText firstNumber = findViewById(R.id.firstValue);
        EditText secondNumber = findViewById(R.id.secondValue);
        TextView output = findViewById(R.id.output);

        if(firstNumber.getText().toString().equals("") || secondNumber.getText().toString().equals("")){
            output.setText("Empty Input");
        }else {
            double num1 = Double.parseDouble(firstNumber.getText().toString());
            double num2 = Double.parseDouble(secondNumber.getText().toString());

            double difference = num1 - num2;
            output.setText("" + difference);
            answer = difference;
        }
        closeKeyboard();
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


            double product = num1 * num2;
            output.setText(""+product);
            answer = product;
        }
        closeKeyboard();
    }

    public void findQuotient(View view){
        EditText firstNumber = findViewById(R.id.firstValue);
        EditText secondNumber = findViewById(R.id.secondValue);
        TextView output = findViewById(R.id.output);

        if(firstNumber.getText().toString().equals("") || secondNumber.getText().toString().equals("")){
            output.setText("Empty Input");
        }else {
            double num1 = Double.parseDouble(firstNumber.getText().toString());
            double num2 = Double.parseDouble(secondNumber.getText().toString());

            double quotient = num1 / num2;
            output.setText("" + quotient);
            answer = quotient;

        }
        closeKeyboard();
    }


    public void round(View view){
        TextView output = findViewById(R.id.output);

        int intAnswer = (int) Math.round(answer);
        output.setText("" + intAnswer);
    }

    public void absolute(View view){
        TextView output = findViewById(R.id.output);

        if(answer < 0){
            answer = answer * -1;
        }

        output.setText("" + answer);
    }



    public void Exponent(View view){
        EditText firstNumber = findViewById(R.id.firstValue);
        EditText secondNumber = findViewById(R.id.secondValue);
        TextView output = findViewById(R.id.output);

        if(firstNumber.getText().toString().equals("") || secondNumber.getText().toString().equals("")){
            output.setText("Empty Input");
        }else {
            double num1 = Double.parseDouble(firstNumber.getText().toString());
            double num2 = Double.parseDouble(secondNumber.getText().toString());

            double expAnswer = Math.pow(num1,num2);
            output.setText("" + expAnswer);
            answer = expAnswer;

        }
        closeKeyboard();
    }

    public void clear(View view){
        EditText firstNumber = findViewById(R.id.firstValue);
        EditText secondNumber = findViewById(R.id.secondValue);
        TextView output = findViewById(R.id.output);

        firstNumber.setText("");
        secondNumber.setText("");
        output.setText("");
    }


    //https://www.geeksforgeeks.org/how-to-programmatically-hide-android-soft-keyboard/
    private void closeKeyboard()
    {
        // this will give us the view
        // which is currently focus
        // in this layout
        View view = this.getCurrentFocus();

        // if nothing is currently
        // focus then this will protect
        // the app from crash
        if (view != null) {

            // now assign the system
            // service to InputMethodManager
            InputMethodManager manager
                    = (InputMethodManager)
                    getSystemService(
                            Context.INPUT_METHOD_SERVICE);
            manager
                    .hideSoftInputFromWindow(
                            view.getWindowToken(), 0);
        }
    }
}