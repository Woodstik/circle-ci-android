package com.example.api

import com.example.tools.Hammer
import com.example.tools.Tool

class Workshop() {

    private val tool: Tool = Hammer()

    fun hitNail() {
        tool.use()
    }
}