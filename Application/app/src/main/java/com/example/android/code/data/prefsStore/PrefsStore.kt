package com.example.android.code.data.prefsStore

import kotlinx.coroutines.flow.Flow

interface PrefsStore {
    // Get the live data of where its dark/light mode from cache preferences
    fun isNightMode(): Flow<Any>
    // Initiate the action of toggling
    suspend fun toogleNightMode()
}