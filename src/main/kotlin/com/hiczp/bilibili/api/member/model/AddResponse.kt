package com.hiczp.bilibili.api.member.model

class AddResponse(
    code: Int,
    message: String,
    ttl: Int,
    data: Data
) {

    class Data(
        aid: Long,
        bvid: String
    )
}