package com.example.todoapp.arch

import com.example.todoapp.database.AppDatabase
import com.example.todoapp.database.entity.ItemEntity

/**
 * PROJECT NAME: ToDo App
 * USER        : jacqui
 * EMAIL       : gitaujaquiline@gmail.com
 * DATE        : Jul, 7/2/23
 * TIME        : 8:24 PM
 */
class ToBuyRepository(
    private val appDatabase: AppDatabase
) {

    fun insertItem(itemEntity: ItemEntity){
        appDatabase.itemEntityDao().insertAll(itemEntity)
    }
    fun deleteItem(itemEntity: ItemEntity){
        appDatabase.itemEntityDao().delete(itemEntity)
    }
    fun getAllItems() : List<ItemEntity>{
       return appDatabase.itemEntityDao().getAll()
    }
}