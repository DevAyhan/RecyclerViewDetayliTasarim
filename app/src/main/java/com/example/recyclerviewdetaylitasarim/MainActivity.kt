package com.example.recyclerviewdetaylitasarim

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.StaggeredGridLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private lateinit var filmlerArrayList: ArrayList<Filmler>
    private lateinit var adapter: FilmlerAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        rv.setHasFixedSize(true)
        rv.layoutManager = StaggeredGridLayoutManager(2,StaggeredGridLayoutManager.VERTICAL)

        val f1 = Filmler(1,"Django","django2",12.99)
        val f2 = Filmler(2,"Buz Devri","buzdevri2",15.99)
        val f3 = Filmler(3,"Avengers","avengers2",18.99)
        val f4 = Filmler(4,"Inception","inception2",10.99)
        val f5 = Filmler(5,"Matrix","matrix2",5.99)
        val f6 = Filmler(6,"Toy Story","toystory2",22.99)

        filmlerArrayList = ArrayList<Filmler>()
        filmlerArrayList.add(f1)
        filmlerArrayList.add(f2)
        filmlerArrayList.add(f3)
        filmlerArrayList.add(f4)
        filmlerArrayList.add(f5)
        filmlerArrayList.add(f6)

        adapter = FilmlerAdapter(this,filmlerArrayList)
        rv.adapter = adapter


    }
}