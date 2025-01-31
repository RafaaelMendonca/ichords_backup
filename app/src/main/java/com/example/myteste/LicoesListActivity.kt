package com.example.myteste

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class LicoesListActivity: AppCompatActivity() {

    private lateinit var recyclerView: RecyclerView
    private lateinit var adapter: LessonsAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_licoes_list)

        recyclerView = findViewById(R.id.recyclerView)
        recyclerView.layoutManager = LinearLayoutManager(this)

        val lessons = listOf(
            Lesson(R.drawable.violao_icon, "Acordes I", "Básico", R.drawable.chord_coin, "+10"),
            Lesson(R.drawable.violao_icon, "Acordes II", "Básico", R.drawable.chord_coin, "+10"),
            Lesson(R.drawable.violao_icon, "Pestana", "Intermediário", R.drawable.chord_coin, "+20"),
            Lesson(R.drawable.violao_icon, "Dedilhado", "Avançado", R.drawable.chord_coin, "+30")

        )

        adapter = LessonsAdapter(lessons)
        recyclerView.adapter = adapter
    }
}