package com.example.navbuttons

import android.content.Intent
import android.os.Binder
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_viewitem1.*
import kotlinx.android.synthetic.main.fragment_hacks.*
import java.util.ArrayList

class viewitem1 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_viewitem1)
        viewPager2.adapter = ViewPagerAdapter2()
    }
}
