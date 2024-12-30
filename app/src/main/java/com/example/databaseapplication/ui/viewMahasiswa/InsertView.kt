package com.example.databaseapplication.ui.viewMahasiswa

import androidx.compose.foundation.layout.*
import androidx.compose.material3.Button
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel


@Composable
fun <InsertViewModel> InsertView(
    viewModel: InsertViewModel = viewModel(),
    navigateBack: () -> Unit
) {
    var nama by remember { mutableStateOf("") }
    var nim by remember { mutableStateOf("") }
    var alamat by remember { mutableStateOf("") }
    var jenisKelamin by remember { mutableStateOf("") }
    var kelas by remember { mutableStateOf("") }
    var angkatan by remember { mutableStateOf("") }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        verticalArrangement = Arrangement.spacedBy(12.dp)
    ) {
        Text(text = "Insert Mahasiswa", modifier = Modifier.padding(8.dp))
        OutlinedTextField(
            value = nama,
            onValueChange = { nama = it },
            label = { Text("Nama") },
            modifier = Modifier.fillMaxWidth()
        )
        OutlinedTextField(
            value = nim,
            onValueChange = { nim = it },
            label = { Text("NIM") },
            modifier = Modifier.fillMaxWidth()
        )
        OutlinedTextField(
            value = alamat,
            onValueChange = { alamat = it },
            label = { Text("Alamat") },
            modifier = Modifier.fillMaxWidth()
        )
        OutlinedTextField(
            value = jenisKelamin,
            onValueChange = { jenisKelamin = it },
            label = { Text("Jenis Kelamin") },
            modifier = Modifier.fillMaxWidth()
        )
        OutlinedTextField(
            value = kelas,
            onValueChange = { kelas = it },
            label = { Text("Kelas") },
            modifier = Modifier.fillMaxWidth()
        )
        OutlinedTextField(
            value = angkatan,
            onValueChange = { angkatan = it },
            label = { Text("Angkatan") },
            modifier = Modifier.fillMaxWidth()
        )
        Button(
            onClick = {
                viewModel.insertMahasiswa(
                    nama = nama,
                    nim = nim,
                    alamat = alamat,
                    jenisKelamin = jenisKelamin,
                    kelas = kelas,
                    angkatan = angkatan
                )
                navigateBack()
            },
            modifier = Modifier.fillMaxWidth()
        ) {
            Text("Simpan")
        }
    }
}


private fun Any?.insertMahasiswa(
    nama: String,
    nim: String,
    alamat: String,
    jenisKelamin: String,
    kelas: String,
    angkatan: String
) {
    TODO("Not yet implemented")
}