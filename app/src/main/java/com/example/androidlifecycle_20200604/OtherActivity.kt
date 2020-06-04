package com.example.androidlifecycle_20200604

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_other.*

class OtherActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_other)

        Log.d("다른화면", "onCreate 됨")
        backBtn.setOnClickListener {
            finish()

        }
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("다른화면", "onDestory실행")

    }

}