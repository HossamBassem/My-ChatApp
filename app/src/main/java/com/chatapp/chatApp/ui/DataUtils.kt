package com.chatapp.chatApp.ui

import com.chatapp.database.model.AppUser
import com.google.firebase.firestore.auth.User

object DataUtils {
    var user: AppUser? = null
    var firebaseUser: User? = null
}