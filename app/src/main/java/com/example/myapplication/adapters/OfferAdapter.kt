package com.example.myapplication.adapters

import android.annotation.SuppressLint
import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.recyclerview.widget.RecyclerView
import com.example.myapplication.R
import com.example.myapplication.lists.Offer_List
import com.google.android.material.snackbar.Snackbar

class OfferAdapter(var OfferList: ArrayList<Offer_List>, var context: Context) :RecyclerView.Adapter<OfferAdapter.ViewHolder>() {

    var counter = 0

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
       val view = LayoutInflater.from(parent.context).inflate(R.layout.offer_custom, parent, false)
        return ViewHolder(view)
    }

    override fun getItemCount(): Int {
        return OfferList.size
    }

    @SuppressLint("SetTextI18n")
    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val OfferInfo = OfferList[position]



        holder.Product_Name.text = OfferInfo.product_name
        holder.Product_Category.text = OfferInfo.product_category
        holder.Product_NewPrice.text = OfferInfo.product_new_price
        holder.Product_OldPrice.text = OfferInfo.product_old_price


        holder.Increment.setOnClickListener {
            counter++
            holder.ItemsNum.text = "" + counter
        }

        holder.Decrement.setOnClickListener {
            if (counter <= 0)
                counter = 0
            else
            counter--
            holder.ItemsNum.text = "" + counter
        }
    }


    class ViewHolder(view: View): RecyclerView.ViewHolder(view){

        var Product_Name = itemView.findViewById(R.id.ProductName) as TextView
        var Product_Category = itemView.findViewById(R.id.ProductCategory) as TextView
        var Product_OldPrice = itemView.findViewById(R.id.ProductOldPrice) as TextView
        var Product_NewPrice = itemView.findViewById(R.id.ProductNewPrice) as TextView
        var Increment = itemView.findViewById(R.id.btnMax) as Button
        var Decrement = itemView.findViewById(R.id.btnMin) as Button
        var ItemsNum = itemView.findViewById(R.id.TextProductNum) as TextView

        var AddToCart = itemView.findViewById(R.id.btnAddToCart) as Button


    }
}