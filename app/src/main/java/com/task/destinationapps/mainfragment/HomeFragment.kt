package com.task.destinationapps.mainfragment

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.ActionBar
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.task.destinationapps.R
import com.task.destinationapps.adapter.BestTourAdapter
import com.task.destinationapps.adapter.TopTourAdapter
import com.task.destinationapps.data.TourData
import com.task.destinationapps.databinding.FragmentHomeBinding
import com.task.destinationapps.model.TourModel
import kotlin.collections.ArrayList


class HomeFragment : Fragment() {
    private lateinit var binding : FragmentHomeBinding
    private var list : ArrayList<TourModel> = arrayListOf()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_home, container, false)

        list.addAll(TourData.Destination.listData)

        binding.rvBestTour.isNestedScrollingEnabled = false

        setRecycler()
        return binding.root
    }

    fun setRecycler(){
        val adapter = TopTourAdapter(list)
        binding.rvTopTour.adapter = adapter
        binding.rvTopTour.layoutManager = LinearLayoutManager(activity, RecyclerView.HORIZONTAL, false)

        adapter.setOnItemClick(object : TopTourAdapter.onItemClick{
            override fun onItemClicked(data: TourModel) {
//                val intent = Intent(activity, DetailActivity::class.java)
//                val data = TourModel(data.pict, data.name, data.detail, data.origin)
//                intent.putExtra("SEND", data)
//                startActivity(intent)
            }

        })

        val adapterBestTour = BestTourAdapter(list)
        binding.rvBestTour.adapter = adapterBestTour
        binding.rvBestTour.layoutManager = LinearLayoutManager(activity, RecyclerView.VERTICAL, false)
    }

}