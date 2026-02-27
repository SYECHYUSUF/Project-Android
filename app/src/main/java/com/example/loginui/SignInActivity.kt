package com.example.loginui

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.google.android.material.button.MaterialButton

class SignInActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_sign_in)
        
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        findViewById<ImageView>(R.id.iv_back).setOnClickListener {
            onBackPressedDispatcher.onBackPressed()
            overridePendingTransition(R.anim.fade_in, R.anim.fade_out)
        }

        findViewById<TextView>(R.id.tv_register).setOnClickListener {
            val intent = Intent(this, RegisterActivity::class.java)
            startActivity(intent)
            overridePendingTransition(R.anim.fade_in, R.anim.fade_out)
        }

        findViewById<MaterialButton>(R.id.btn_login).setOnClickListener {
            // Mock login action
            finish()
            overridePendingTransition(R.anim.fade_in, R.anim.fade_out)
        }
    }
}
