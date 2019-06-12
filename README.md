# AlbumInfo

Este módulo se comunica con la API para retornar un álbum a partir de una canción que lo identifica de forma unívoca
Para utilizarlo es necesario solicitarle al módulo externo una instancia de la interfaz (ExternalModule.externalService) y luego invocar el método getAlbum(song: Song). El método retorna un objeto de tipo DiscogsAlbum el cual tiene como atributos un nombre (title: String), año (year: String), y url de imagen (imageUrl: String).
