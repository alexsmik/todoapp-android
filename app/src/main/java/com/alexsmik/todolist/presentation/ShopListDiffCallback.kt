package com.alexsmik.todolist.presentation

import androidx.recyclerview.widget.DiffUtil
import com.alexsmik.todolist.domain.ShopItem

class ShopListDiffCallback (
    private val oldList: List<ShopItem>,
    private val newList: List<ShopItem>,
): DiffUtil.Callback() {
    override fun getOldListSize(): Int {
        TODO( )
    }

    override fun getNewListSize(): Int {
        TODO( )
    }

    override fun areItemsTheSame(oldItemPosition: Int, newItemPosition: Int): Boolean {
        TODO( )
    }

    override fun areContentsTheSame(oldItemPosition: Int, newItemPosition: Int): Boolean {
        TODO( )
    }
}