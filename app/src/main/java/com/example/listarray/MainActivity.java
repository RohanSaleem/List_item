package com.example.listarray;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private ListView listviewID;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listviewID = findViewById(R.id.ListviewID);



        List lst = new ArrayList();
        lst.add("Facebook");
        lst.add("WhatsApp");
        lst.add("Snapchat");
        lst.add("Instagram");
        lst.add("Gmail");
        lst.add("Messenger");
        lst.add("Google Chrome");
        lst.add("Youtube");
        lst.add("Vedio Player");
        lst.add("Imo");



        ArrayAdapter adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1,lst);

        listviewID.setAdapter(adapter);

        listviewID.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {


                Intent myIntent = new Intent(MainActivity.this,Products.class);
                myIntent.putExtra("data", String.valueOf(lst.get(position)));
                startActivity(myIntent);

            }
        });





    }
}