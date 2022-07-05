package com.example.todolist.domain

class GetItemUseCase(private val itemListRepository: ItemListRepository) {
    fun getItem(itemId: Int): Item {
        return itemListRepository.getItem(itemId)
    }
}