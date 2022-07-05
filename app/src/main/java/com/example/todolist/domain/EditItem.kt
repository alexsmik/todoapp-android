package com.example.todolist.domain

class EditItem(private val itemListRepository: ItemListRepository) {
    fun editItem(item: Item) {
        itemListRepository.editItem(item)
    }
}