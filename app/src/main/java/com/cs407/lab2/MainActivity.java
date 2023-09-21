package com.cs407.lab2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.util.Objects;
import java.lang.Object;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void timesFunction(View view){
        float firstNum = Integer.parseInt(checkNums((EditText) findViewById(R.id.num1)));
        float secondNum = Integer.parseInt(checkNums((EditText) findViewById(R.id.num2)));
        if(firstNum == 0 || secondNum == 0)
            Toast.makeText(MainActivity.this, "Enter a number in both fields", Toast.LENGTH_LONG).show();
        else {
            Intent intent = new Intent(this, CalculatorActivity.class);
            intent.putExtra("answer", String.valueOf(firstNum*secondNum));
            startActivity(intent);
        }
    }
    public void divideFunction(View view){
        float firstNum = Integer.parseInt(checkNums((EditText) findViewById(R.id.num1)));
        float secondNum = Integer.parseInt(checkNums((EditText) findViewById(R.id.num2)));
        if(secondNum == 0)
            Toast.makeText(MainActivity.this, "Cannot divide by nothing", Toast.LENGTH_LONG).show();
        else if(firstNum == 0)
            Toast.makeText(MainActivity.this, "Enter a number in both fields", Toast.LENGTH_LONG).show();
        else {
            Intent intent = new Intent(this, CalculatorActivity.class);
            intent.putExtra("answer", String.valueOf(firstNum/secondNum));
            startActivity(intent);
        }
    }
    public void addFunction(View view){
        float firstNum = Integer.parseInt(checkNums((EditText) findViewById(R.id.num1)));
        float secondNum = Integer.parseInt(checkNums((EditText) findViewById(R.id.num2)));
        if(firstNum == 0 || secondNum == 0)
            Toast.makeText(MainActivity.this, "Enter a number in both fields", Toast.LENGTH_LONG).show();
        else {
            Intent intent = new Intent(this, CalculatorActivity.class);
            intent.putExtra("answer", String.valueOf(firstNum+secondNum));
            startActivity(intent);
        }
    }
    public void subtractFunction(View view){
        float firstNum = Integer.parseInt(checkNums((EditText) findViewById(R.id.num1)));
        float secondNum = Integer.parseInt(checkNums((EditText) findViewById(R.id.num2)));
        if(firstNum == 0 || secondNum == 0)
            Toast.makeText(MainActivity.this, "Enter a number in both fields", Toast.LENGTH_LONG).show();
        else {
            Intent intent = new Intent(this, CalculatorActivity.class);
            intent.putExtra("answer", String.valueOf(firstNum-secondNum));
            startActivity(intent);
        }
    }
    private String checkNums(EditText editText){
        if(Objects.nonNull(editText) && Objects.nonNull(editText.getText()) && !editText.getText().toString().isEmpty()){
            Log.i("INFO",String.valueOf(editText.getText().toString()));
            return editText.getText().toString();
        }
        return "0";
    }
}