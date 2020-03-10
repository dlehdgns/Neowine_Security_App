package com.example.neowine_security_app

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_elgamal.*

class ElgamalActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_elgamal)

        btnBack.setOnClickListener {
            this.finish()
        }
    }
}
