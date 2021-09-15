package com.fgardila.stores.common.utils

import com.fgardila.stores.common.entities.StoreEntity

interface MainAux {
    fun hideFab(isVisible: Boolean = false)

    fun addStore(storeEntity: StoreEntity)
    fun updateStore(storeEntity: StoreEntity)
}