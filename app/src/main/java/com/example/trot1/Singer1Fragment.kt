package com.example.trot1

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.navigation.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView


class Singer1Fragment : Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val view = inflater.inflate(R.layout.fragment_singer1, container, false)


        val items = mutableListOf<String>()
        items.add("1")
        items.add("노래2")
        items.add("노래3")

        items.add("노래1")
        items.add("노래2")
        items.add("노래3")

//        view.findViewById<ImageView>(R.id.image1).setOnClickListener {
//
//        }
// 위에처럼 작성할 수도 있고, 아래 형태로 작성할 수도 있다.

        //아래에 view는 fragment_singer1.xml을 뜻한다.
        // 아래 rv 변수는 fragment_singer1.xml 안에 있는 singRV를 의미한다.
        val rv = view.findViewById<RecyclerView>(R.id.singRV)
        val rvAdapter = RVAdapter(items)


        //rv 어뎁터를 연결해준다.
        rv.adapter = rvAdapter
        rv.layoutManager = LinearLayoutManager(context)


        //2번 이미지 클릭했을 때 2번 fragment로 moving
        val image2 = view.findViewById<ImageView>(R.id.image2)
        image2.setOnClickListener {
            it.findNavController().navigate(R.id.action_singer1Fragment_to_singer2Fragment)
        }

        //3번 이미지 클릭했을 때 3번 fragment로 moving
        val image3 = view.findViewById<ImageView>(R.id.image3)
        image3.setOnClickListener {
            it.findNavController().navigate(R.id.action_singer1Fragment_to_singer3Fragment)

        }

        return view

    }


}