package com.example.mycityapp.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.activityViewModels
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.mycityapp.R
import kotlin.getValue
import com.example.mycityapp.DateModel
import com.example.mycityapp.MainAdapter
import com.example.mycityapp.PlaceAdapter


class RecomendationFragment : Fragment() {

    private val viewModel: DateModel by activityViewModels()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_recomendation, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val adapter = PlaceAdapter { selectedPlace ->
            viewModel.selectPlace(selectedPlace)

            if (findNavController().currentDestination?.id == R.id.recomendationFragment) {
                findNavController().navigate(R.id.action_recomendationFragment_to_elementFragment)
            }
        }

        val recyclerView = view.findViewById<RecyclerView>(R.id.rcViewRecomendation)
        recyclerView.layoutManager = LinearLayoutManager(requireContext())
        recyclerView.adapter = adapter

        viewModel.selectedCategory.observe(viewLifecycleOwner) { category ->
            category?.let {
                adapter.setList(it.places)
            }
        }
    }
}