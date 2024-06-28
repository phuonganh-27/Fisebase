package com.example.gk_car.adapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.example.gk_car.R;
import com.example.gk_car.cart.Cart;
import com.example.gk_car.cart.CartItem;
import com.example.gk_car.product.Car;

import java.util.List;

//public class CarAdapter extends RecyclerView.Adapter<CarAdapter.MyViewHolder>{
//    private List<Car> listCar;
//    public CarAdapter (List<Car> listCar){
//        this.listCar = listCar;
//    }
//    @NonNull
//    @Override
//    public  MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType){
//        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.my_itempro, parent, false);
//        return new MyViewHolder(view);
//    }
//
//    @Override
//    public int getItemCount(){
//        return listCar.size();
//    }
//
////    for(int positon=0; position<listCar.size();position++)
//
//    @Override
//    public void onBindViewHolder(@NonNull MyViewHolder holder, int position){
//        Car car = listCar.get(position);
//        holder.img_luxa.setImageResource(car.getImg());
//        holder.name_luxa.setText(car.getNamecar());
//        holder.price_luxa.setText(car.getPricecar());
//        holder.des_luxa.setText(car.getDescar());
//        holder.btnAdd.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Toast.makeText(view.getContext(), "Thêm vào giỏ hàng thành công", Toast.LENGTH_SHORT).show();
//                String name = car.getNamecar();
//                String price =car.getPricecar();
//                int img = car.getImg();
//                CartItem cart = new CartItem(img,name,price,1);
//               CartItem.addToCart(cart);
//            }
//        });
//    }
//    class MyViewHolder extends RecyclerView.ViewHolder{
//        private CardView cardView;
//        private ImageView img_luxa;
//        private TextView name_luxa;
//        private TextView price_luxa;
//        private TextView des_luxa;
//    private  ImageButton btnAdd;
//        public MyViewHolder(@NonNull View itemView){
//            super(itemView);
//            cardView = itemView.findViewById(R.id.cardview);
//            img_luxa = itemView.findViewById(R.id.img_luxa);
//            name_luxa = itemView.findViewById(R.id.name_luxa);
//            price_luxa = itemView.findViewById(R.id.price_luxa);
//            des_luxa = itemView.findViewById(R.id.des_luxa);
//           btnAdd = itemView.findViewById(R.id.btnadd);
//
//        }
//    }
//}
