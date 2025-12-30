package com.example.questapi.apiservice

import com.example.questapi.modeldata.DataSiswa
import retrofit2.http.*

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
    ): ResponseAksi

    @PUT("siswa.php")
    suspend fun editSatuSiswa(
        @Query("id") id: Int,
        @Body data: DataSiswa
    ): ResponseAksi

    @DELETE("siswa.php")
    suspend fun hapusSatuSiswa(
        @Query("id") id: Int
    ): ResponseAksi
}
