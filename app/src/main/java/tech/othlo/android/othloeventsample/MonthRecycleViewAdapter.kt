package tech.othlo.android.othloeventsample

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.ViewGroup

class MonthRecycleViewAdapter(private val months: List<String>): RecyclerView.Adapter<ListItemViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ListItemViewHolder {
        val itemView = LayoutInflater.from(parent.context)
            .inflate(R.layout.listitem, parent, false)
        return ListItemViewHolder(itemView)
    }

    override fun getItemCount(): Int {
        return months.size
    }

    override fun onBindViewHolder(holder: ListItemViewHolder, position: Int) {
        holder.name?.text = months[position]
    }
}