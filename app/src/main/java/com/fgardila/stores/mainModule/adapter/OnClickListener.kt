package com.fgardila.stores.mainModule.adapter

import com.fgardila.stores.common.entities.StoreEntity

interface OnClickListener {
    fun onClick(storeId: Long)

    fun onFavoriteStore(storeEntity: StoreEntity)

    fun onDeleteStore(storeEntity: StoreEntity)
}