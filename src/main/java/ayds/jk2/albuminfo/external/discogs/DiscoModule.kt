package ayds.jk2.albuminfo.external.discogs

import retrofit2.Retrofit
import retrofit2.converter.scalars.ScalarsConverterFactory


object DiscoModule {
    val externalService: ExternalService = DiscoService(JsonToAlbumResolver(), createDiscoGSAPI())

    private fun createDiscoGSAPI(): DiscoGSAPI{
        val retrofit = Retrofit.Builder()
                .baseUrl("https://api.discogs.com/database/")
                .addConverterFactory(ScalarsConverterFactory.create())
                .build()
        return retrofit.create(DiscoGSAPI::class.java)
    }
}