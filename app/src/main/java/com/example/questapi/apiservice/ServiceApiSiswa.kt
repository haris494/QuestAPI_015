package com.example.questapi.apiservice

import retrofit2.http.GET
import retrofit2.http.Query

interface ServiceApiSiswa {

    @GET("siswa.php")
    suspend fun getSiswa(): ResponseSiswa

    @GET("siswa.php")
    suspend fun getSatuSiswa(
        @Query("id") id: Int
    ): ResponseSatuSiswa