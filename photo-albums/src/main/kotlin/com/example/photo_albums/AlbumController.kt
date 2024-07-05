package com.example.photoalbums

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RestController

@RestController
class AlbumController(val albumService: AlbumService) {

    @GetMapping("/")
    fun home(): String {
        return "Photo Albums API"
    }

    @GetMapping("/albums")
    fun getAlbums(): List<Album> {
        return albumService.getAllAlbums()
    }

    @GetMapping("/albums/{albumId}/photos")
    fun getPhotos(@PathVariable albumId: Int): List<Photo> {
        return albumService.getPhotosByAlbumId(albumId)
    }
}





