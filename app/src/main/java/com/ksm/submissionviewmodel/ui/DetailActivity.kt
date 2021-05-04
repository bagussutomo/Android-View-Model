package com.ksm.submissionviewmodel.ui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.ViewModelProvider
import com.ksm.submissionviewmodel.R
import com.ksm.submissionviewmodel.adapter.FilmAdapter
import com.ksm.submissionviewmodel.data.DetailFilm
import com.ksm.submissionviewmodel.data.EntityFilm
import com.ksm.submissionviewmodel.databinding.ActivityDetailBinding
import com.ksm.submissionviewmodel.model.MovieViewModel

class DetailActivity : AppCompatActivity() {

    companion object {
        const val EXTRA_MOVIE_NAME = "movie_name"
    }

    private lateinit var binding: ActivityDetailBinding
    private lateinit var detailViewModel: MovieViewModel
    private lateinit var filmName: String
    private lateinit var movie: DetailFilm

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDetailBinding.inflate(layoutInflater)
        setContentView(binding.root)

        initData()
        initUi()
    }

    private fun initData() {
        detailViewModel = ViewModelProvider(
                this,
                ViewModelProvider.NewInstanceFactory()
        )[MovieViewModel::class.java]

        filmName = intent.getStringExtra(EXTRA_MOVIE_NAME).toString()
        movie = detailViewModel.getDetailFilm(filmName)
    }

    private fun initUi() {
        with(binding) {
            tvTitle.text = movie.name
            ivDetail.setImageResource(movie.image!!)
            tvScore.text = movie.score
            tvGenre.text = movie.genre
            tvSynopsis.text = movie.synopsis
        }
    }
}