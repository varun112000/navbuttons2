package com.example.navbuttons

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.LinearLayout
import android.widget.RelativeLayout
import android.widget.Toast
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.navbuttons.R.layout.activity_main
import com.example.navbuttons.R.layout.fragment_hacks
import kotlinx.android.synthetic.main.fragment_hacks.*
import kotlinx.android.synthetic.main.viewitem2.*

class HacksFragment : Fragment(), OnCardItemClickListener{
    val arrayq=ArrayList<Carditem>()
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
            // Inflate the layout for this fragment
            return inflater.inflate(fragment_hacks, container, false)
        }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewPager1.adapter = ViewPagerAdapter1()
        val item1 = Carditem(R.drawable.teo)
        val item2 = Carditem(R.drawable.one)
        val item3 = Carditem(R.drawable.one)
        val item4 = Carditem(R.drawable.teo)
        arrayq.add(item1)
        arrayq.add(item2)
        arrayq.add(item3)
        arrayq.add(item4)
        recyclerview.adapter = RecyclerViewAdapter(arrayq, this)
        recyclerview.layoutManager = GridLayoutManager(activity, 2)
        recyclerview.setHasFixedSize(false)
    }

    override fun onItemClick(item: Carditem, position: Int) {
        //  Toast.makeText(activity, "Hello", Toast.LENGTH_SHORT).show()
        val intent:Intent = Intent(activity, viewitem1::class.java)
        startActivity(intent)
    }
}
