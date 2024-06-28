package com.example.gk_car;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.example.gk_car.cart.Cart;
import com.example.gk_car.product.Product;

public class MainActivity extends AppCompatActivity {
    public final static String EXTRA_MESSAGE = "MESSAGE";
    DBHelper mydb;
    EditText email;
    EditText password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Button btn_dangky;
        Button btn_dangnhap;
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        email=findViewById(R.id.email);
        password=findViewById(R.id.password);

        mydb = new DBHelper(this);

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        btn_dangky = findViewById(R.id.btn_dangky);
        btn_dangky.setOnClickListener(v -> {
            Intent myIntent = new Intent(MainActivity.this, Forgotpass.class);
            startActivity(myIntent);
        });

        btn_dangnhap = findViewById(R.id.btn_dangnhap);
        btn_dangnhap.setOnClickListener(v -> {
            if(mydb.checkUser(email.getText().toString(),password.getText().toString())){
                Toast.makeText(getApplicationContext(), "Đăng nhập thành công", Toast.LENGTH_SHORT).show();
                Intent myIntent = new Intent(MainActivity.this, Forgotpass.class);
                startActivity(myIntent);
            }
            else {
                Toast.makeText(getApplicationContext(), "Đăng nhập thất bại", Toast.LENGTH_SHORT).show();
            }
        });
    }
}