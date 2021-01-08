package com.example.myapplication.activites

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.app.ActionBar
import com.example.myapplication.R
import kotlinx.android.synthetic.main.activity_reqestration.*

class RegestrationActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_reqestration)

        val mActionBar: ActionBar = supportActionBar!!
        mActionBar.hide()

        btnReg.setOnClickListener {
            startActivity(Intent(this, MainActivity::class.java))
        }

        AlreadyText.setOnClickListener {
            startActivity(Intent(this, LoginActivity::class.java))
        }
    }
}
