package com.feeltheboard.bookshelf.network

import com.feeltheboard.bookshelf.network.model.Books
import retrofit2.http.GET

interface BooksApi {
    @GET("v1/volumes?q=non-fiction/")
    suspend fun getBooks(): Books
}