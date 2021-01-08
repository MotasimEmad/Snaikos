package com.example.myapplication.adapters

import android.annotation.SuppressLint
import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.myapplication.R
import com.example.myapplication.lists.Cart_List
import com.example.myapplication.lists.Category_List

class CartAdapter(var CartList: ArrayList<Cart_List>, var context: Context) :RecyclerView.Adapter<CartAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
       val view = LayoutInflater.from(parent.context).inflate(R.layout.cart_custom, parent, false)
        return ViewHolder(view)
    }

    override fun getItemCount(): Int {
        return CartList.size
    }

    @SuppressLint("ResourceAsColor")
    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        var CartInfo = CartList[position]

        holder.Product_Name.text = CartInfo.product_name
        holder.Product_Amount.text = CartInfo.product_amount
        holder.Product_Price.text = CartInfo.product_price

    }


    class ViewHolder(view: View): RecyclerView.ViewHolder(view){

        var Product_Name = itemView.findViewById(R.id.CartProductName) as TextView
        var Product_Amount = itemView.findViewById(R.id.CartAmount) as TextView
        var Product_Price = itemView.findViewById(R.id.CartProductPrice) as TextView

    }
}