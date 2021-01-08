package com.example.myapplication.activites

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.LinearLayout
import androidx.appcompat.app.ActionBar
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.etebarian.meowbottomnavigation.MeowBottomNavigation
import com.example.myapplication.R
import com.example.myapplication.adapters.CartAdapter
import com.example.myapplication.fragments.*
import com.example.myapplication.lists.Cart_List
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    @SuppressLint("WrongConstant")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val mActionBar: ActionBar = supportActionBar!!
        mActionBar.hide()

        MoewMenu()
    }

    private fun MoewMenu() {
        setFragment(HomeFragment.newIntance())
        BottomNavigation.add(MeowBottomNavigation.Model(1,R.drawable.ic_profile))
        BottomNavigation.add(MeowBottomNavigation.Model(2,R.drawable.ic_category))
        BottomNavigation.add(MeowBottomNavigation.Model(3,R.drawable.ic_home))
        BottomNavigation.add(MeowBottomNavigation.Model(4,R.drawable.ic_favorite))
        BottomNavigation.add(MeowBottomNavigation.Model(5,R.drawable.ic_shopping))

        BottomNavigation.setOnClickMenuListener {
            when(it.id) {
                1 -> setFragment(ProfileFragment.newIntance())
                2 -> setFragment(CategoryFragment.newIntance())
                3 -> setFragment(HomeFragment.newIntance())
                4 -> setFragment(FavouriteFragment.newIntance())
                5 -> setFragment(CartFragment.newIntance())

                else -> " "
            }
        }

        BottomNavigation.show(3)
    }

    private fun setFragment(fragment: Fragment) {
        supportFragmentManager
            .beginTransaction()
            .replace(R.id.FrameLayout, fragment, "main")
            .commit()
    }
}
