package com.geeks.myapplication

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class Cakes(val image: String, val name: String, val desc: String, val price: String) :
    Parcelable

// toString
// hashCode
// copy
// componentN
// equals
// constructor
// getters setters

