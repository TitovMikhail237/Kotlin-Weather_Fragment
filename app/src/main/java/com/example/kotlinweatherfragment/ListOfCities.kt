package com.example.kotlinweatherfragment

import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.kotlinweatherfragment.api.CitiesList
import com.example.kotlinweatherfragment.databinding.FragmentListOfCitiesBinding

class ListOfCities : Fragment(), OnItemClickListener {
    lateinit var bindingListOfCity: FragmentListOfCitiesBinding

    // lateinit var recyclerView: RecyclerView
    //lateinit var citiesArrayList: ArrayList<City>
    lateinit var listenerNavigation: Navigation
    var cityAdapter: RecyclerView.Adapter<CityAdapter.MyViewHolder>? = null

//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//
//        val listenerNavigation by lazy { }
//    }

    fun newInstance(): ListOfCities {
        return ListOfCities()
    }

    override fun onAttach(context: Context) {
        super.onAttach(context)
        if (context is Navigation) {
            listenerNavigation = context
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        bindingListOfCity = FragmentListOfCitiesBinding.inflate(inflater, container, false)
        return bindingListOfCity.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val citiesList by lazy { CitiesList() }
        val citiesArrayList: ArrayList<City> by lazy { citiesList.cityInit() }

        val layoutManager = LinearLayoutManager(context)
        val recyclerView: RecyclerView by lazy { view.findViewById(R.id.recyclerView) }
        recyclerView.layoutManager = layoutManager
        recyclerView.setHasFixedSize(true)

        cityAdapter = CityAdapter(citiesArrayList, this)
        recyclerView.adapter = cityAdapter
    }

    override fun onItemClick(nameCity: String) {
        listenerNavigation.openInfoOfWeather(nameCity)
    }
}

interface OnItemClickListener {
    fun onItemClick(nameCity: String)
}