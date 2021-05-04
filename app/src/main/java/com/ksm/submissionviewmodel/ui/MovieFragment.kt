package com.ksm.submissionviewmodel.ui

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import com.ksm.submissionviewmodel.adapter.FilmAdapter
import com.ksm.submissionviewmodel.data.EntityFilm
import com.ksm.submissionviewmodel.databinding.FragmentMovieBinding
import com.ksm.submissionviewmodel.model.MovieViewModel
import com.ksm.submissionviewmodel.util.OnFilmClickListener

class MovieFragment : Fragment(), OnFilmClickListener {

    companion object {
        private const val SECTION_NUMBER = "section_number"
    }

    private lateinit var binding: FragmentMovieBinding
    private lateinit var list: MutableList<EntityFilm>
    private lateinit var movieViewModel: MovieViewModel
    private var index: Int = 0

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentMovieBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        index = arguments?.getInt(SECTION_NUMBER, 0) ?: 0

        initiateData()
        initiateUI()
    }

    private fun initiateUI() {
        showRecyclerList(list)
    }

    private fun showRecyclerList(list: MutableList<EntityFilm>) {
        with(binding) {
            rvMovie.layoutManager = LinearLayoutManager(context)
            val listFilm = FilmAdapter(list, this@MovieFragment)
            rvMovie.adapter = listFilm
        }
    }

    private fun initiateData() {
        movieViewModel = ViewModelProvider(
                this,
                ViewModelProvider.NewInstanceFactory()
        )[MovieViewModel::class.java]

        list = (if (index == 0) {
            movieViewModel.getMovie()
        } else movieViewModel.getTvShow())
    }

    override fun onClickToDetail(name: String) {
        val intent = Intent(requireActivity(), DetailActivity::class.java)
        intent.putExtra(DetailActivity.EXTRA_MOVIE_NAME, name)
        startActivity(intent)
    }

}