package com.example.gk_car;

import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageButton;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.example.gk_car.Database.DBHelper;

public class Send extends AppCompatActivity {
    private DBHelper dbHelper;
    private SQLiteDatabase db;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Button btn_xacnhan;
        ImageButton btn_quaylai;
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_send);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        dbHelper = new DBHelper(this);

        btn_xacnhan = findViewById(R.id.btn_xacnhan);

        btn_xacnhan.setOnClickListener(v -> {
            Intent myIntent = new Intent(Send.this, Newpass.class);
            startActivity(myIntent);
        });

        btn_quaylai = findViewById(R.id.btn_quaylai);
        btn_quaylai.setOnClickListener(v -> {
            Intent myIntent = new Intent(Send.this, Forgotpass.class);
            startActivity(myIntent);
        });
    }
}