package com.example.questapi.apiservice

import kotlinx.serialization.Serializable

@Serializable
data class ResponseSatuSiswa(
    val success: Boolean,
    val data: DataSiswa
)
