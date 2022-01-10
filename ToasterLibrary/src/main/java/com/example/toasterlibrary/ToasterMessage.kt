package com.example.toasterlibrary

import android.content.Context
import android.widget.Toast

class ToasterMessage {
    companion object{
        fun showToastMessage(context: Context, message:String){
            Toast.makeText(context, message, Toast.LENGTH_SHORT).show()
        }
    }
}