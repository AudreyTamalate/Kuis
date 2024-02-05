package com.example.duaduasi.kuis;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

public class todo extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_todo);

        Toast.makeText(todo.this, "Selamat Datang", Toast.LENGTH_SHORT).show();
    }
}