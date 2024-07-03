package com.example.hw2

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.constraintlayout.widget.ConstraintSet.Layout
import androidx.recyclerview.widget.RecyclerView
import com.example.hw2.databinding.ItemMusicBinding

class SongAdapter (
    private var list: List<Song>,
) : RecyclerView.Adapter<SongHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SongHolder {
        return SongHolder(
            ItemMusicBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            ),

        )
    }
    override fun getItemCount(): Int = list.size

    override fun onBindViewHolder(holder: SongHolder, position: Int) {
     holder.onBind(list[position])
    }
}