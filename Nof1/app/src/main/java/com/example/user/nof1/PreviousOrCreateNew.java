package com.example.user.nof1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class PreviousOrCreateNew extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_previous_or_create_new);

        // Get the Intent that started this activity and extract the string
        /*
        Intent intent = getIntent();
        String message = intent.getStringExtra(MainActivity.EXTRA_MESSAGE);*/

        // Capture the layout's TextView and set the string as its text
        /*
        TextView textView = findViewById(R.id.textView);
        textView.setText(message);*/
    }
    public void inputTrialInformation(View view) {
        Intent intent = new Intent(this, InputTrialInformation.class);
        /*
        EditText editText = (EditText) findViewById(R.id.editText);
        String message = editText.getText().toString();
        intent.putExtra(EXTRA_MESSAGE, message);*/
        startActivity(intent);
    }
}

