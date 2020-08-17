package com.example.navbuttons


import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.RelativeLayout
import androidx.core.content.ContextCompat.startActivity
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.viewitem2.view.*

class RecyclerViewAdapter(val items:ArrayList<Carditem>, var clickListener: OnCardItemClickListener):RecyclerView.Adapter<RecyclerViewAdapter.viewHolder>(){
    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): RecyclerViewAdapter.viewHolder {
        val itemView:View=LayoutInflater.from(parent.context).inflate(R.layout.viewitem2, parent, false)
        return viewHolder(itemView)
    }

    class viewHolder(itemView: View):RecyclerView.ViewHolder(itemView) {
        val Image5: ImageView = itemView.image2
        fun initailize(item: Carditem, action: OnCardItemClickListener){
            Image5.setImageResource(item.Image)
            Image5.setOnClickListener{
                action.onItemClick(item, adapterPosition)
            }
        }
    }

    override fun getItemCount(): Int {
        return items.size
    }
    override fun onBindViewHolder(holder: viewHolder, position: Int) {
      //  val item = items[position]
       // holder.Image5.setImageResource(item.Image)
        holder.initailize(items.get(position), clickListener)
    }
}

interface OnCardItemClickListener{
    fun onItemClick(item:Carditem, position: Int)
}