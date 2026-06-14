package com.example.reels

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.PagerSnapHelper
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    lateinit var recyclerView: RecyclerView
    var data = mutableListOf<coffee>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(
                systemBars.left,
                systemBars.top,
                systemBars.right,
                systemBars.bottom
            )
            insets
        }

        recyclerView = findViewById(R.id.rc)

        recyclerView.layoutManager =
            LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)

        val snapHelper = PagerSnapHelper()
        snapHelper.attachToRecyclerView(recyclerView)

        data.add(coffee("A", R.raw.a, R.raw.a))
        data.add(coffee("B", R.raw.b, R.raw.b))
        data.add(coffee("C", R.raw.c, R.raw.c))
        data.add(coffee("D", R.raw.d, R.raw.d))
        data.add(coffee("E", R.raw.e, R.raw.e))
        data.add(coffee("F", R.raw.f, R.raw.f))
        data.add(coffee("G", R.raw.g, R.raw.g))
        data.add(coffee("H", R.raw.h, R.raw.h))

        recyclerView.adapter = ReelAdapter(data)
        recyclerView.addOnScrollListener(object : RecyclerView.OnScrollListener() {

            override fun onScrollStateChanged(
                recyclerView: RecyclerView,
                newState: Int
            ) {
                super.onScrollStateChanged(recyclerView, newState)

                if (newState == RecyclerView.SCROLL_STATE_IDLE) {

                    val layoutManager =
                        recyclerView.layoutManager as LinearLayoutManager

                    val position =
                        layoutManager.findFirstCompletelyVisibleItemPosition()

                    if (position != RecyclerView.NO_POSITION) {

                        val holder =
                            recyclerView.findViewHolderForAdapterPosition(position)
                                    as ReelViewHolder?

                        holder?.player?.play()
                    }
                }
            }
        })
    }
}