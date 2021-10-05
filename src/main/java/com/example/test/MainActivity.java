package com.example.test;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    Button button0, button1, button2, button3, button4, button5, button6, button7, button8, button9, buttonAdd, buttonSub, buttonDivision, buttonmul, button10, buttonC, buttonEqual;
    EditText testEditTest;

    float mValueOne, mValueTwo;

    boolean testAddition, mSubtract, testMultiplication, testDivision;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button0 = (Button) findViewById(R.id.button0);
        button1 = (Button) findViewById(R.id.button1);
        button2 = (Button) findViewById(R.id.button2);
        button3= (Button) findViewById(R.id.button3);
        button4 = (Button) findViewById(R.id.button4);
        button5 = (Button) findViewById(R.id.button5);
        button6 = (Button) findViewById(R.id.button6);
        button7 = (Button) findViewById(R.id.button7);
        button8 = (Button) findViewById(R.id.button8);
        button9= (Button) findViewById(R.id.button9);
        button10 = (Button) findViewById(R.id.button10);
        buttonAdd = (Button) findViewById(R.id.buttonadd);
        buttonSub = (Button) findViewById(R.id.buttonsub);
        buttonDivision = (Button) findViewById(R.id.buttondiv);
        buttonmul = (Button) findViewById(R.id.buttonmul);
        buttonC = (Button) findViewById(R.id.buttonC);
        buttonEqual = (Button) findViewById(R.id.buttoneql);
        testEditTest = (EditText) findViewById(R.id.edt1);


        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                testEditTest.setText(testEditTest.getText());
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                testEditTest.setText(testEditTest.getText());
            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                testEditTest.setText(testEditTest.getText());
            }
        });

        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                testEditTest.setText(testEditTest.getText());
            }
        });

        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                testEditTest.setText(testEditTest.getText());
            }
        });

        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                testEditTest.setText(testEditTest.getText());
            }
        });

        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                testEditTest.setText(testEditTest.getText());
            }
        });

        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                testEditTest.setText(testEditTest.getText());
            }
        });

        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                testEditTest.setText(testEditTest.getText());
            }
        });

        button0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                testEditTest.setText(testEditTest.getText());
            }
        });

        buttonAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (testEditTest == null) {
                    testEditTest.setText("");
                } else {
                    mValueOne = Float.parseFloat(String.valueOf(testEditTest.getText()));
                    testAddition = true;
                    testEditTest.setText(null);
                }
            }
        });

        buttonSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mValueOne = Float.parseFloat(String.valueOf(testEditTest.getText()));
                mSubtract = true;
                testEditTest.setText(null);
            }
        });

        buttonmul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mValueOne = Float.parseFloat(String.valueOf(testEditTest.getText()));
                testMultiplication = true;
                testEditTest.setText(null);
            }
        });

        buttonDivision.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mValueOne = Float.parseFloat(String.valueOf(testEditTest.getText()));
                testDivision = true;
                testEditTest.setText(null);
            }
        });

        buttonEqual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mValueTwo = Float.parseFloat(String.valueOf(testEditTest.getText()));

                if (testAddition == true) {
                    testEditTest.setText(mValueOne + mValueTwo + "");
                    testAddition = false;
                }

                if (mSubtract == true) {
                    testEditTest.setText(mValueOne - mValueTwo + "");
                    mSubtract = false;
                }

                if (testMultiplication == true) {
                    testEditTest.setText(mValueOne * mValueTwo + "");
                    testMultiplication = false;
                }

                if (testDivision == true) {
                    testEditTest.setText(mValueOne / mValueTwo + "" );
                    testDivision = false;
                }
            }
        });

        buttonC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                testEditTest.setText("");
            }
        });

        button10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                testEditTest.setText(testEditTest.getText() + ".");
            }
        });

    }
}