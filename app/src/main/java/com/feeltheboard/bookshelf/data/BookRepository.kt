package com.feeltheboard.bookshelf.data

import com.feeltheboard.bookshelf.network.BooksApi
import com.feeltheboard.bookshelf.network.model.Books

interface BooksRepository {
    suspend fun getBooks(): Books
}

class NetworkBooksRepository(
    private val booksApi: BooksApi
): BooksRepository {
    override suspend fun getBooks(): Books {
        return booksApi.getBooks()
    }
}