package com.example.gk_car.adapter;

import android.content.Context;
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

import java.util.ArrayList;
import java.util.List;

//public class CartAdapter extends RecyclerView.Adapter<CartAdapter.MyViewHolder>{
//    private List<CartItem> listCart;
//    private Context mContext;
//    public CartAdapter (List<CartItem> listCart, Context Context){
//        this.listCart = listCart;
//        this.mContext= Context;
//    }
//    @NonNull
//    @Override
//    public CartAdapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType){
//        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_cart, parent, false);
//        return new CartAdapter.MyViewHolder(view);
//    }
//
//    @Override
//    public int getItemCount(){
//        return listCart.size();
//    }
//
//    @Override
//    public void onBindViewHolder(@NonNull CartAdapter.MyViewHolder holder, int position){
//        CartItem cartItem = listCart.get(position);
//        holder.img.setImageResource(cartItem.getImage());
//        holder.name.setText(cartItem.getName().toString());
//        holder.price.setText(cartItem.getPrice().toString());
//        holder.quantity.setText(Integer.toString(cartItem.getQuantity()));
//        holder.minus.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                int quantity =cartItem.getQuantity();
//                if(quantity>0){
//                    quantity-=1;
//                }
//                else {
//                    quantity = 0;
//                }
//                cartItem.setQuantity(quantity);
//                holder.quantity.setText(Integer.toString(cartItem.getQuantity()));
//                if(quantity==0){
//                    CartItem.removeFromCart(cartItem);
//
//                }
//                ((Cart)mContext).updateData();
//            }
//        });
//        holder.plus.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                int quantity =cartItem.getQuantity();
//                if(quantity<10){
//                    quantity+=1;
//                }
//                else {
//                    quantity = 10;
//                }
//                cartItem.setQuantity(quantity);
//                holder.quantity.setText(Integer.toString(cartItem.getQuantity()));
//                ((Cart)mContext).updateData();
//            }
//        });
//    }
//    class MyViewHolder extends RecyclerView.ViewHolder{
//        private CardView cardView;
//        private ImageView img;
//        private TextView name;
//        private TextView price;
//        private TextView quantity;
//        private ImageButton minus,plus;
//
//        public MyViewHolder(@NonNull View itemView){
//            super(itemView);
//            cardView = itemView.findViewById(R.id.cardview);
//            img= itemView.findViewById(R.id.img);
//            name = itemView.findViewById(R.id.name);
//            price= itemView.findViewById(R.id.price);
//            quantity = itemView.findViewById(R.id.quantity);
//        minus=itemView.findViewById(R.id.minus);
//        plus   = itemView.findViewById(R.id.plus);
//
//        }
//    }
//}
