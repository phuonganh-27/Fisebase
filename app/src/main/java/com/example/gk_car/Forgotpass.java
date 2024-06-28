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

import com.example.gk_car.Database.DBHelper;
import com.google.firebase.Firebase;
import com.google.firebase.auth.FirebaseAuth;

public class Forgotpass extends AppCompatActivity {
    public final static String EXTRA_MESSAGE = "MESSAGE";
    ImageButton btn_quaylai;
    Button btn_forgotpass;
    DBHelper mydb;
    EditText email;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_forgotpass);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        mydb = new DBHelper(this);

        email = findViewById(R.id.email);
        btn_quaylai = findViewById(R.id.btn_quaylai);

        btn_quaylai.setOnClickListener(v -> {
            Intent myIntent = new Intent(Forgotpass.this, MainActivity.class);
            startActivity(myIntent);
        });

        btn_forgotpass = findViewById(R.id.btn_Forgotpass);

        btn_forgotpass.setOnClickListener(v -> {
            String emailStr = email.getText().toString();
            if (emailStr.isEmpty()) {
                Toast.makeText(Forgotpass.this, "Vui lòng nhập email", Toast.LENGTH_SHORT).show();
                return;
            }
            FirebaseAuth firebaseAuth = FirebaseAuth.getInstance();
            firebaseAuth.sendPasswordResetEmail(emailStr);
        });
    }
}
