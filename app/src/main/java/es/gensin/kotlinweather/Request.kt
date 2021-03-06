package es.gensin.kotlinweather

import android.util.Log
import java.net.URL

/**
 * Created by pau on 27/01/17.
 */
class Request(val url: String) {

    fun run() {
        val forecastJsonStr = URL(url).readText()
        Log.d(javaClass.simpleName, forecastJsonStr)
    }
}