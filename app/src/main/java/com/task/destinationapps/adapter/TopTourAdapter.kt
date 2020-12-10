package com.task.destinationapps.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.task.destinationapps.R
import com.task.destinationapps.model.TourModel

class TopTourAdapter(val items : ArrayList<TourModel>): RecyclerView.Adapter<TopTourAdapter.TourViewHolder>() {
    private lateinit var listener : onItemClick

    fun setOnItemClick(onClick: onItemClick){
        this.listener = onClick
    }

    interface onItemClick {
        fun onItemClicked(data: TourModel)
    }


    class TourViewHolder(item: View) : RecyclerView.ViewHolder(item){
        val picture = item.findViewById<ImageView>(R.id.iv_tour)
        val name : TextView = item.findViewById(R.id.tv_tour_name)
        val place : TextView = item.findViewById(R.id.tv_tour_place)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TourViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_rv_top_tour, parent, false)
        return TourViewHolder(view)
    }

    override fun onBindViewHolder(holder: TourViewHolder, position: Int) {
        val item = items[position]
        holder.name.text = item.name
        holder.place.text = item.place
        Glide.with(holder.itemView).load(item.pict).into(holder.picture)
        holder.itemView.setOnClickListener {
            listener.onItemClicked(item)
        }
        holder.picture.clipToOutline = true
    }

    override fun getItemCount(): Int = items.size
}