package com.example.toastprofile;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Find the TextView and Button by their IDs
        TextView textView = findViewById(R.id.textView2);
        Button button = findViewById(R.id.button);

        // Set an OnClickListener for the button
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Update the text of the TextView when the button is clicked
                textView.setText("Helo, Cella \n kamu berhasil membuat tugas ini");
            }
        });
    }
}