package com.alexsmik.todolist.data

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.alexsmik.todolist.domain.ShopItem
import com.alexsmik.todolist.domain.ShopListRepository

object ShopListRepositoryImpl : ShopListRepository {

    private val shopListLD = MutableLiveData<List<ShopItem>>()
    private val shopList = mutableListOf<ShopItem>()
    private var autoIncrementId = 0

    init {
        for (i in 0 until 10) {
            val item = ShopItem("Name $i", i, true)
            addShopItem(item)
        }
    }

    override fun addShopItem(shopItem: ShopItem) {
        if (shopItem.id == ShopItem.UNDEFINED_ID) {
            shopItem.id = autoIncrementId++
        }
        shopList.add(shopItem)
        updateList()
    }

    override fun deleteShopItem(shopItem: ShopItem) {
        shopList.remove(shopItem)
        updateList()
    }

    override fun editShopItem(shopItem: ShopItem) {
        val oldImplement = getShopItem(shopItem.id)
        shopList.remove(oldImplement)
        addShopItem(shopItem)
    }

    override fun getShopItem(shopItemId: Int): ShopItem {
        return shopList.find{
            it.id == shopItemId
        } ?: throw RuntimeException("el with id $shopItemId not found")
    }

    override fun getShopList(): LiveData<List<ShopItem>> {
        return shopListLD
    }

    private fun updateList() {
        shopListLD.value = shopList.toList()
    }

}