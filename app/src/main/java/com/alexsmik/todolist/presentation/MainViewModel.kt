package com.alexsmik.todolist.presentation

import androidx.lifecycle.ViewModel
import com.alexsmik.todolist.data.ShopListRepositoryImpl
import com.alexsmik.todolist.domain.GetShopListUseCase
import com.alexsmik.todolist.domain.DeleteShopItemUseCase
import com.alexsmik.todolist.domain.EditShopItemUseCase
import com.alexsmik.todolist.domain.ShopItem

class MainViewModel : ViewModel() {

    private val repository = ShopListRepositoryImpl

    private val getShopListUseCase = GetShopListUseCase(repository)
    private val deleteShopItemUseCase = DeleteShopItemUseCase(repository)
    private val editShopItemUseCase = EditShopItemUseCase(repository)

    val shopList = getShopListUseCase.getShopList()

    fun deleteShopItem(shopItem: ShopItem) {
        deleteShopItemUseCase.deleteShopItem(shopItem)
    }
    fun changeEnableState(shopItem: ShopItem) {
        val newItem = shopItem.copy(enabled = !shopItem.enabled)
        editShopItemUseCase.editShopItem(newItem)
    }
}