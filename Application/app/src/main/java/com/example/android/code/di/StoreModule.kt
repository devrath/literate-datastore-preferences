package com.example.android.code.di

import com.example.android.code.data.prefsStore.PrefsStore
import com.example.android.code.data.prefsStore.PrefsStoreImpl
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
abstract class StoreModule {

 @Binds
  abstract fun bindPrefsStore(prefsStoreImpl: PrefsStoreImpl): PrefsStore

}