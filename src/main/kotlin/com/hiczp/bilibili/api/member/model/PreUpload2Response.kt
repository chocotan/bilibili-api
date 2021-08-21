package com.hiczp.bilibili.api.member.model

import com.google.gson.annotations.SerializedName

data class PreUpload2Response(
    @SerializedName("OK")
    var OK: Int, // 0
    @SerializedName("complete")
    var complete: String,
    @SerializedName("filename")
    var filename: String,
    @SerializedName("url")
    var url:String
)