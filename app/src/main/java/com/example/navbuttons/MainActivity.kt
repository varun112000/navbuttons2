package com.example.navbuttons

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.fragment_hacks.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        supportFragmentManager.beginTransaction().replace(R.id.fragmentContainer, HacksFragment()).commit()
        button_nav.setOnNavigationItemSelectedListener OnNavigationItemSelectedListener@{
            when(it.itemId){
                R.id.hacks -> {
                    val fragment = HacksFragment()
                    supportFragmentManager.beginTransaction().replace(R.id.fragmentContainer,fragment)
                        .commit()
                    return@OnNavigationItemSelectedListener true
                }
                R.id.category -> {
                    val fragment = Categories()
                    supportFragmentManager.beginTransaction().replace(R.id.fragmentContainer,fragment)
                        .commit()
                    return@OnNavigationItemSelectedListener true
                }
                R.id.search-> {
                    val fragment = SearchFragment()
                    supportFragmentManager.beginTransaction().replace(R.id.fragmentContainer,fragment)
                        .commit()
                    return@OnNavigationItemSelectedListener true
                }
                else -> {
                    val fragment = ProfileFragment()
                    supportFragmentManager.beginTransaction().replace(R.id.fragmentContainer,fragment)
                        .commit()
                    return@OnNavigationItemSelectedListener true

                }
            }
        }
    }
}