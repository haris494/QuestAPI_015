package com.example.databaseapplication.ui.Viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.databaseapplication.model.Mahasiswa
import com.example.databaseapplication.repository.MahasiswaRepository
import kotlinx.coroutines.launch

sealed class HomeUiState {
    object Loading : HomeUiState()
    data class Success(val mahasiswaList: List<Mahasiswa>) : HomeUiState()
    object Error : HomeUiState()
}



class HomeViewModel(private val repository: MahasiswaRepository) : ViewModel() {
    var uiState: HomeUiState = HomeUiState.Loading
        private set

    init {
        fetchMahasiswa()
    }



    fun fetchMahasiswa() {
        viewModelScope.launch {
            uiState = try {
                HomeUiState.Success(repository.getMahasiswa())
            } catch (e: Exception) {
                HomeUiState.Error
            }
        }
    }
}
