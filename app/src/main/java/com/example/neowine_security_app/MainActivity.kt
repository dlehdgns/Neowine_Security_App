package com.example.neowine_security_app

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btnSha.setOnClickListener { listViewIntent(1) }
        btnAes.setOnClickListener { listViewIntent(2) }
        btnEcdh.setOnClickListener { listViewIntent(3) }
        btnEcdsa.setOnClickListener { listViewIntent(4) }
        btnElgamal.setOnClickListener { listViewIntent(5) }
        btnTrng.setOnClickListener { listViewIntent(6) }
        btnPrivateKeyGen.setOnClickListener { listViewIntent(7) }
        btnSerialGet.setOnClickListener { listViewIntent(8) }
        btnGroupId.setOnClickListener { listViewIntent(9) }
        btnSelfDemo.setOnClickListener { selfDemo() }
    }

    fun selfDemo(){
        val shaIntent = Intent(this, ShaActivity::class.java)
        startActivity(shaIntent)
        finish()
    }

    fun listViewIntent(num: Int) : Boolean {
        val shaIntent = Intent(this, ShaActivity::class.java)
        val aesIntent = Intent(this, AesActivity::class.java)
        val eccIntent = Intent(this, EccActivity::class.java)
        val echIntent = Intent(this, EcdhActivity::class.java)
        val elgIntent = Intent(this, ElgamalActivity::class.java)
        val trngIntent = Intent(this, TRNG_Activity::class.java)
        val prvIntent = Intent(this, Private_key_activity::class.java)
        val serialIntent = Intent(this, serial_get_activity::class.java)
        val gidIntent = Intent(this, GidActivity::class.java)

        when(num){
            1 -> {
                startActivity(shaIntent)
                return true
            }
            2 -> {
                startActivity(aesIntent)
                return true
            }
            3 -> {
                startActivity(echIntent)
                return true
            }
            4 -> {
                startActivity(eccIntent)
                return true
            }
            5 -> {
                startActivity(elgIntent)
                return true
            }
            6 -> {
                startActivity(trngIntent)
                return true
            }
            7 -> {
                startActivity(prvIntent)
                return true
            }
            8 -> {
                startActivity(serialIntent)
                return true
            }
            9 -> {
                startActivity(gidIntent)
                return true
            }
        }
        return false
    }
}
