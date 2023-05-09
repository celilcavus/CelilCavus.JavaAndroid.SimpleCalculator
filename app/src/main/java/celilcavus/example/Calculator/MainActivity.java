package celilcavus.example.Calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private EditText NumberOne;
    private EditText NumberTwo;
    private TextView result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        NumberOne = findViewById(R.id.txtNumber1);
        NumberTwo = findViewById(R.id.txtNumber2);
        result = findViewById(R.id.resultText);

    }

    public void ClickTopla(View view) {
        if (!NumberOne.getText().toString().matches("") || !NumberTwo.getText().toString().matches("")) {
            int numberOne = Integer.parseInt(NumberOne.getText().toString());
            int numberTwo = Integer.parseInt(NumberTwo.getText().toString());

            int totalresult = (numberOne + numberTwo);
            result.setText("Sonuç : " + totalresult);
        } else {
            result.setText("Enter Number!!");
        }
    }

    public void ClickCikar(View view) {
        if (!NumberOne.getText().toString().matches("") || !NumberTwo.getText().toString().matches("")) {
            int numberOne = Integer.parseInt(NumberOne.getText().toString());
            int numberTwo = Integer.parseInt(NumberTwo.getText().toString());

            int totalresult = (numberOne - numberTwo);
            result.setText("Sonuç : " + totalresult);
        } else {
            result.setText("Enter Number!!");
        }


    }

    public void ClickCarp(View view) {
        if (!NumberOne.getText().toString().matches("") || !NumberTwo.getText().toString().matches("")) {
            int numberOne = Integer.parseInt(NumberOne.getText().toString());
            int numberTwo = Integer.parseInt(NumberTwo.getText().toString());

            int totalresult = (numberOne * numberTwo);
            result.setText("Sonuç : " + totalresult);
        } else {
            result.setText("Enter Number!!");
        }
    }

    public void ClickBol(View view) {
        if (!NumberOne.getText().toString().matches("") || !NumberTwo.getText().toString().matches("")) {
            int numberOne = Integer.parseInt(NumberOne.getText().toString());
            int numberTwo = Integer.parseInt(NumberTwo.getText().toString());

            int totalresult = (numberOne / numberTwo);
            result.setText("Sonuç : " + totalresult);
        } else {
            result.setText("Enter Number!!");
        }
    }
}