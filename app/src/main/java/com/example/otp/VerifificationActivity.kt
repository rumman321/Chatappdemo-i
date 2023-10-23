package com.example.otp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.otp.databinding.ActivityVerifificationBinding

class VerifificationActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_verifification)

       // startActivity(Intent(this,MainActivity::class.java))
    }



}