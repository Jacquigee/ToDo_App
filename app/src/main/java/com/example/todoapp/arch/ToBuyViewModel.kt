package com.example.todoapp.arch

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.todoapp.database.AppDatabase
import com.example.todoapp.database.entity.ItemEntity

/**
 * PROJECT NAME: ToDo App
 * USER        : jacqui
 * EMAIL       : gitaujaquiline@gmail.com
 * DATE        : Jul, 7/2/23
 * TIME        : 8:25 PM
 */
class ToBuyViewModel : ViewModel() {
    private lateinit var repository: ToBuyRepository

    val itemEntitiesLiveData = MutableLiveData<List<ItemEntity>>()

    fun init(appDatabase: AppDatabase) {
        repository = ToBuyRepository(appDatabase)

        val items = repository.getAllItems()
        itemEntitiesLiveData.postValue(items)

    }

    fun insertItem(itemEntity: ItemEntity){
        repository.insertItem(itemEntity)
    }
    fun deleteItem(itemEntity: ItemEntity){
        repository.deleteItem(itemEntity)
    }
}