package com.example.notes;

import android.content.Context;
import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AlertDialog.Builder builder =new AlertDialog.Builder(MainActivity.this);
                LayoutInflater inflater = LayoutInflater.from(MainActivity.this);
                View view1=inflater.inflate(R.layout.activity_main,null);
                builder.setView(view1);
                final EditText heading=view1.findViewById(R.id.heading);
                final EditText description=view1.findViewById(R.id.desc);
                Button save = view1.findViewById(R.id.save);
                save.setOnClickListener(new View.OnClickListener() {
                @Override
    public void onClick(View view) {
        String title=heading.getText().toString();
        String descp=description.getText().toString();

    }
});
              builder.create();
              builder.show();

            }

        });
    }

}
