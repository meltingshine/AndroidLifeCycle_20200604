package com.example.androidlifecycle_20200604

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Log.d("메인화면","onCreate가 실행 된 다 아 아 아 아")

        goToOtherBtn.setOnClickListener {
            val myIntent = Intent(this,OtherActivity::class.java)
            startActivity(myIntent)
        }

    }


    override fun onResume() {
        super.onResume()
        Log.d("메인화면","onResume 실행")
    }

    override fun onPause() {
        super.onPause()
        Log.d("메인화면","onPause실행")

    }


    override fun onDestroy() {
        super.onDestroy()
        Log.d("메인화면","onDestory실행")
//          메인을 끄고 스플래쉬로 돌아가면,
//        메인에서 스위치를 받아서
//        그때 광고를 키면 될듯
//        val myIntent = Intent(this,this::class.java)
//        startActivity(myIntent)
    }
}
