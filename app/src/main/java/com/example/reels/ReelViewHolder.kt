package com.example.reels

import android.view.View
import android.widget.TextView
import androidx.media3.common.MediaItem
import androidx.media3.common.Player
import androidx.media3.exoplayer.ExoPlayer
import androidx.media3.ui.AspectRatioFrameLayout
import androidx.media3.ui.PlayerView
import androidx.recyclerview.widget.RecyclerView
import androidx.media3.common.util.UnstableApi

class ReelViewHolder(item: View) : RecyclerView.ViewHolder(item) {

    var playerView: PlayerView
    var title: TextView
    var player: Player

    init {

        playerView = item.findViewById(R.id.ev)
        title = item.findViewById(R.id.title)

        player = ExoPlayer.Builder(item.context).build()

        playerView.player = player

        playerView.resizeMode =
            AspectRatioFrameLayout.RESIZE_MODE_ZOOM
    }

    fun bindData(reel: Int) {

        val mediaItem = MediaItem.fromUri(
            "android.resource://${itemView.context.packageName}/$reel"
        )

        player.setMediaItem(mediaItem)

        player.prepare()

        player.playWhenReady = true
    }
}