package com.example.githubpackagestest

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.examplelibrary.add
import com.example.examplelibrary.showRealToast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        textView.text = "2+2=${add(2, 2)}"

        btnShowToast.setOnClickListener { showRealToast(this, "Super toast!") }
    }
}
