package com.example.listarray;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class Products extends AppCompatActivity {
    private TextView item1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_products);
        item1 = findViewById(R.id.item1);

        Intent mydata = getIntent();


        String data = mydata.getStringExtra("data");

        item1.setText(data);
    }
}