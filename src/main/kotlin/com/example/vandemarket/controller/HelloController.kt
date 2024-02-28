package com.example.vandemarket.controller

import com.example.vandemarket.service.HelloService
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class HelloController(private val helloService: HelloService) {
    @GetMapping
    fun hello() : ResponseEntity<String> {
        val message = "hello world!";
        return ResponseEntity.ok(helloService.hello(message));
    }
    @GetMapping("/users")
    fun getUsers() : ResponseEntity<Any> {
        return ResponseEntity.ok(helloService.getUsers());
    }
}