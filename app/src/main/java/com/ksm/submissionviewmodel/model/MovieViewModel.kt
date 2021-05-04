package com.ksm.submissionviewmodel.model

import androidx.lifecycle.ViewModel
import com.ksm.submissionviewmodel.data.DataMovie
import com.ksm.submissionviewmodel.data.DataTvShow
import com.ksm.submissionviewmodel.data.DetailFilm

class MovieViewModel : ViewModel() {
    fun getMovie() = DataMovie.listMovie

    fun getTvShow() = DataTvShow.listTvShow

    fun getDetailFilm(nameMovie: String) : DetailFilm {
        val listMovie = DataMovie.detailMovie
        lateinit var movie: DetailFilm
        for (i in listMovie) {
            if (i.name == nameMovie) {
                movie = i
            }
        }

        val listTvShow = DataTvShow.detailTvShow
        for (i in listTvShow) {
            if (i.name == nameMovie) {
                movie = i
            }
        }

        return movie
    }
}