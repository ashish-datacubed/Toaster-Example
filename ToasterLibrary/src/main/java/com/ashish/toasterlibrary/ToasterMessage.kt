package com.ashish.toasterlibrary

import android.content.Context
import android.widget.Toast

object ToasterMessage {

    fun showToast(context: Context, message: String, toastLength: Int = Toast.LENGTH_SHORT) {
        Toast.makeText(context, message, toastLength).show()
    }

}