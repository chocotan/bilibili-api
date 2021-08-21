package com.hiczp.bilibili.api.member.model

import com.google.gson.annotations.SerializedName

data class PreUploadResponse(
    @SerializedName("OK")
    var OK: Int, // 0
    @SerializedName("lines")
    var lines: List<Data>,
    @SerializedName("probe")
    var probe: Probe
) {
    data class Data(
        @SerializedName("os")
        var os: String,
        @SerializedName("query")
        var query: String,
        @SerializedName("probe_url")
        var probeUrl: String
    )

    data class Probe(var post: Double)
}
