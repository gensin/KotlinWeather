package es.gensin.kotlinweather

import com.google.gson.Gson
import es.gensin.kotlinweather.data.ForecastResult
import java.net.URL

/**
 * Created by pau on 1/02/17.
 */
class ForecastRequest(val zipCode: String) {

        companion object{
            private val APP_ID = "1564a06818f61f7b8d7823ca833e1ce"
            private val URL = "http://api.openweathermap.org/data/2.5/" + "forecast/daily?mode=json&units=metric&cnt7"
            private val COMPLETE_URL = "$URL&APPID=$APP_ID&q="
        }

    fun execute(): ForecastResult {
        val forecastJsonStr = URL(COMPLETE_URL + zipCode).readText();
        return Gson().fromJson(forecastJsonStr, ForecastResult::class.java)
    }
}