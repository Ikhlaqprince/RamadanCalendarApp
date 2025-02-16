package com.example.ramadancalendarapp

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class RamadanAdapter(private val ramadanDays: List<RamadanDay>) : RecyclerView.Adapter<RamadanAdapter.RamadanViewHolder>() {

    class RamadanViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val dateTextView: TextView = itemView.findViewById(R.id.dateTextView)
        val ashraTextView: TextView = itemView.findViewById(R.id.ashraTextView)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RamadanViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_ramadan_day, parent, false)
        return RamadanViewHolder(view)
    }

    override fun onBindViewHolder(holder: RamadanViewHolder, position: Int) {
        val ramadanDay = ramadanDays[position]
        holder.dateTextView.text = ramadanDay.date
        holder.ashraTextView.text = ramadanDay.ashra
    }

    override fun getItemCount(): Int {
        return ramadanDays.size
    }
}
