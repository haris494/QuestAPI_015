package com.example.questapi.apiservice

import kotlinx.serialization.Serializable

@Serializable
data class ResponseAksi(
    val success: Boolean,
    val message: String,
    val id: Int? = null
)
