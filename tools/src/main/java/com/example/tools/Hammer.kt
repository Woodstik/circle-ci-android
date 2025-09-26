package com.example.tools

import android.util.Log

class Hammer : Tool {
    override fun use() {
        Log.d("Hammer", "Hammering nails!")
    }
}