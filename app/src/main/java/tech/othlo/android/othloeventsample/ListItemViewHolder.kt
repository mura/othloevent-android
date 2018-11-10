package tech.othlo.android.othloeventsample

import android.support.v7.widget.RecyclerView
import android.view.View
import android.widget.TextView

class ListItemViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {
    val name: TextView? = itemView.findViewById(R.id.name)
}