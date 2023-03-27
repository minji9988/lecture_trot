package com.example.trot1

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.navigation.findNavController

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

class Singer2Fragment : Fragment() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view =  inflater.inflate(R.layout.fragment_singer2, container, false)

        //second fragment에서 image1 클릭 시 first fragment로 moving
        view.findViewById<ImageView>(R.id.image1).setOnClickListener {

            //2번째에서 1첫 번째로 이동하는 주문
            it.findNavController().navigate(R.id.action_singer2Fragment_to_singer1Fragment)
        }

        //second fragment에서 image3 클릭 시 third fragment로 moving
        view.findViewById<ImageView>(R.id.image3).setOnClickListener {

            //2번째에서 1첫 번째로 이동하는 주문
            it.findNavController().navigate(R.id.action_singer2Fragment_to_singer3Fragment)
        }


        return view
    }


}