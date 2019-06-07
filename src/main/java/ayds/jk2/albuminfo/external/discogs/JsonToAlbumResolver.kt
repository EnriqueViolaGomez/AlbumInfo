package ayds.jk2.albuminfo.external.discogs

import com.google.gson.Gson
import com.google.gson.JsonArray
import com.google.gson.JsonElement
import com.google.gson.JsonObject

internal class JsonToAlbumResolver: AlbumResolver {

    override fun getAlbumFromExternalData(serviceData: String): DiscogsAlbum {
        val gson = Gson()
        val jsonObject: JsonObject = gson.fromJson(serviceData, JsonObject::class.java)
        val results: JsonArray = jsonObject.get("results").asJsonArray
        val first: JsonObject = results.get(0).asJsonObject

        val jsonTitle: JsonElement = first.get("title")
        val jsonYear: JsonElement = first.get("year")
        val jsonCoverImage: JsonElement = first.get("cover_image")

        val albumTitle = jsonTitle.asString
        val albumYear = jsonYear.asString
        val albumCoverImage: String = jsonCoverImage.asString

        return DiscogsAlbum(albumTitle, albumYear, albumCoverImage)
    }
}