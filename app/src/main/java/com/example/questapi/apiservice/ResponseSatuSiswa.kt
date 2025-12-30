package com.example.questapi.apiservice

import com.example.questapi.modeldata.DataSiswa
import kotlinx.serialization.Serializable

@Serializable
data class ResponseSatuSiswa(
    val success: Boolean,
    val data: DataSiswa
)