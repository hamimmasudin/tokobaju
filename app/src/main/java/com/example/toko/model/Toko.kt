    package com.example.toko.`model`

import android.os.Parcelable
import androidx.room.Entity
import androidx.room.PrimaryKey
import kotlinx.parcelize.Parcelize
import java.util.jar.Attributes.Name
@Parcelize
@Entity(tableName = "Toko_table")
data class Toko (
    @PrimaryKey(autoGenerate = true)
    val id:Int = 0,
    val name: String,
    val harga: Int =0,
    val keterangan:String

    ): Parcelable