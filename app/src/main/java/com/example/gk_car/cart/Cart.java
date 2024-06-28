package com.example.gk_car.cart;

import android.os.Bundle;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.gk_car.R;
//import com.example.gk_car.adapter.CarAdapter;
//import com.example.gk_car.adapter.CartAdapter;
import com.example.gk_car.product.Car;

import java.util.ArrayList;
import java.util.List;

public class Cart extends AppCompatActivity {
//    private RecyclerView recyclerView;
//private TextView tongTxt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_cart);
//
//        recyclerView = findViewById(R.id.recyclewViewCart);
//
//        CartAdapter cartAd=new CartAdapter(CartItem.getCartItems(),this);
//        recyclerView.setAdapter(cartAd);
//        recyclerView.setLayoutManager(new GridLayoutManager(this, 1));
//
//        updateData();
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
//
//    }
//    public void updateData(){
//        int tong =0;
//        for (CartItem i : CartItem.getCartItems()) {
//            tong+=Integer.parseInt( i.getPrice())*i.getQuantity();
//        }
//        tongTxt = findViewById(R.id.tong);
//        tongTxt.setText("Tổng: " + Integer.toString(tong));

    }
}