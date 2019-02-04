package com.example.mp4_part2_christian_geoca;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    Button button0, button1, button2, button3, button4, button5, button6,
            button7, button8, button9, buttonAdd, buttonSub, buttonDiv,
            buttonMul, button10, buttonEqual;
    EditText result_EditText;

    float Val_1, Val_2;

    boolean Add, Sub, Multiplication, Division;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button0 = (Button) findViewById(R.id.button0);
        button1 = (Button) findViewById(R.id.button1);
        button2 = (Button) findViewById(R.id.button2);
        button3 = (Button) findViewById(R.id.button3);
        button4 = (Button) findViewById(R.id.button4);
        button5 = (Button) findViewById(R.id.button5);
        button6 = (Button) findViewById(R.id.button6);
        button7 = (Button) findViewById(R.id.button7);
        button8 = (Button) findViewById(R.id.button8);
        button9 = (Button) findViewById(R.id.button9);
        button10 = (Button) findViewById(R.id.button10);
        buttonAdd = (Button) findViewById(R.id.buttonadd);
        buttonSub = (Button) findViewById(R.id.buttonsub);
        buttonMul = (Button) findViewById(R.id.buttonmul);
        buttonDiv = (Button) findViewById(R.id.buttondiv);
        buttonEqual = (Button) findViewById(R.id.buttoneql);
        result_EditText = (EditText) findViewById(R.id.edt1);


        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result_EditText.setText(result_EditText.getText() + "1");
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result_EditText.setText(result_EditText.getText() + "2");
            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result_EditText.setText(result_EditText.getText() + "3");
            }
        });

        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result_EditText.setText(result_EditText.getText() + "4");
            }
        });

        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result_EditText.setText(result_EditText.getText() + "5");
            }
        });

        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result_EditText.setText(result_EditText.getText() + "6");
            }
        });

        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result_EditText.setText(result_EditText.getText() + "7");
            }
        });

        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result_EditText.setText(result_EditText.getText() + "8");
            }
        });

        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result_EditText.setText(result_EditText.getText() + "9");
            }
        });

        button0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result_EditText.setText(result_EditText.getText() + "0");
            }
        });

        buttonAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (result_EditText == null) {
                    result_EditText.setText("");
                } else {
                    Val_1 = Float.parseFloat(result_EditText.getText() + "");
                    Add = true;
                    result_EditText.setText(null);
                }
            }
        });

        buttonSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Val_1 = Float.parseFloat(result_EditText.getText() + "");
                Sub = true;
                result_EditText.setText(null);
            }
        });

        buttonMul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Val_1 = Float.parseFloat(result_EditText.getText() + "");
                Multiplication = true;
                result_EditText.setText(null);
            }
        });

        buttonDiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Val_1 = Float.parseFloat(result_EditText.getText() + "");
                Division = true;
                result_EditText.setText(null);
            }
        });

        buttonEqual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Val_2 = Float.parseFloat(result_EditText.getText() + "");

                if (Add == true) {
                    result_EditText.setText(Val_1 + Val_2 + "");
                    Add = false;
                }

                if (Sub == true) {
                    result_EditText.setText(Val_1 - Val_2 + "");
                    Sub = false;
                }

                if (Multiplication == true) {
                    result_EditText.setText(Val_1 * Val_2 + "");
                    Multiplication = false;
                }

                if (Division == true) {
                    result_EditText.setText(Val_1 / Val_2 + "");
                    Division = false;
                }
            }
        });



        button10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result_EditText.setText(result_EditText.getText() + ".");
            }
        });
    }
}