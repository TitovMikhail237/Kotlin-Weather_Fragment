package com.example.kotlinweatherfragment

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.kotlinweatherfragment.databinding.ItemCityBinding

class CityAdapter(private val cityList: ArrayList<City>, val listener: OnItemClickListener) :
    RecyclerView.Adapter<CityAdapter.MyViewHolder>() {

    inner class MyViewHolder(private val cityBinding: ItemCityBinding) :
        RecyclerView.ViewHolder(cityBinding.root) {

        fun bind(city: City) {
            cityBinding.itemCityTextView.text = city.name
            cityBinding.itemCityTextView.setOnClickListener {
                listener.onItemClick(city.name)
            }
            Glide
                .with(itemView.context)
                .load(city.imageUrl)
                .into(cityBinding.itemCityImageView)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        val cityBinding = ItemCityBinding.inflate(layoutInflater, parent, false)
        return MyViewHolder(cityBinding)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        val currentCity = cityList[position]
        holder.bind(currentCity)
    }

    override fun getItemCount() = cityList.size
}