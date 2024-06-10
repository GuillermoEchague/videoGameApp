package com.example.storefilm.presentation.ui.view


import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.storefilm.data.response.VideoGameResponse
import com.example.storefilm.databinding.GameItemBinding

class VideoGameAdapter : RecyclerView.Adapter<VideoGameAdapter.ViewHolder>() {

    var videoGames = mutableListOf<VideoGameResponse>()
        @SuppressLint("NotifyDataSetChanged")
        set(value) {
            field = value
            this.notifyDataSetChanged()
        }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): VideoGameAdapter.ViewHolder {
        val binding = GameItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ViewHolder(binding)
    }

    //El que pinta
    override fun onBindViewHolder(holder: VideoGameAdapter.ViewHolder, position: Int) {
        val videoGame = videoGames[position]
        holder.bindVideoGame(videoGame)
    }

    override fun getItemCount(): Int {
        return videoGames.size
    }

    inner class ViewHolder(private var binding: GameItemBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun bindVideoGame(videoGame: VideoGameResponse) {}
    }

}