package com.example.kotlinweatherfragment

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.kotlinweatherfragment.databinding.ActivityMainBinding
import com.example.kotlinweatherfragment.databinding.FragmentInfoOfWeatherBinding
import java.lang.reflect.Array.newInstance

class MainActivity : AppCompatActivity(), Navigation {

    lateinit var bindingMainActivity: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        bindingMainActivity = ActivityMainBinding.inflate(layoutInflater)
        setContentView(bindingMainActivity.root)

        openListOfCities()
    }

    private fun replaceFragment(listOfCities: Fragment) {
        val fragmentManager = supportFragmentManager
        val fragmentTransaction = fragmentManager.beginTransaction()
        fragmentTransaction.replace(R.id.conteiner, listOfCities)
        fragmentTransaction.addToBackStack(null)
        fragmentTransaction.commit()
    }

    override fun openListOfCities() {
        replaceFragment(ListOfCities().newInstance())
    }

    override fun openInfoOfWeather(name: String) {
        replaceFragment(InfoOfWeather.newInstance(name))
    }
}

interface Navigation {
    fun openListOfCities()
    fun openInfoOfWeather(name: String)
}