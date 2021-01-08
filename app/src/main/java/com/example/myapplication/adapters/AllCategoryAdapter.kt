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

class AllCategoryAdapter(var CategoryList: ArrayList<Category_List>, var context: Context) :RecyclerView.Adapter<AllCategoryAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
       val view = LayoutInflater.from(parent.context).inflate(R.layout.all_category_custom, parent, false)
        return ViewHolder(view)
    }

    override fun getItemCount(): Int {
        return CategoryList.size
    }

    @SuppressLint("ResourceAsColor")
    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        var CategoryInfo = CategoryList[position]

        holder.Category_Name.text = CategoryInfo.name

    }


    class ViewHolder(view: View): RecyclerView.ViewHolder(view){

        var Category_Name = itemView.findViewById(R.id.CategoryName) as TextView

    }
}