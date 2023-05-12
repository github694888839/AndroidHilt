package com.zhou.androidhilt

import javax.inject.Inject

class UserRepository @Inject constructor() {

    fun getUser() = User()

}