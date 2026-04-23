package com.example.mycityapp

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class PlaceAdapter(private val onItemClick: (ElemData) -> Unit): RecyclerView.Adapter<PlaceAdapter.PlaceHolder>() {
    var placeList = listOf<ElemData>()
    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): PlaceHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.place_item, parent, false)
        return PlaceHolder(view)
    }

    override fun onBindViewHolder(
        holder: PlaceHolder,
        position: Int
    ) {
        holder.bind(placeList[position])
    }

    fun setList(newList: List<ElemData>) {
        this.placeList = newList
        notifyDataSetChanged()
    }

    override fun getItemCount(): Int {
        return placeList.size
    }

    inner class PlaceHolder(item: View): RecyclerView.ViewHolder(item) {
        val name = item.findViewById<TextView>(R.id.tvNamePlace)
        val desc = item.findViewById<TextView>(R.id.tvShortDescPlace)
        val icon = item.findViewById<ImageView>(R.id.ivIcon)
        fun bind(element: ElemData){
            name.setText(element.nameElem)
            desc.setText(element.descShortData)
            icon.setImageResource(element.iconData)

            itemView.setOnClickListener {
                onItemClick(element)
            }
        }

    }

}