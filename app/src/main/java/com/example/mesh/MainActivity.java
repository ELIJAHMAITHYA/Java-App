package com.example.mesh;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    public TextView textView;
    public EditText fname,lname;
    public Button btn;


    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
textView = findViewById(R.id.ap);
fname = findViewById(R.id.fname);
lname = findViewById(R.id.lname);
btn = findViewById(R.id.btn);

btn.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {

        Toast.makeText(MainActivity.this, "My name is:  "+ fname.getText().toString() + " "+ lname.getText().toString(), Toast.LENGTH_SHORT).show();
Intent intent = new Intent(getApplicationContext(), MainActivity2.class);
startActivity(intent);
    }
});


    }
}