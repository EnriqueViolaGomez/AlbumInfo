package ayds.jk2.albuminfo.external.discogs

interface ExternalService {
    fun getAlbum(song: DiscogsSong): DiscogsAlbum
}