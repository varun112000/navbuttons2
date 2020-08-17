package com.example.navbuttons

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.viewitem1.view.*
import kotlinx.android.synthetic.main.viewitem3.view.*

class ViewPagerAdapter2: RecyclerView.Adapter<PagerVH3>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PagerVH3 =
        PagerVH3(LayoutInflater.from(parent.context).inflate(R.layout.viewitem3, parent, false))

    override fun getItemCount(): Int {
        return 2
    }

    override fun onBindViewHolder(holder: PagerVH3, position: Int)= holder.itemView.run {
        if (position==0){
            image9.setImageResource(R.drawable.one)
        }
        if (position==1){
            image9.setImageResource(R.drawable.teo)
        }
    }
}
class PagerVH3(itemView: View) : RecyclerView.ViewHolder(itemView)