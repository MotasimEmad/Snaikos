package com.example.myapplication.activites

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.LinearLayout
import androidx.appcompat.app.ActionBar
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.myapplication.R
import com.example.myapplication.adapters.OrderAdapter
import com.example.myapplication.lists.Order_List

class OrderActivity : AppCompatActivity() {

    lateinit var mArrayListOrder: ArrayList<Order_List>
    lateinit var OrderRecyclerView: RecyclerView

    @SuppressLint("WrongConstant")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_order)

        val mActionBar: ActionBar = supportActionBar!!
        mActionBar.hide()

        mArrayListOrder = ArrayList()
        OrderRecyclerView = findViewById(R.id.OrderRecyclerView)
        OrderRecyclerView.layoutManager = LinearLayoutManager(this, LinearLayout.VERTICAL, false)

        loadOrder()
    }

    private fun loadOrder() {
        mArrayListOrder.add(Order_List("شيبس","2","10,Feb","تم الاستلام"))
        mArrayListOrder.add(Order_List("Lays Classic","4","12,Feb","تم الاستلام"))
        mArrayListOrder.add(Order_List("Twix","5","22,Dec","في الطريق اليك"))
        mArrayListOrder.add(Order_List("ورد","1","1,Feb","لم يتم التحرك"))
        mArrayListOrder.add(Order_List("Galaxy","30","2,Feb","تم الاستلام"))

        val adapter = OrderAdapter(mArrayListOrder, this)
        OrderRecyclerView.adapter = adapter
    }
}
