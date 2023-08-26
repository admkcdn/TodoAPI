package com.todo.demo.repository

import com.todo.demo.models.Todo
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface TodoRepository: JpaRepository<Todo, Long> {
}