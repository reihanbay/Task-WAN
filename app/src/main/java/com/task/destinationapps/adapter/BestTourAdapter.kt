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

class BestTourAdapter(val items : ArrayList<TourModel>): RecyclerView.Adapter<BestTourAdapter.TourViewHolder>() {
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
        val price : TextView = item.findViewById(R.id.tv_tour_price)
        val range : TextView = item.findViewById(R.id.tv_tour_range)
        val ivCategory : ImageView = item.findViewById(R.id.iv_category)
        val typeCategory : TextView = item.findViewById(R.id.tv_tour_category)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TourViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_rv_best_tour, parent, false)
        return TourViewHolder(view)
    }

    override fun onBindViewHolder(holder: TourViewHolder, position: Int) {
        val item = items[position]
        holder.name.text = item.name
        holder.place.text = item.place
        holder.price.text = "Rp. ${item.price.toString()}"
        holder.range.text = item.range.toString()
        when(item.category){
            'B' -> {
                Glide.with(holder.itemView).load(R.drawable.ic_temple).into(holder.ivCategory)
                holder.itemView.setOnClickListener {
                    listener.onItemClicked(item)
                }
                holder.typeCategory.text = "Candi"
            }
            'C' -> {
                Glide.with(holder.itemView).load(R.drawable.ic_beach).into(holder.ivCategory)
                holder.itemView.setOnClickListener {
                    listener.onItemClicked(item)
                }
                holder.typeCategory.text = "Pantai"
            }
            'D' -> {
                Glide.with(holder.itemView).load(R.drawable.ic_hotel).into(holder.ivCategory)
                holder.itemView.setOnClickListener {
                    listener.onItemClicked(item)
                }
                holder.typeCategory.text = "Hotel"
            }
        }
        Glide.with(holder.itemView).load(item.pict).into(holder.picture)
        holder.itemView.setOnClickListener {
            listener.onItemClicked(item)
        }
        holder.picture.clipToOutline = true
    }

    override fun getItemCount(): Int = items.size
}