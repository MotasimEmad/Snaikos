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
import com.example.myapplication.adapters.CartAdapter
import com.example.myapplication.lists.*

class CartFragment: Fragment() {

    lateinit var mContext: Context

    lateinit var mArrayListCart: ArrayList<Cart_List>
    lateinit var CartRecyclerView: RecyclerView

    @SuppressLint("WrongConstant")
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view: View = inflater.inflate(R.layout.cart_fragment, container, false)

        mContext = context!!
        mArrayListCart = ArrayList()

        CartRecyclerView = view.findViewById(R.id.CartRecyclerView) as RecyclerView
        CartRecyclerView.layoutManager = LinearLayoutManager(mContext, LinearLayout.VERTICAL, false)

        loadCart()
        return view
    }


    private fun loadCart() {
        mArrayListCart.add(Cart_List("شيبس 1","2","$200"))
        mArrayListCart.add(Cart_List("حلويات 1","2","$200"))
        mArrayListCart.add(Cart_List("هدية 1","1","$150"))
        mArrayListCart.add(Cart_List("شيبس 2","5","$1000"))

        val adapter = CartAdapter(mArrayListCart, mContext)
        CartRecyclerView.adapter = adapter
    }

    companion object {
        fun newIntance(): CartFragment {
            return CartFragment()
        }
    }
}