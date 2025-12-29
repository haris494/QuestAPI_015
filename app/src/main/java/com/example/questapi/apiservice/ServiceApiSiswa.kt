package com.example.questapi.apiservice

import retrofit2.http.GET

interface ServiceApiSiswa {

    @GET("siswa.php")
    suspend fun getSiswa(): ResponseSiswa