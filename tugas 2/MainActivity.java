package com.example.latihan1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText val1, val2;
    TextView result;
    Button button1,button2,button3,button4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        val1 = findViewById(R.id.val1);
        val2 = findViewById(R.id.val2);
        result = findViewById(R.id.tvhasil);
        button1 = findViewById(R.id.buttonpenambahan);
        button2 = findViewById(R.id.buttonpengurangan);
        button3 = findViewById(R.id.buttonperkalian);
        button4 = findViewById(R.id.buttonpembagian);


        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    double value1 = Double.parseDouble(val1.getText().toString());
                    double value2 = Double.parseDouble(val2.getText().toString());
                    double hasil = value1 + value2;
                    result.setText(String.valueOf(hasil));


                }
                catch (NumberFormatException e) {
                    result.setText("Masukkan angka yang valid");
                }
            }

        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    double value1 = Double.parseDouble(val1.getText().toString());
                    double value2 = Double.parseDouble(val2.getText().toString());
                    double hasil = value1 - value2;
                    result.setText(String.valueOf(hasil));


                }
                catch (NumberFormatException e) {
                    result.setText("Masukkan angka yang valid");
                }

            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    double value1 = Double.parseDouble(val1.getText().toString());
                    double value2 = Double.parseDouble(val2.getText().toString());
                    double hasil = value1 * value2;
                    result.setText(String.valueOf(hasil));


                }
                catch (NumberFormatException e) {
                    result.setText("Masukkan angka yang valid");
                }
            }
        });

        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    double value1 = Double.parseDouble(val1.getText().toString());
                    double value2 = Double.parseDouble(val2.getText().toString());
                    double hasil = value1 / value2;
                    result.setText(String.valueOf(hasil));


                }
                catch (NumberFormatException e) {
                    result.setText("Masukkan angka yang valid");
                }

            }
        });
    }
}
