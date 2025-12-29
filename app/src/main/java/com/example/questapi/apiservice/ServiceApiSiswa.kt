package com.example.questapi.apiservice

import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.PUT
import retrofit2.http.Query

interface ServiceApiSiswa {

    @GET("siswa.php")
    suspend fun getSiswa(): ResponseSiswa

    @GET("siswa.php")
    suspend fun getSatuSiswa(
        @Query("id") id: Int
    ): ResponseSatuSiswa

    @POST("siswa.php")
    suspend fun postSiswa(
        @Body data: DataSiswa
    ): retrofit2.Response<Void>

    @PUT("siswa.php")
    suspend fun editSatuSiswa(
        @Query("id") id: Int,
        @Body data: DataSiswa
    ): retrofit2.Response<Void>