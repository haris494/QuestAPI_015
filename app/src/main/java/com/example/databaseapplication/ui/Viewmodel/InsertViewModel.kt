package com.example.databaseapplication.ui.Viewmodel

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.databaseapplication.model.Mahasiswa
import com.example.databaseapplication.repository.MahasiswaRepository
import kotlinx.coroutines.launch

class InsertViewModel(private val repository: MahasiswaRepository) : ViewModel() {
    var uiState by mutableStateOf(InsertUiState())
        private set

    fun updateUiState(newState: InsertUiState) {
        uiState = newState
    }

    fun insertMahasiswa(
        nama: String,
        nim: String,
        alamat: String,
        jenisKelamin: String,
        kelas: String,
        angkatan: String
    ) {
        val mahasiswa = Mahasiswa(nim, nama, alamat, jenisKelamin, kelas, angkatan)
        viewModelScope.launch {
            try {
                repository.insertMahasiswa(mahasiswa)
            } catch (e: Exception) {
                e.printStackTrace()
            }
        }
    }
}


data class InsertUiState(
    val nama: String = "",
    val nim: String = "",
    val alamat: String = "",
    val jenisKelamin: String = "",
    val kelas: String = "",
    val angkatan:String =""
)