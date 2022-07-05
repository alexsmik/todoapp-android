package com.example.todolist.domain

class AddItemUseCase(private val itemListRepository: ItemListRepository){
    fun addItem(item: Item) {
        itemListRepository.addItem(item)
    }
}