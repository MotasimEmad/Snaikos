package com.example.myapplication.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.recyclerview.widget.RecyclerView
import com.example.myapplication.R
import com.example.myapplication.lists.Category_List
import com.example.myapplication.lists.Product_List
import com.google.android.material.snackbar.Snackbar

class ProductAdapter(var ProductList: ArrayList<Product_List>, var context: Context) :RecyclerView.Adapter<ProductAdapter.ViewHolder>() {

    var counter = 0

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
       val view = LayoutInflater.from(parent.context).inflate(R.layout.product_custom, parent, false)
        return ViewHolder(view)
    }

    override fun getItemCount(): Int {
        return ProductList.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        var ProductInfo = ProductList[position]

        holder.Product_Name.text = ProductInfo.product_name
        holder.Product_Category.text = ProductInfo.product_category
        holder.Product_Price.text = ProductInfo.product_price

        holder.AddToCart.setOnClickListener {
            val snakBar: Snackbar = Snackbar.make(holder.ProductConstraintLayout , R.string.Added_to_cart, Snackbar.LENGTH_LONG)
            snakBar.show()
        }

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

        holder.IncrementPackage.setOnClickListener {
            counter++
            holder.PackageNum.text = "" + counter
        }

        holder.DecrementPackage.setOnClickListener {
            if (counter <= 0)
                counter = 0
            else
                counter--
            holder.PackageNum.text = "" + counter
        }

    }


    class ViewHolder(view: View): RecyclerView.ViewHolder(view){

        var Product_Name = itemView.findViewById(R.id.ProductName) as TextView
        var Product_Category = itemView.findViewById(R.id.ProductCategory) as TextView
        var Product_Price = itemView.findViewById(R.id.ProductPrice) as TextView

        var Increment = itemView.findViewById(R.id.btnMax) as Button
        var Decrement = itemView.findViewById(R.id.btnMin) as Button
        var ItemsNum = itemView.findViewById(R.id.TextProductNum) as TextView

        var IncrementPackage = itemView.findViewById(R.id.btnMaxPackage) as Button
        var DecrementPackage = itemView.findViewById(R.id.btnMinPackage) as Button
        var PackageNum = itemView.findViewById(R.id.TextPackageNum) as TextView

        var AddToCart = itemView.findViewById(R.id.btnAddToCart) as Button

        var ProductConstraintLayout = itemView.findViewById(R.id.ProductConstraintLayout) as ConstraintLayout
    }

}