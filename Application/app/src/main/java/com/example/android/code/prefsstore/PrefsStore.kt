package com.example.android.code.prefsstore

import kotlinx.coroutines.flow.Flow

interface PrefsStore {
    fun isNightMode(): Flow<Any>
    suspend fun toogleNightMode()
}