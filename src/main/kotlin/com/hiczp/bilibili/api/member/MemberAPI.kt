package com.hiczp.bilibili.api.member

import com.hiczp.bilibili.api.member.model.Pre
import com.hiczp.bilibili.api.member.model.PreUpload2Response
import com.hiczp.bilibili.api.member.model.PreUploadResponse
import com.hiczp.bilibili.api.passport.model.GetKeyResponse
import kotlinx.coroutines.Deferred
import okhttp3.MultipartBody
import retrofit2.http.*

/**
 * 创作中心
 */
@Suppress("DeferredIsResult")
interface MemberAPI {
    /**
     * 刚登陆时会访问该 API, 使用返回的 url 来创建一个指向一系列 H5 页面的 ListView
     * 侧拉抽屉 -> 创作中心 -> 更多功能
     */
    @GET("/x/app/pre")
    fun pre(): Deferred<Pre>


    @GET("/preupload?r=probe")
    fun preUpload(
    ): Deferred<PreUploadResponse>


    @GET("/preupload")
    fun preUpload2(
        @Query("profile") profile: String,
        @Query("mid") mid: String
    ): Deferred<PreUpload2Response>


    @Multipart
    @POST
    fun uploadFile(
        @Url url: String,
        @Header("PHPSESSID") fileName: String,
        @Part("version") version: String,
        @Part("filesize") filesize: String,
        @Part("chunk") chunk: String,
        @Part("chunks") chunks: String,
        @Part("md5") md5: String,
        @Part("file") file: ByteArray
    ): Deferred<String>

    @POST("/x/vu/client/add")
    fun publish(
        @Query("access_key") accessToken: String,
        @Query("sign") sign: String,
        @Body body: Map<String, @JvmSuppressWildcards Any>
    ): Deferred<Map<String, @JvmSuppressWildcards Any>>
}
