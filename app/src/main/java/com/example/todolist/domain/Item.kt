package com.example.todolist.domain

data class Item (
    val id: Int,
    val name: String,
    val count: Int,
    val enabled: Boolean
)