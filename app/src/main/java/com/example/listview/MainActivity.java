package com.example.listview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        ListView listView = findViewById(R.id.listView);
//        final ArrayList<String> myFamily = new ArrayList<String>();
//        myFamily.add("Rob");
//        myFamily.add("Tom");
//        myFamily.add("Stark");
//
//        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, myFamily);
//
//        listView.setAdapter(arrayAdapter);
//        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
//            @Override
//            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
//                Log.i("Person Tapped", myFamily.get(position));
//            }
//        });

        ListView listView = findViewById(R.id.listView);
        final ArrayList<String> myFamily = new ArrayList<String>();
        myFamily.add("Apple");
        myFamily.add("Microsoft");
        myFamily.add("Sumsung");

        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String >(this, android.R.layout.simple_list_item_1, myFamily);
        listView.setAdapter(arrayAdapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Log.i("Person Tapped", myFamily.get(position));
                Toast.makeText(MainActivity.this, "Hello " + myFamily.get(position) + '!', Toast.LENGTH_SHORT).show();
            }
        });
    }
}
