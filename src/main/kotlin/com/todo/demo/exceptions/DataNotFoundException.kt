package com.todo.demo.exceptions

class DataNotFoundException : Exception {
    constructor(): super() {}
    constructor(message: String) : super(message){}

}