package com.example.myapplication.fragments

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.Toast
import androidx.fragment.app.Fragment

import com.example.myapplication.R
import com.example.myapplication.activites.AboutAppActivity
import com.example.myapplication.activites.OrderActivity

class ProfileFragment : Fragment() {

    lateinit var mContext: Context

    lateinit var List_More: ListView
    var items = arrayOf(
        R.string.Order_list.toString(),
        R.string.Edit_profile.toString(),
        R.string.About_app.toString(),
        R.string.About_dev.toString(),
        R.string.Share_app.toString(),
        R.string.Add_sugg.toString()
    )

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.profile_fragment, container, false)

        mContext = context!!

        List_More = view.findViewById(R.id.ListMore)
        val Adapter = ArrayAdapter(mContext, android.R.layout.simple_list_item_1, items)
        List_More.adapter = Adapter

        List_More.onItemClickListener =
            AdapterView.OnItemClickListener { _, view, position, _ ->
                if (position == 0) {
                    startActivity(Intent(mContext, OrderActivity::class.java))
                }

                if (position == 1) {
                    Toast.makeText(view.context, "تقديم اقتراح", Toast.LENGTH_LONG).show()
                }

                if (position == 2) {
                    Toast.makeText(view.context, "تعديل البيانات", Toast.LENGTH_LONG).show()
                }

                if (position == 3) {
                    startActivity(Intent(mContext, AboutAppActivity::class.java))
                }

                if (position == 4) {
                    Toast.makeText(view.context, "عن المطور", Toast.LENGTH_LONG).show()
                }

                if (position == 5) {
                    Toast.makeText(view.context, "مشاركة التطبيق", Toast.LENGTH_LONG).show()
                }
            }

        return view
    }

    companion object {
        fun newIntance(): ProfileFragment {
            return ProfileFragment()
        }
    }

}
