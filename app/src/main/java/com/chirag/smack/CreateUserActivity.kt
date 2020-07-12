package com.chirag.smack

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity

class CreateUserActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_create_user)
    }

    fun generateUserAvatar(view: View) {}
    fun generateColorClicked(view: View) {}
    fun createUserClicked(view: View) {}
}