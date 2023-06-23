package com.example.toko.Repository

import com.example.toko.Dao.TokoDao
import com.example.toko.model.Toko
import kotlinx.coroutines.flow.Flow

class TokoRepository(private val  tokoDao: TokoDao) {
    val AllTokos: Flow<List<Toko>> = tokoDao.getAllToko()
    suspend fun insertToko(toko: Toko){
        tokoDao.InsertToko(toko)
    }
    suspend fun DeleteToko(toko: Toko){
        tokoDao.DeleteToko(toko)
    }
    suspend fun UpdateToko(toko: Toko){
        tokoDao.UpdateToko(toko)
    }
}