package ayds.jk2.albuminfo.external.discogs


import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface DiscoGSAPI {

    @GET("search?type=master&country=us&per_page=100&page=1&token=oIMtIsUWyDBuxxzNSTxObtOHBYENSMJgTIKcRhYp")
    fun getAlbumInfo(@Query("q") album: String, @Query("artist") artist: String): Call<String>

}
