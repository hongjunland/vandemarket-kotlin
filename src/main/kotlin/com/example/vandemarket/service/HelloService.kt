package com.example.vandemarket.service

import com.example.vandemarket.domain.User
import org.springframework.stereotype.Service

@Service
class HelloService {
    fun hello(message: String): String{
        return "message: $message";
    }
    fun getUsers(): List<User>{
        val userList = ArrayList<User>();
        userList.add(User(1L, "user1", 23));
        userList.add(User(2L, "user2", 25));
        userList.add(User(3L, "user3", 24));
        return userList;
    }
}