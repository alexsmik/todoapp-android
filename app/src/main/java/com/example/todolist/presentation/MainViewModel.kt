package com.example.todolist.presentation

import androidx.lifecycle.ViewModel
import com.example.todolist.data.ShopListRepositoryImpl
import com.example.todolist.domain.GetShopListUseCase
import com.example.todolist.domain.DeleteShopItemUseCase
import com.example.todolist.domain.EditShopItemUseCase

class MainViewModel : ViewModel() {
    private val repository = ShopListRepositoryImpl
    private val getShopListUseCase = GetShopListUseCase(repository)
    private val deleteShopItemUseCase = DeleteShopItemUseCase(repository)
    private val editShopItemUseCase = EditShopItemUseCase(repository)

}