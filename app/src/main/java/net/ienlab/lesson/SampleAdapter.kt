package net.ienlab.lesson

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class SampleAdapter(var items: ArrayList<String>): RecyclerView.Adapter<SampleAdapter.ItemViewHolder>() {

    lateinit var context: Context

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
        context = parent.context
        val view = LayoutInflater.from(context).inflate(R.layout.adapter_sample, parent, false)
        return ItemViewHolder(view)
    }

    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
        holder.tv.text = items[holder.adapterPosition]
    }

    override fun getItemCount(): Int = items.size

    fun addItem(data: String) {
        items.add(data)
        notifyItemInserted(items.size)
    }


    inner class ItemViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {
        val tv: TextView = itemView.findViewById(R.id.tv)
    }
}