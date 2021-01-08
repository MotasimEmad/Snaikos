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
import com.example.myapplication.lists.Category_List
import com.example.myapplication.lists.Order_List

class OrderAdapter(var OrderList: ArrayList<Order_List>, var context: Context) :RecyclerView.Adapter<OrderAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
       val view = LayoutInflater.from(parent.context).inflate(R.layout.order_custom, parent, false)
        return ViewHolder(view)
    }

    override fun getItemCount(): Int {
        return OrderList.size
    }

    @SuppressLint("ResourceAsColor")
    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        var OrderInfo = OrderList[position]

        holder.Order_Name.text = OrderInfo.name
        holder.Order_Total.text = OrderInfo.total
        holder.Order_Date.text = OrderInfo.date
        holder.Order_State.text = OrderInfo.state

    }


    class ViewHolder(view: View): RecyclerView.ViewHolder(view){

        var Order_Name = itemView.findViewById(R.id.OrderProductName) as TextView
        var Order_Total = itemView.findViewById(R.id.OrderTotal) as TextView
        var Order_Date = itemView.findViewById(R.id.OrderDate) as TextView
        var Order_State = itemView.findViewById(R.id.OrderState) as TextView

    }
}