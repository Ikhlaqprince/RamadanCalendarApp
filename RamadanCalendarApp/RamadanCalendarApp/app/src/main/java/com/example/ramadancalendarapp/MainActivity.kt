package com.example.ramadancalendarapp

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val ramadanDays = getRamadanDays()
        val adapter = RamadanAdapter(ramadanDays)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = adapter
    }

    private fun getRamadanDays(): List<RamadanDay> {
        val startDate = "Friday, February 28, 2025"
        val endDate = "Sunday, March 30, 2025"
        val days = mutableListOf<RamadanDay>()

        var currentDay = startDate
        var dayCount = 1

        while (currentDay <= endDate) {
            val ashra = when {
                dayCount <= 10 -> "Pehla Ashra"
                dayCount <= 20 -> "Dosra Ashra"
                else -> "Teesra Ashra"
            }
            days.add(RamadanDay(currentDay, ashra))
            dayCount++
            // Increment currentDay (this is a placeholder, you need to implement actual date increment)
            currentDay = getNextDay(currentDay)
        }

        return days
    }

    private fun getNextDay(currentDay: String): String {
        // Implement actual date increment logic
        return currentDay // Placeholder
    }
}
