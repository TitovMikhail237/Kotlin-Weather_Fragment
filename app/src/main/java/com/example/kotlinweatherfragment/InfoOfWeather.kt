package com.example.kotlinweatherfragment

import android.annotation.SuppressLint
import android.content.ContentValues.TAG
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import com.example.kotlinweatherfragment.api.RetrofitBuilder.weatherApi
import com.example.kotlinweatherfragment.api.WeatherOfCity
import com.example.kotlinweatherfragment.databinding.FragmentInfoOfWeatherBinding
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import kotlin.math.roundToInt

class InfoOfWeather : Fragment() {

    //lateinit var url: String
    //lateinit var apiKey: String
    lateinit var bindingInfoOfWeather: FragmentInfoOfWeatherBinding

    val apiKey = BuildConfig.API_KEY
    val url = BuildConfig.BASE_URL

    private var nameCity: String? = null

    companion object {
        private const val NAME_CITY_KEY = "name_city"

        fun newInstance(nameCity: String) =
            InfoOfWeather().apply {
                arguments = Bundle().apply {
                    putString(NAME_CITY_KEY, nameCity)
                }
            }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        bindingInfoOfWeather = FragmentInfoOfWeatherBinding.inflate(inflater, container, false)
        return bindingInfoOfWeather.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        arguments?.let {
            nameCity = it.getString(NAME_CITY_KEY)
        }

       // url = "https://api.openweathermap.org/data/2.5/weather?q={city name}&appid={API key}"
       // apiKey = "6344ad6b9ec027163e9d495e5e2ad8be"
        request()
    }

    fun request() {

        val call: Call<WeatherOfCity> =
            weatherApi.loadWeather(nameCity.toString(), apiKey)

        call.enqueue(object : Callback<WeatherOfCity> {
            @SuppressLint("SetTextI18n")
            override fun onResponse(
                call: Call<WeatherOfCity>?,
                response: Response<WeatherOfCity>?
            ) {
                val info: WeatherOfCity? = response?.body()
                if (info != null) {
                    bindingInfoOfWeather.textViewTitle.text = ("Weather of $nameCity").toString()
                    bindingInfoOfWeather.textViewHumidity.text =
                        ("Влажность ${info.main.humidity}%").toString()
                    bindingInfoOfWeather.textViewPressure.text =
                        ("Давление ${info.main.pressure * 760 / 1013} мм.рт.ст").toString()
                    bindingInfoOfWeather.textViewTemperature.text =
                        ("Температура ${((info.main.temp - 273) * 100).roundToInt() / 100}°C").toString()
                    bindingInfoOfWeather.textViewWindSpeed.text =
                        ("Скорость ветра ${info.wind.speed}м/с").toString()
                    bindingInfoOfWeather.textViewClouds.text =
                        ("Облачность ${info.clouds.all / 10} баллов").toString()
                } else {

                }
            }

            override fun onFailure(call: Call<WeatherOfCity>?, t: Throwable?) {
                Toast.makeText(requireContext(), "not connection the net", Toast.LENGTH_LONG).show()
            }
        })
    }
}



