package com.example.android.code.di

import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
abstract class StoreModule {

//  @Binds
//  abstract fun bindProtoStore(protoStoreImpl: ProtoStoreImpl): ProtoStore

//  @Binds
//  abstract fun bindPrefsStore(prefsStoreImpl: PrefsStoreImpl): PrefsStore
}