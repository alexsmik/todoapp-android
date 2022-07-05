package com.example.todolist.domain

class GetListUseCase(private val itemListRepository: ItemListRepository) {
    fun getList(): List<Item> {
        return itemListRepository.getList()
    }
}