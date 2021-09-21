package com.example.android.code.di

import com.example.android.code.prefsstore.PrefsStore
import com.example.android.code.prefsstore.PrefsStoreImpl
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
abstract class StoreModule {

//  @Binds
//  abstract fun bindProtoStore(protoStoreImpl: ProtoStoreImpl): ProtoStore

  @Binds
  abstract fun bindPrefsStore(prefsStoreImpl: PrefsStoreImpl): PrefsStore
}