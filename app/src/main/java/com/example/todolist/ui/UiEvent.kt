package com.example.todolist.ui

import com.example.todolist.navigation.AddEditRoute

sealed interface UiEvent {
    data class showSnackbar(val message: String) : UiEvent
    data object NavigateBack : UiEvent
    data class Navigate< T:Any >(val route: T) : UiEvent
}