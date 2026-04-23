package com.example.mycityapp.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.fragment.app.activityViewModels
import com.example.mycityapp.R
import kotlin.getValue
import com.example.mycityapp.DateModel

class ElementFragment : Fragment() {

    private val viewModel: DateModel by activityViewModels()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_element, container, false)
    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val pic = view.findViewById<ImageView>(R.id.ivPicElem)
        val name = view.findViewById<TextView>(R.id.tvNameElem)
        val desc = view.findViewById<TextView>(R.id.tvDeskElem)
        viewModel.selectedPlace.observe(viewLifecycleOwner) { place ->
            place?.let {
                name.setText(it.nameElem)
                desc.setText(it.descLongData)
                pic.setImageResource(it.imageData)
            }
        }
    }
}