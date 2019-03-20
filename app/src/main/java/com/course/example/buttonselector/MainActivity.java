package com.course.example.buttonselector;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.Toast;
import android.view.View;
import android.view.View.OnClickListener;

public class MainActivity extends AppCompatActivity {

    Button imageButton;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imageButton = (Button) findViewById(R.id.imageButtonSelector);

        imageButton.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View view) {

                Toast.makeText(MainActivity.this,
                        "Button selector is clicked!",
                        Toast.LENGTH_LONG).show();

            }

        });

    }
}