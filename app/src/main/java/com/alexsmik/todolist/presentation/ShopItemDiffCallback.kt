package com.alexsmik.todolist.presentation

import androidx.recyclerview.widget.DiffUtil
import com.alexsmik.todolist.domain.ShopItem

class ShopItemDiffCallback: DiffUtil.ItemCallback<ShopItem>() {
    override fun areItemsTheSame(oldItem: ShopItem, newItem: ShopItem): Boolean {
        TODO("Not yet implemented")
    }

    override fun areContentsTheSame(oldItem: ShopItem, newItem: ShopItem): Boolean {
        TODO("Not yet implemented")
    }
}