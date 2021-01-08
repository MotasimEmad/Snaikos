package com.example.myapplication.fragments

import android.annotation.SuppressLint
import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.LinearLayout
import androidx.cardview.widget.CardView
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.myapplication.R
import com.example.myapplication.adapters.CategoryAdapter
import com.example.myapplication.adapters.OfferAdapter
import com.example.myapplication.adapters.ProductAdapter
import com.example.myapplication.lists.Category_List
import com.example.myapplication.lists.Offer_List
import com.example.myapplication.lists.Product_List
import com.google.android.material.snackbar.Snackbar

@Suppress("UNREACHABLE_CODE")
class HomeFragment: Fragment() {


    lateinit var mContext: Context

    lateinit var mArrayListOffer: ArrayList<Offer_List>
    lateinit var mArrayListProduct: ArrayList<Product_List>

    lateinit var OfferRecyclerView: RecyclerView
    lateinit var ProductRecyclerView: RecyclerView

    @SuppressLint("WrongConstant")
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view: View = inflater.inflate(R.layout.home_fragment, container, false)

        mContext = context!!

        mArrayListOffer = ArrayList()
        mArrayListProduct = ArrayList()

        OfferRecyclerView = view.findViewById(R.id.OfferRecyclerView) as RecyclerView
        ProductRecyclerView = view.findViewById(R.id.ProductRecyclerView) as RecyclerView

        OfferRecyclerView.layoutManager = LinearLayoutManager(mContext, LinearLayout.HORIZONTAL, false)
        ProductRecyclerView.layoutManager = GridLayoutManager(mContext, 2)

        loadOffer()
        loadProduct()

        return view
    }


    private fun loadOffer() {
        mArrayListOffer.add(Offer_List("شيبس 1","شيبس","$200","$150"))
        mArrayListOffer.add(Offer_List("حلويات 1","حلويات","$200","$150"))
        mArrayListOffer.add(Offer_List("هدية 1","هدايا","$200","$150"))
        mArrayListOffer.add(Offer_List("شيبس 2","شيبس","$200","$150"))
        val adapter = OfferAdapter(mArrayListOffer, mContext)
        OfferRecyclerView.adapter = adapter
    }

    private fun loadProduct() {
        mArrayListProduct.add(Product_List("شيبس 1","شيبس","$200"))
        mArrayListProduct.add(Product_List("حلويات 1","حلويات","$200"))
        mArrayListProduct.add(Product_List("هدية 1","هدايا","$200"))
        mArrayListProduct.add(Product_List("شيبس 2","شيبس","$200"))
        mArrayListProduct.add(Product_List("حلويات 2","حلويات","$200"))
        mArrayListProduct.add(Product_List("هدية 2","هدايا","$200"))

        val adapter = ProductAdapter(mArrayListProduct, mContext)
        ProductRecyclerView.adapter = adapter
    }

    companion object {
        fun newIntance(): HomeFragment {
            return HomeFragment()
        }
    }
}