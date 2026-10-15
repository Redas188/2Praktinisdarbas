
package com.example.a2laboraswordcounter;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText input = findViewById(R.id.EditText1);
        Spinner spinner = findViewById(R.id.TypeCount);
        Button button = findViewById(R.id.buttonCount);
        TextView result = findViewById(R.id.Result);

        Textcounter counter = new Textcounter();

        button.setOnClickListener(v -> {
            String text = input.getText().toString();

            if (text.trim().isEmpty()) {
                Toast.makeText(this, R.string.empty_text_message,
                        Toast.LENGTH_SHORT).show();
                return;
            }

            int number;

            if (spinner.getSelectedItemPosition() == 0) {
                number = counter.countWords(text);
            } else {
                number = counter.countSigns(text);
            }

            result.setText(getString(R.string.result_label) + " " + number);
        });
    }
}
