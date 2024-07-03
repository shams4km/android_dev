package com.example.hw2

import androidx.constraintlayout.motion.widget.MotionScene.Transition.TransitionOnClick
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import coil.load
import com.example.hw2.databinding.ItemMusicBinding

class SongHolder(
    private val binding: ItemMusicBinding,
    private val onClick: (Song) -> Unit,
) : RecyclerView.ViewHolder(binding.root) {
    fun onBind(item: Song) {
        binding.run {
            albumTitleTextView.text = item.songName
            albumArtistTextView.text = item.artistName
            descTv.text = item.desc
            albumImageView.load(item.url)
            root.setOnClickListener{
                onClick.invoke(item)
            }
        }
    }
}

