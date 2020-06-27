package com.example.cw5;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Button p = findViewById(R.id.nnn);
        p.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity2.this,MainActivity3.class);
                startActivity(i);

            }
        });

    }

    public void Press(View view) {
        EditText t4=(EditText) findViewById(R.id.t4);
        if (t4.getText().toString().equals("")){
            Toast.makeText(this,"you did not enter your age",Toast.LENGTH_LONG).show();
        }else {
            int age = Integer.parseInt( t4.getText().toString());
            int birthday = 2020 - age;
            Toast.makeText(this,"birthday is :" + String.valueOf(birthday),Toast.LENGTH_LONG).show();
        }

    }
}


