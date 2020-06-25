package com.example.day3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.InputFilter;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final EditText quiz = findViewById(R.id.editText);
        final EditText homework = findViewById(R.id.editText2);
        final EditText mid = findViewById(R.id.editText3);
        final EditText Final = findViewById(R.id.editText4);
        final TextView result = findViewById(R.id.textView6);
               Button calc = findViewById(R.id.button2);

        calc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String num = quiz.getText().toString();
                String num2 = homework.getText().toString();
                String num3 = mid.getText().toString();
                String num4 = Final.getText().toString();

                double n1 = Double.parseDouble(num);
                double n2 = Double.parseDouble(num2);
                double n3 = Double.parseDouble(num3);
                double n4 = Double.parseDouble(num4);

                double a = n1+n2+n3+n4 ;

                result.setText(student(a));


            }
        });


    }
    public char student (double x)
    {
        if (( x < 60) && (0 < x))
        {
            return 'F';
        }

        else if (( x < 70) && (0 < x))
        {
            return 'D' ;
        }

        else if ((x < 80 ) && (0 < x))
        {

            return 'C' ;
        }
        else if ((x < 90) && (0 < x))
        {

            return 'B' ;
        }
        else if ((x <= 100)&& (0 < x))
        {
            return 'A' ;
        }

        else { return 'E' ;}

    }









}
