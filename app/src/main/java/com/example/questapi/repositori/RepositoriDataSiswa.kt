package com.example.questapi.repositori

import com.example.questapi.apiservice.ResponseAksi
import com.example.questapi.apiservice.ServiceApiSiswa
import com.example.questapi.modeldata.DataSiswa

interface RepositoryDataSiswa {

    suspend fun getDataSiswa(): List<DataSiswa>

    suspend fun getSatuSiswa(id: Int): DataSiswa

    suspend fun postDataSiswa(dataSiswa: DataSiswa): ResponseAksi

    suspend fun editSatuSiswa(id: Int, dataSiswa: DataSiswa): ResponseAksi

    suspend fun hapusSatuSiswa(id: Int): ResponseAksi
}


class JaringanRepositoryDataSiswa(
    private val serviceApiSiswa: ServiceApiSiswa
) : RepositoryDataSiswa {

    override suspend fun getDataSiswa(): List<DataSiswa> =
        serviceApiSiswa.getSiswa().data

    override suspend fun getSatuSiswa(id: Int): DataSiswa =
        serviceApiSiswa.getSatuSiswa(id).data

    override suspend fun postDataSiswa(dataSiswa: DataSiswa): ResponseAksi =
        serviceApiSiswa.postSiswa(dataSiswa)

    override suspend fun editSatuSiswa(
        id: Int,
        dataSiswa: DataSiswa
    ): ResponseAksi =
        serviceApiSiswa.editSatuSiswa(id, dataSiswa)

    override suspend fun hapusSatuSiswa(id: Int): ResponseAksi =
        serviceApiSiswa.hapusSatuSiswa(id)
}
