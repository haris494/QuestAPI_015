package com.example.databaseapplication.ui.Viewmodel


import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.viewmodel.CreationExtras
import androidx.lifecycle.viewmodel.InitializerViewModelFactoryBuilder
import androidx.lifecycle.viewmodel.initializer
import androidx.lifecycle.viewmodel.viewModelFactory
import com.example.databaseapplication.repository.MahasiswaRepository

private val Any.mahasiswaRepository: MahasiswaRepository
    get() {
        TODO("Not yet implemented")
    }
private val Any.container: Any
    get() {
        TODO("Not yet implemented")
    }

object PenyediaViewModel {
    val Factory = viewModelFactory {
        initializer { creationExtras ->
            val repository = creationExtras.aplikasiKontak().container.mahasiswaRepository
            HomeViewModel(repository)
        }
        initializer { creationExtras ->
            val repository = creationExtras.aplikasiKontak().container.mahasiswaRepository
            InsertViewModel(repository)
        }
    }



    private fun initializer(initializer: (CreationExtras, Any?) -> InsertViewModel) {
        TODO("Not yet implemented")
    }
}

private fun InitializerViewModelFactoryBuilder.initializer(initializer: CreationExtras.(Any?) -> InsertViewModel) {
    TODO("Not yet implemented")
}

private fun Any?.aplikasiKontak(): Any {
    TODO("Not yet implemented")
}

fun CreationExtras.aplikasiKontak(): MahasiswaApplications {
    return this[ViewModelProvider.AndroidViewModelFactory.APPLICATION_KEY] as MahasiswaApplications
}

class MahasiswaApplications{

}