package com.example.toko.Dao

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Update

import com.example.toko.model.Toko
import kotlinx.coroutines.flow.Flow

@Dao
interface TokoDao {
    @Query("SELECT * FROM Toko_table ORDER BY name ASC")
    fun getAllToko(): Flow<List<Toko>>

    @Insert
    suspend fun InsertToko(toko: Toko)

    @Delete
    suspend fun DeleteToko(toko: Toko)

    @Update fun UpdateToko(toko: Toko)


}