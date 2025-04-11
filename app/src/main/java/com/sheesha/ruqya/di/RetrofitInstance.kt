package com.sheesha.ruqya.di

import com.sheesha.ruqya.data.api.QuranApiService
import com.sheesha.ruqya.repository.QuranRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton


@Module
@InstallIn(SingletonComponent::class)


    object RetrofitInstance {
        private const val BASE_URL = "https://quranapi.pages.dev/"


    @Provides
    @Singleton
    fun provideRetrofit() : Retrofit {
        return Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }

    @Provides
    @Singleton
    fun provideQuranApiService(retrofit: Retrofit): QuranApiService {
        return retrofit.create(QuranApiService::class.java)
    }



    @Provides
    @Singleton
    fun provideQuranRepository(apiService: QuranApiService): QuranRepository {
        return QuranRepository(apiService)
    }


    }



