package com.example.dzikirapp

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class DzikirDoaAdapter(/*private*/ val listDzikirDoa: ArrayList<DzikirDoa>) : RecyclerView.Adapter<DzikirDoaAdapter.MyViewHolder>() {
    inner class MyViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val tvDesc: TextView = view.findViewById(R.id.tv_desc)
        val tvlafaz: TextView = view.findViewById(R.id.tv_lafaz)
        val tvTerjemah: TextView = itemView.findViewById(R.id.tv_terjemah)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) = MyViewHolder(
        LayoutInflater.from(parent.context).inflate(R.layout.row_item_dzikir_doa, parent, false)
    )

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.tvDesc.text = listDzikirDoa[position].desc
        holder.tvlafaz.text = listDzikirDoa[position].lafaz
        holder.tvTerjemah.text = listDzikirDoa[position].terjemah
    }

    override fun getItemCount() = listDzikirDoa.size

}