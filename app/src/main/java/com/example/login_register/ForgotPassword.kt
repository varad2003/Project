package com.example.login_register

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import kotlin.random.Random

class ForgotPassword : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_forgot_password)

        val enterotp=findViewById<EditText>(R.id.etEnterOTP)
        val changepass=findViewById<Button>(R.id.btnChangePass)
        val enterotpbtn=findViewById<Button>(R.id.btnEnterOtp)
        val otp= Random.nextInt(1000,9999)+1;
        val sendotpbtn =findViewById<Button>(R.id.btnOtp)
        sendotpbtn.setOnClickListener {
            sendotpbtn.visibility=View.GONE
            Toast.makeText(this,otp.toString(),Toast.LENGTH_LONG).show()
            enterotp.visibility=View.VISIBLE
            enterotpbtn.visibility=View.VISIBLE
//            changepass.visibility=View.GONE
            val mail=findViewById<EditText>(R.id.etUsername)
            mail.visibility=View.GONE
            val entermail=findViewById<TextView>(R.id.tvEnterMail)
            entermail.visibility=View.GONE
//            val changepass=findViewById<Button>(R.id.btnChangePass)
//            changepass.visibility=View.VISIBLE




        }

        enterotpbtn.setOnClickListener {
//
            enterotp.visibility=View.GONE
            enterotpbtn.visibility=View.GONE

            val confirmpass=findViewById<EditText>(R.id.etConfirmPassword)
            confirmpass.visibility=View.VISIBLE
            val newpass=findViewById<EditText>(R.id.etNewPassword)
            newpass.visibility=View.VISIBLE
            val changepass=findViewById<Button>(R.id.btnChangePass)
            changepass.visibility=View.VISIBLE
//            Toast.makeText(this,"Password Changed",Toast.LENGTH_SHORT).show()
//            startActivity(Intent(this,MainActivity::class.java))
        }

        changepass.setOnClickListener {
            Toast.makeText(this,"Password Changed",Toast.LENGTH_SHORT).show()
            startActivity(Intent(this,MainActivity::class.java))
        }
    }
}