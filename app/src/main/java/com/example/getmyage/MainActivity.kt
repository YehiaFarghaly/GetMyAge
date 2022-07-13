package com.example.getmyage

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import java.util.Calendar;

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        button.setOnClickListener({
            var birthYear:Int = editTextNumber.text.toString().toInt()
            var currentYear:Int = Calendar.getInstance().get(Calendar.YEAR)
            var age = currentYear-birthYear
            text.text="Your age is $age"
        })

    }
}