package com.example.gk_car.product;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageButton;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.gk_car.R;
//import com.example.gk_car.adapter.CarAdapter;
import com.example.gk_car.cart.Cart;

import java.util.ArrayList;
import java.util.List;

public class Product extends AppCompatActivity {
//    private RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_product);
//        List<Car> carList = new ArrayList<Car>();
//        carList.add(new Car("VF3", R.drawable.vf3, "235", "VF 3 là dòng xe nhỏ nhất của VinFast, mang phong cách khối hộp, nam tính SUV. Xe có tầm hoạt động 210 km"));
//        carList.add(new Car("VF5", R.drawable.vf5, "479", "VF 5 là mẫu xe điện nhỏ nhất của VinFast, nằm ở phân khúc A+, nơi có những Kia Sonet, Toyota Raize"));
//        carList.add(new Car("VF6", R.drawable.vf6, "686", "VinFast giới thiệu mẫu ôtô điện thứ 5 của hãng, tham gia vào phân khúc xe gầm cao cỡ B sôi động bậc nhất thị trường"));
//        carList.add(new Car("Vf7", R.drawable.vf7, "721", "Mẫu crossover cỡ C của VinFast bán ra hai phiên bản, giá lần lượt 850 triệu và 999 triệu đồng"));
//        carList.add(new Car("Vf8", R.drawable.vf8, "861", "VF 8 là dòng ôtô điện thứ hai mà VinFast bán ở thị trường Việt Nam, đồng thời là ô tô điện toàn cầu đầu tiên của hãng"));
//        carList.add(new Car("VF9", R.drawable.vf9, "157", "VF 9 là dòng ôtô điện thứ ba mà VinFast bán ở thị trường Việt Nam, đồng thời là ôtô điện toàn cầu thứ hai của hãng"));
//        carList.add(new Car("VFE34", R.drawable.vfe34, "1566", "VF e34 là mẫu xe điện đầu tiên của VinFast mở bán tại thị trường Việt Nam"));
//        carList.add(new Car("LUXA", R.drawable.luxa, "115", "Xe sử dụng những công nghệ cũ của hãng xe BMW, là mẫu xe thuộc phân khúc sedan cỡ E nhưng giá bán tầm trung"));
//    ImageButton btnCart= findViewById(R.id.imgbtn_cart);
//btnCart.setOnClickListener(v -> {
//
//
//    Intent myIntent = new Intent(this, Cart.class);
//
//    startActivity(myIntent);
//
//});
//
//        recyclerView = findViewById(R.id.recyclewView);
//
//        CarAdapter carAdapter = new CarAdapter(carList);
//        recyclerView.setAdapter(carAdapter);
//        recyclerView.setLayoutManager(new GridLayoutManager(this, 1));

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }
}