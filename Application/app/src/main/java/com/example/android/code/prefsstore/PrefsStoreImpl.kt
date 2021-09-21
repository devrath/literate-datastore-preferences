package com.example.android.code.prefsstore

import android.content.Context
import androidx.datastore.core.DataStore
import androidx.datastore.preferences.core.*
import androidx.datastore.preferences.preferencesDataStore
import dagger.hilt.android.qualifiers.ApplicationContext
import kotlinx.coroutines.flow.catch
import kotlinx.coroutines.flow.map
import java.io.IOException
import javax.inject.Inject

private const val STORE_NAME = "learning_data_store"

class PrefsStoreImpl  @Inject constructor(
    @ApplicationContext val context: Context): PrefsStore{

    private val Context.dataStore: DataStore<Preferences> by preferencesDataStore(name = STORE_NAME)

    companion object {
        val NIGHT_MODE_KEY = booleanPreferencesKey(STORE_NAME)
    }

    override fun isNightMode() = context.dataStore.data.catch { exception ->
        if (exception is IOException){
            emit(emptyPreferences())
        }else{
            throw exception
        }
    }.map { it[NIGHT_MODE_KEY] ?: false }

    override suspend fun toogleNightMode() {
        context.dataStore.edit {
            it[NIGHT_MODE_KEY] = !(it[NIGHT_MODE_KEY] ?: false)
        }
    }

}