package com.example.todoapp.database

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.example.todoapp.database.dao.ItemEntityDao
import com.example.todoapp.database.entity.ItemEntity

/**
 * PROJECT NAME: ToDo App
 * USER        : jacqui
 * EMAIL       : gitaujaquiline@gmail.com
 * DATE        : Jun, 6/28/23
 * TIME        : 10:49 AM
 */

@Database(entities = [ItemEntity::class], version = 1)
abstract class AppDatabase : RoomDatabase(){
  companion object{
    private var appDatabase: AppDatabase? = null

    fun getDatabase(context: Context) : AppDatabase {
      if(appDatabase != null){
        return appDatabase!!
      }
      appDatabase = Room.databaseBuilder(
        context.applicationContext,
        AppDatabase::class.java, "to-do-database"
      ).build()
      return appDatabase!!
    }
  }
  abstract fun itemEntityDao(): ItemEntityDao
}