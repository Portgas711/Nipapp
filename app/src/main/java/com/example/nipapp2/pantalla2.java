package com.example.nipapp2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import android.widget.ImageButton;


public class pantalla2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pantalla2);
        configureNextButton();
        configureNextButton2();
    }
    private void configureNextButton(){

        ImageButton nextButton = (ImageButton) findViewById(R.id.next);

        nextButton.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view){
                startActivity(new Intent(pantalla2.this,curso.class));
            }

        });
    }

    private void configureNextButton2(){

        ImageButton nextButton = (ImageButton) findViewById(R.id.atras);

        nextButton.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view){
                startActivity(new Intent(pantalla2.this,MainActivity.class));
            }

        });
    }
}
