package com.example.todoapp

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.todoapp.dao.ItemEntityDao
import com.example.todoapp.model.ItemEntity

/**
 * PROJECT NAME: ToDo App
 * USER        : jacqui
 * EMAIL       : gitaujaquiline@gmail.com
 * DATE        : Jun, 6/28/23
 * TIME        : 10:49 AM
 */

@Database(entities = [ItemEntity::class], version = 1)
abstract class AppDatabase : RoomDatabase(){
  abstract fun itemEntityDao(): ItemEntityDao
}