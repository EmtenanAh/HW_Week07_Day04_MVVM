package com.twq.w7_day4_mvvm.network

import com.twq.w7_day4_mvvm.model.User
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

interface UserService {

   @GET("User")
   fun getUserByUsernameAndPassword(@Query("username")username:String,@Query("password")password:String):Call<List<User>>
    @GET("User")
    fun getAllUsers(): Call<List<User>>


    @GET("User/{id}")
    fun getSelectedUser(@Path("id")id:Int):Call<User>
}