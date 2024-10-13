package com.example.td1ex4;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private EditText editText1;
    private EditText editText2;
    private Button concatenationButton;
    private CheckBox addSpaceCheckBox;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.concatenation);

        editText1 = findViewById(R.id.editTextText1);
        editText2 = findViewById(R.id.editTextText2);
        concatenationButton = findViewById(R.id.button);
        addSpaceCheckBox = findViewById(R.id.checkBox);

        concatenationButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                concat();
            }
        });
    }
    private void concat() {
        String text1 = editText1.getText().toString().trim();
        String text2 = editText2.getText().toString().trim();

        if (TextUtils.isEmpty(text1) || TextUtils.isEmpty(text2)) {
            Toast.makeText(this, "Champs vide", Toast.LENGTH_SHORT).show();
        } else {
            String result = addSpaceCheckBox.isChecked() ? text1 + " " + text2 : text1 + text2;

            Toast.makeText(this, result, Toast.LENGTH_SHORT).show();
        }
    }
}
