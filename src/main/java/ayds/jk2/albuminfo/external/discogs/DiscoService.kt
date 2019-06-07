package ayds.jk2.albuminfo.external.discogs

import retrofit2.Response
import java.io.IOException

internal class DiscoService (private val albumResolver: AlbumResolver, private val discoGSAPI: DiscoGSAPI): ExternalService {

    override fun getAlbum(song: DiscogsSong): DiscogsAlbum {
        val callResponse: Response<String>
        try {
            callResponse = discoGSAPI.getAlbumInfo(song.albumName, song.artistName).execute()
            return this.albumResolver.getAlbumFromExternalData(callResponse.body().toString())
        } catch (e1: IOException) {
            e1.printStackTrace()
        }
        throw Exception("Error")
    }
}