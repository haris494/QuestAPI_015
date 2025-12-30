package com.example.questapi.viewmodel



import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import com.example.questapi.modeldata.DetailSiswa
import com.example.questapi.modeldata.UIStateSiswa
import com.example.questapi.modeldata.toDataSiswa
import com.example.questapi.repositori.RepositoryDataSiswa
import com.example.questapi.apiservice.ResponseAksi


class EntryViewModel(private val repositoryDataSiswa: RepositoryDataSiswa) :
    ViewModel() {
    var uiStateSiswa by mutableStateOf(UIStateSiswa())
        private set

    private fun validasiInput(uiState: DetailSiswa = uiStateSiswa.detailSiswa):
            Boolean {
        return with(uiState) {
            nama.isNotBlank() && alamat.isNotBlank() && telpon.isNotBlank()
        }
    }

    fun updateUiState(detailSiswa: DetailSiswa) {
        uiStateSiswa =
            UIStateSiswa(detailSiswa = detailSiswa, isEntryValid = validasiInput(detailSiswa))
    }

    suspend fun addSiswa() {
        if (validasiInput()) {

            val resp: ResponseAksi =
                repositoryDataSiswa.postDataSiswa(
                    uiStateSiswa.detailSiswa.toDataSiswa()
                )

            if (resp.success) {
                println("Tambah Sukses : ${resp.message}")
            } else {
                println("Tambah Gagal : ${resp.message}")
            }
        }
    }
}