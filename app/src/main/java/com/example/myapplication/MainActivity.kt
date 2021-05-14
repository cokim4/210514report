package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val insertedNumber: EditText = findViewById(R.id.editwindow)
        val btn: Button = findViewById(R.id.btn_a)

        btn.setOnClickListener() {
            val intent = Intent(this, SubActivity::class.java)
            intent.putExtra("number", insertedNumber.getText().toString())

            if(insertedNumber.length() != 0)
                startActivity(intent)
        }

    }
}

