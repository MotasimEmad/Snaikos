package com.example.myapplication.fragments

import android.annotation.SuppressLint
import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.LinearLayout
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.myapplication.R
import com.example.myapplication.adapters.AllCategoryAdapter
import com.example.myapplication.adapters.CategoryAdapter
import com.example.myapplication.lists.Category_List
import com.example.myapplication.lists.Offer_List
import com.example.myapplication.lists.Product_List
import kotlinx.android.synthetic.main.category_fragment.*

class CategoryFragment: Fragment() {

    lateinit var mContext: Context

    lateinit var mArrayListCategory: ArrayList<Category_List>
    lateinit var CategoryRecyclerView: RecyclerView

    @SuppressLint("WrongConstant")
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view: View = inflater.inflate(R.layout.category_fragment, container, false)

        mContext = context!!

        mArrayListCategory = ArrayList()
        CategoryRecyclerView = view.findViewById(R.id.AllCategoryRecyclerView) as RecyclerView
        CategoryRecyclerView.layoutManager = LinearLayoutManager(mContext, LinearLayout.VERTICAL, false)

        loadCategory()
        return view
    }

    private fun loadCategory() {
        mArrayListCategory.add(Category_List("شيبس"))
        mArrayListCategory.add(Category_List("حلويات"))
        mArrayListCategory.add(Category_List("هدايا"))

        val adapter = AllCategoryAdapter(mArrayListCategory, mContext)
        CategoryRecyclerView.adapter = adapter
    }

    companion object {
        fun newIntance(): CategoryFragment {
            return CategoryFragment()
        }
    }
}