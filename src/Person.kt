package com.codexdroid

import kotlinx.serialization.Serializable

@Serializable
data class Person(
    var id : Int,
    var name : String,
    var email : String,
    var mobile : Long
)


// https://github.com/pwraxe/Android-in-Kotlin/commit/33b5e2bb2b93d93eb8c38bec1a672bf92f70fe75
// https://rahul9650ray.medium.com/how-to-implement-rest-api-in-android-using-retrofit-in-kotlin-part-2-56204aabce37