package com.alexsmik.todolist.presentation

import androidx.lifecycle.ViewModel
import com.alexsmik.todolist.data.ShopListRepositoryImpl
import com.alexsmik.todolist.domain.AddShopItemUseCase
import com.alexsmik.todolist.domain.EditShopItemUseCase
import com.alexsmik.todolist.domain.GetShopItemUseCase
import com.alexsmik.todolist.domain.ShopItem

class ShopItemViewModel: ViewModel() {

    private val repository = ShopListRepositoryImpl

    private val  getShopItemUseCase = GetShopItemUseCase(repository)
    private val addShopItemUseCase = AddShopItemUseCase(repository)
    private val editShopItemUseCase = EditShopItemUseCase(repository)

    fun getShopItem(shopItemId: Int) {
        val item = getShopItemUseCase.getShopItem(shopItemId)
    }
    fun addShopItem(inputName: String?, inputCount: String?) {
        val name = parseName(inputName)
        addShopItemUseCase.addShopItem(shopItem)
    }
    fun editShopItem(shopItem: ShopItem) {
        editShopItemUseCase.editShopItem(shopItem)
    }
    private fun parseName(inputName: String?): String {
        return inputName?.trim() ?: ""
    }
}