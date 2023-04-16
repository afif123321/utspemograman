package com.example.utspember

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class DataAdapter (private val listgrid: ArrayList<StringData>, private val context: Context
): RecyclerView.Adapter<DataAdapter.CourseViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DataAdapter.CourseViewHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(
            R.layout.item_layout,
            parent, false
        )
        return CourseViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: DataAdapter.CourseViewHolder, position: Int) {
        holder.nama.text = listgrid.get(position).Name
        holder.nim.text = listgrid.get(position).Nim
        holder.umur.text = listgrid.get(position).Age
        holder.gambar.setImageResource(listgrid.get(position).Img)
    }

    override fun getItemCount(): Int {
        return listgrid.size
    }

    class CourseViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val gambar: ImageView = itemView.findViewById(R.id.idfoto)
        val nama: TextView = itemView.findViewById(R.id.idnamabola)
        val nim: TextView = itemView.findViewById(R.id.idnimbola)
        val umur: TextView = itemView.findViewById(R.id.idumurbola)
    }
}