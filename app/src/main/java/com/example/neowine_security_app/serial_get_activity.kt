package com.example.neowine_security_app

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_serial_get.*

class serial_get_activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_serial_get)

        btnBack.setOnClickListener {
            this.finish()
        }
    }
}
