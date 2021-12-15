package com.example.wordcountapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private Spinner spOption;
    private EditText edInput;
    private TextView tvResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.spOption = findViewById(R.id.spOption);
        this.edInput = findViewById(R.id.edInputText);
        this.tvResult = findViewById(R.id.tvResultText);

        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.spSelected, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spOption.setAdapter(adapter);
    }

    public void onCountBtnClick(View view) {
        String spSelected = this.spOption.getSelectedItem().toString();
        if(TextUtils.isEmpty(edInput.getText().toString())) {
            Toast.makeText(this,"Empty input field!",Toast.LENGTH_SHORT).show();
        } else {
            String inputText = this.edInput.getText().toString();
            if(spSelected.equals("Chars")) {
                int charCount = TextCounter.getCharCount(inputText);
                this.tvResult.setText(String.valueOf(charCount));
            } else if(spSelected.equals("Words")) {
                int wordCount = TextCounter.getWordCount(inputText);
                this.tvResult.setText(String.valueOf(wordCount));
            } else {
                Toast.makeText(this, "Option not selected!",Toast.LENGTH_SHORT).show();
            }
        }
    }
}