package com.example.todoapp.ui

import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import com.example.todoapp.arch.ToBuyViewModel
import com.example.todoapp.database.AppDatabase

/**
 * PROJECT NAME: ToDo App
 * USER        : jacqui
 * EMAIL       : gitaujaquiline@gmail.com
 * DATE        : Jul, 7/1/23
 * TIME        : 9:11 PM
 */
abstract class BaseFragment: Fragment() {

    protected val mainActivity: MainActivity
        get() = activity as MainActivity

    protected val appDatabase: AppDatabase
        get() = AppDatabase.getDatabase(requireActivity())

    protected val sharedViewModel: ToBuyViewModel by activityViewModels()
}