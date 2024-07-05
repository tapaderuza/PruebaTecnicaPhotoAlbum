package com.example.photoalbums

import org.springframework.cloud.openfeign.FeignClient
import org.springframework.web.bind.annotation.GetMapping

@FeignClient(name = "jsonPlaceholderClient", url = "https://jsonplaceholder.typicode.com")
interface JsonPlaceholderClient {

    @GetMapping("/albums")
    fun getAlbums(): List<Album>

    @GetMapping("/photos")
    fun getPhotos(): List<Photo>
}
