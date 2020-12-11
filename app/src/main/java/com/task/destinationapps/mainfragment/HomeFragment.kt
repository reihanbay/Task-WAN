package com.task.destinationapps.mainfragment

import android.animation.Animator
import android.animation.AnimatorListenerAdapter
import android.os.Build
import android.os.Bundle
import android.view.*
import android.widget.Toast
import androidx.annotation.RequiresApi
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar
import androidx.core.view.MenuItemCompat
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.task.destinationapps.R
import com.task.destinationapps.adapter.BestTourAdapter
import com.task.destinationapps.adapter.TopTourAdapter
import com.task.destinationapps.data.TourData
import com.task.destinationapps.data.TourData.Destination.name
import com.task.destinationapps.databinding.FragmentHomeBinding
import com.task.destinationapps.model.TourModel


class HomeFragment : Fragment() {
    private lateinit var binding : FragmentHomeBinding
    private lateinit var search_menu : Menu
    private lateinit var item_search : MenuItem
    private lateinit var searchToolbar : Toolbar
    private lateinit var toolbar: Toolbar
    private var list : ArrayList<TourModel> = arrayListOf()

    override fun onCreateView(
            inflater: LayoutInflater, container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_home, container, false)
        toolbar = binding.toolbarMain
        (activity as AppCompatActivity).setSupportActionBar(toolbar)
        (activity as AppCompatActivity).supportActionBar

        binding.btnSearch.setOnClickListener {
            Toast.makeText(activity, "dcsdf", Toast.LENGTH_SHORT).show()
        }
        list.addAll(TourData.Destination.listData)
        binding.rvBestTour.isNestedScrollingEnabled = false
        setRecycler()
        return binding.root
    }

    fun setRecycler(){
        val adapter = TopTourAdapter(list)
        binding.rvTopTour.adapter = adapter
        binding.rvTopTour.layoutManager = LinearLayoutManager(activity, RecyclerView.HORIZONTAL, false)

        adapter.setOnItemClick(object : TopTourAdapter.onItemClick {
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