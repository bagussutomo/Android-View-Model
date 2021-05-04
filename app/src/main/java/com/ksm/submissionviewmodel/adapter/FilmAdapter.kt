package com.ksm.submissionviewmodel.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.ksm.submissionviewmodel.data.EntityFilm
import com.ksm.submissionviewmodel.databinding.ItemMovieBinding
import com.ksm.submissionviewmodel.util.OnFilmClickListener

class FilmAdapter(
        private val movieList: MutableList<EntityFilm>,
        private val onFilmClickListener: OnFilmClickListener
) : RecyclerView.Adapter<FilmAdapter.ViewHolder>(){

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val binding = ItemMovieBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(movieList[position])
    }

    override fun getItemCount() = movieList.size

    inner class ViewHolder(private val binding : ItemMovieBinding) :
            RecyclerView.ViewHolder(binding.root) {

        fun bind(data: EntityFilm) {
            with(binding) {
                tvTitle.text = data.name
                tvScore.text = data.score
                tvGenre.text = data.genre
                ivMovie.setImageResource(data.image!!)
                itemView.setOnClickListener {onFilmClickListener.onClickToDetail(data.name.toString())}
            }
        }
    }
}