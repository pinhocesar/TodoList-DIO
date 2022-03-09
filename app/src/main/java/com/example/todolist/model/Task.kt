package com.example.todolist.model

data class Task(
    val title: String,
    val date: String,
    val time: String,
    val id: Int = 0
)
