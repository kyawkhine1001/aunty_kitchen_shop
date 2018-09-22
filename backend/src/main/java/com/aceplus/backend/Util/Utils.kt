package com.aceplus.backend.Util

import java.text.SimpleDateFormat
import java.util.*


/**
 * Created by kkk on 9/22/2018.
 */
class Utils {
    companion object {
        fun getTodayDateNode(): String {
            val calendar = Calendar.getInstance().time
            println("Current time => " + calendar)
            val df = SimpleDateFormat("dd-MM-yyyy")
            val formattedDate = df.format(calendar)
            return formattedDate
        }

        fun getSpecialOrderDateNode(): String {
            val calendar = Calendar.getInstance().time
            val df = SimpleDateFormat("dd-MM-yyyy")
            val formattedDate = df.format(calendar)
            val dates = formattedDate.split("-")
            val day = dates[0].toInt() - 1
            return day.toString() + "-" + dates[1] + "-" + dates[2]
        }

        fun getRadomId(): String? {
            return (System.currentTimeMillis() / 1000).toString()
        }
    }
}