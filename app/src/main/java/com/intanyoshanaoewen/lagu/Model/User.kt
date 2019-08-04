package com.intanyoshanaoewen.lagu.Model

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

import java.util.*

class User {
    @SerializedName("id")
    @Expose
    var id: String?,
    @SerializedName("name")
    @Expose
    var name: String?,
    @SerializedName("email")
    @Expose
    var email: String?,
    @SerializedName("photo")
    @Expose
    var photo: String?,
    @SerializedName("gender")
    @Expose
    var gender: String?,
    @SerializedName("type")
    @Expose
    var type: String?) {
        constr
        }
}