package com.example.questapi.apiservice

import com.example.questapi.modeldata.DataSiswa
import kotlinx.serialization.Serializable

@Serializable
data class ResponseSiswa(
    val success: Boolean,
    val data: List<DataSiswa>
)