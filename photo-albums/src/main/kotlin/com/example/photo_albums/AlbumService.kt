package com.example.photoalbums

import org.springframework.stereotype.Service

@Service
class AlbumService(val jsonPlaceholderClient: JsonPlaceholderClient) {

    fun getAllAlbums(): List<Album> {
        return jsonPlaceholderClient.getAlbums()
    }

    fun getPhotosByAlbumId(albumId: Int): List<Photo> {
        return jsonPlaceholderClient.getPhotos().filter { it.albumId == albumId }
    }
}
