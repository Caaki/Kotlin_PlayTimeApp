package com.example.cs330_oktobar2023v2.di

import android.app.Application
import androidx.room.Room
import com.example.cs330_oktobar2023v2.data.local_data.EvidenceDatabase
import com.example.cs330_oktobar2023v2.data.repository.EvidenceRepositoryImpl
import com.example.cs330_oktobar2023v2.domain.repository.EvidenceRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton


@Module
@InstallIn(SingletonComponent::class)
object AppModule {

    @Provides
    @Singleton
    fun providesEvidenceDatabase(app: Application): EvidenceDatabase {
        return Room.databaseBuilder(
            app, EvidenceDatabase::class.java,
            EvidenceDatabase.DATABASE_NAME
        ).build()
    }

    @Provides
    @Singleton
    fun providesEvidenceRepository(db: EvidenceDatabase) : EvidenceRepository{
        return EvidenceRepositoryImpl(db.dao)
    }

}