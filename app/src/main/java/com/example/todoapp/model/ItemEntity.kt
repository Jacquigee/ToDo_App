package com.example.todoapp.model

import androidx.room.Entity

/**
 * PROJECT NAME: ToDo App
 * USER        : jacqui
 * EMAIL       : gitaujaquiline@gmail.com
 * DATE        : Jun, 6/28/23
 * TIME        : 10:35 AM
 */

@Entity(tableName = "item_entity")
data class ItemEntity(
    val id: String = "",
    val title: String = "",
    val description: String? = null,
    val priority : Int = 0,
    val createdAt: Long = 0L,
    val categoryId: String = ""
)
