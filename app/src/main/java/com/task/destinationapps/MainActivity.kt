package com.task.destinationapps

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import com.task.destinationapps.databinding.ActivityMainBinding
import com.task.destinationapps.mainfragment.HomeFragment
import com.task.destinationapps.mainfragment.PlaceFragment
import com.task.destinationapps.mainfragment.SaveFragment
import com.task.destinationapps.mainfragment.UserFragment

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= DataBindingUtil.setContentView(this,R.layout.activity_main)

        val home = HomeFragment()
        val save = SaveFragment()
        val place = PlaceFragment()
        val user = UserFragment()
        currentScreen(home)
        binding.bottomNav.setOnNavigationItemSelectedListener {
           when(it.itemId){
               R.id.ic_home -> currentScreen(home)
               R.id.ic_pin_maps-> currentScreen(place)
               R.id.ic_bookmark-> currentScreen(save)
               R.id.ic_user-> currentScreen(user)
               else -> false
           }
        }
    }

    fun currentScreen(fragment: Fragment):Boolean{
        supportFragmentManager.beginTransaction().apply {
            replace(R.id.container, fragment)
                .commit()
        }
        return true
    }
}