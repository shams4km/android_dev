package com.example.hw2

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.window.SplashScreen
import androidx.core.os.bundleOf
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.hw2.databinding.FragmentMusicBinding

class MusicFragment : Fragment(R.layout.fragment_music) {
    private var binding: FragmentMusicBinding? = null
    private var adapter: SongAdapter? = null

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentMusicBinding.bind(view)
        initAdapter()
    }

    private fun initAdapter() {
        adapter = SongAdapter(SampleRepository.songs)
        binding?.run {
            adapter = SongAdapter(
                list = SampleRepository.songs
            )
            rvSong.adapter = adapter
            rvSong.layoutManager = LinearLayoutManager(requireContext())
        }
    }
}