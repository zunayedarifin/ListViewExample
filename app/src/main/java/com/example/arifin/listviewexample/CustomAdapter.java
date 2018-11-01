package com.example.arifin.listviewexample;

import android.annotation.SuppressLint;
import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.provider.ContactsContract;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.TextView;

import java.util.List;

public class CustomAdapter extends ArrayAdapter<String> {

    Context context;
    List contactListName;
    List contactListNumber;

    @SuppressLint("ResourceType")

    public CustomAdapter(Context context, String[] resource) {
        super(context, R.id.custom_list_view, resource);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater layoutInflater = LayoutInflater.from(getContext());
        View customView = layoutInflater.inflate(R.layout.custom_list_view, parent, false);

        String items = getItem(position);
        TextView textView = customView.findViewById(R.id.textView2);
        ImageView imageView = customView.findViewById(R.id.imageView);

        textView.setText(items);
        imageView.setImageResource(R.drawable.ic_launcher_background);

        return customView;
    }

}