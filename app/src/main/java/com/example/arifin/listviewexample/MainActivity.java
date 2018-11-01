package com.example.arifin.listviewexample;

import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.provider.ContactsContract;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ListView listView= findViewById(R.id.list_View);
        String[] demo={"one","two","three","four","five","six","seven","eight","nine","ten"};
        ListAdapter listAdapter= new CustomAdapter(this,demo);
        listView.setAdapter(listAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String temp= String.valueOf(parent.getItemAtPosition(position));
                Toast.makeText(getApplicationContext(),temp,Toast.LENGTH_SHORT).show();
            }
        });
    }
}
