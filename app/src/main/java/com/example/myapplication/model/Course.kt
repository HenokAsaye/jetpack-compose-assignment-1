package com.example.myapplication.model

data class Course(
    val id: String,
    val title: String,
    val code: String,
    val credits: Int,
    val description: String,
    val prerequisites: String
)