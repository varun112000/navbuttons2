package com.example.navbuttons

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.navbuttons.R
import kotlinx.android.synthetic.main.viewitem1.view.*

class ViewPagerAdapter1: RecyclerView.Adapter<PagerVH>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PagerVH =
        PagerVH(LayoutInflater.from(parent.context).inflate(R.layout.viewitem1, parent, false))

    override fun getItemCount(): Int {
        return 2
    }

    override fun onBindViewHolder(holder: PagerVH, position: Int)= holder.itemView.run {
        if (position==0){
            image1.setImageResource(R.drawable.one)
        }
        if (position==1){
            image1.setImageResource(R.drawable.teo)
        }
    }
}
class PagerVH(itemView: View) : RecyclerView.ViewHolder(itemView)