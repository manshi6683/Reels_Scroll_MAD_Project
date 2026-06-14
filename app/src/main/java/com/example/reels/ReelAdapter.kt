package com.example.reels

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class ReelAdapter(
    var data: MutableList<coffee>
) : RecyclerView.Adapter<ReelViewHolder>() {

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): ReelViewHolder {

        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.reelview, parent, false)

        return ReelViewHolder(view)
    }

    override fun onBindViewHolder(
        holder: ReelViewHolder,
        position: Int
    ) {

        val item = data[position]

        holder.title.text = item.title

        holder.bindData(item.video)
    }

    override fun getItemCount(): Int {
        return data.size
    }

    override fun onViewAttachedToWindow(holder: ReelViewHolder) {
        super.onViewAttachedToWindow(holder)

        holder.player.playWhenReady = true
    }

    override fun onViewDetachedFromWindow(holder: ReelViewHolder) {
        super.onViewDetachedFromWindow(holder)

        holder.player.pause()
        holder.player.seekTo(0)
    }
}