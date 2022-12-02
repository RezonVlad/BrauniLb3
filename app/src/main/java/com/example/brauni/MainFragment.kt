package com.example.brauni

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageButton
import android.widget.ImageView
import androidx.navigation.fragment.findNavController


class MainFragment : Fragment() {

    private lateinit var imageView: ImageView


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_main, container, false)
        val imageButton3 = view.findViewById<ImageButton>(R.id.imB)
        imageButton3.setOnClickListener{
            findNavController().navigate(R.id.action_mainFragment_to_information2)
        }


        val button = view.findViewById<Button>(R.id.b2)
        button.setOnClickListener{
            findNavController().navigate(R.id.action_mainFragment_to_ingredients)
        }
        val button2 = view.findViewById<Button>(R.id.b3)
        button2.setOnClickListener{
            findNavController().navigate(R.id.action_mainFragment_to_recipe)
        }
        return view
    }




    companion object {


    }

}