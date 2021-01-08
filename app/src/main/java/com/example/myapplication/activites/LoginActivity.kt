package com.example.myapplication.activites

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.app.ActionBar
import com.example.myapplication.R
import kotlinx.android.synthetic.main.activity_login.*

class LoginActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        val mActionBar: ActionBar = supportActionBar!!
        mActionBar.hide()

        btnLogin.setOnClickListener {
            startActivity(Intent(this, MainActivity::class.java))
        }

        CreateAccountText.setOnClickListener {
            startActivity(Intent(this, RegestrationActivity::class.java))
        }
    }
}
