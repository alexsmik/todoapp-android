package com.example.todolist.domain

interface ItemListRepository {
    fun addItem(item: Item)
    fun deleteItem(item: Item)
    fun editItem(item: Item)
    fun getItem(itemId: Int): Item
    fun getList(): List<Item>
}