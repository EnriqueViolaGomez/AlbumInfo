package ayds.jk2.albuminfo.external.discogs

interface AlbumResolver {
    fun getAlbumFromExternalData(serviceData: String): DiscogsAlbum
}

