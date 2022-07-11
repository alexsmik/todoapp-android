package com.alexsmik.todolist.presentation

import androidx.recyclerview.widget.DiffUtil
import com.alexsmik.todolist.domain.ShopItem

class ShopListDiffCallback (
    private val oldList: List<ShopItem>,
    private val newList: List<ShopItem>,
): DiffUtil.Callback() {
    override fun getOldListSize(): Int {
        TODO("some here")
    }

    override fun getNewListSize(): Int {
        TODO("some here")
    }

    override fun areItemsTheSame(oldItemPosition: Int, newItemPosition: Int): Boolean {
        TODO("some here")
    }

    override fun areContentsTheSame(oldItemPosition: Int, newItemPosition: Int): Boolean {
        TODO("some here")
    }
}