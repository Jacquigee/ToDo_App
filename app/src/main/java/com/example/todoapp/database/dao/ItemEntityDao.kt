package com.example.todoapp.database.dao

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import com.example.todoapp.database.entity.ItemEntity

/**
 * PROJECT NAME: ToDo App
 * USER        : jacqui
 * EMAIL       : gitaujaquiline@gmail.com
 * DATE        : Jun, 6/28/23
 * TIME        : 10:41 AM
 */

@Dao
interface ItemEntityDao {
    @Query("SELECT * FROM item_entity")
    fun getAll(): List<ItemEntity>

    @Insert
    fun insertAll(itemEntity: ItemEntity)

    @Delete
    fun delete(itemEntity: ItemEntity)
}