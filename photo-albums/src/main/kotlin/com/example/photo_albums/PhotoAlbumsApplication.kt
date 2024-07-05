package com.example.photoalbums

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.cloud.openfeign.EnableFeignClients

@SpringBootApplication
@EnableFeignClients
class PhotoAlbumsApplication

fun main(args: Array<String>) {
    runApplication<PhotoAlbumsApplication>(*args)
}
