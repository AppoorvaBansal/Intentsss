package com.example.intentsss;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
Button b1;
EditText eddata;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b1=(Button) findViewById(R.id.button);
        eddata=findViewById(R.id.edtdata);

    }
    public void abc(View v){
        Intent i= new Intent(this,Main2Activity.class);
        i.putExtra("DATA",eddata.getText().toString());
        startActivity(i);
    }
}
