package com.example.databaseapplication.repository

import com.example.databaseapplication.model.Mahasiswa


interface MahasiswaRepository {
    suspend fun getMahasiswa(): List<Mahasiswa>
    suspend fun insertMahasiswa(mahasiswa: Mahasiswa)
    suspend fun deleteMahasiswa(nim:String)
}