package com.example.todolist.domain

class DeleteItem(private val itemListRepository: ItemListRepository) {
    fun deleteItem(item: Item) {
        itemListRepository.deleteItem(item)
    }
}