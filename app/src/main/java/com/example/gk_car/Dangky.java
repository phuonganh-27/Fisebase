package com.example.gk_car;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class Dangky extends AppCompatActivity {
    private DBHelper mydb;

    EditText email;
    EditText password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        ImageButton imgbtn_quaylai;
        Button btn_dangky1;
        super.onCreate(savedInstanceState);

        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_dangky);
        email =(EditText) findViewById(R.id.email);
        password =(EditText)  findViewById(R.id.password);

//        String createdAt = new SimpleDateFormat("yyyy-MM-dd", Locale.getDefault()).format(new Date());
        mydb = new DBHelper(this);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        imgbtn_quaylai = findViewById(R.id.imgbtn_quaylai);
        imgbtn_quaylai.setOnClickListener(v -> {
            Intent myIntent = new Intent(Dangky.this, MainActivity.class);
            startActivity(myIntent);
        });

        btn_dangky1 = findViewById(R.id.btn_dangky1);
        btn_dangky1.setOnClickListener(v -> {
            boolean dangky= mydb.insertAccounts(email.getText().toString(),password.getText().toString());
            if(dangky){
                Toast.makeText(getApplicationContext(), "Đăng ký thành công", Toast.LENGTH_SHORT).show();
                Intent myIntent = new Intent(Dangky.this, MainActivity.class);
                startActivity(myIntent);
            }
        });
    }
}