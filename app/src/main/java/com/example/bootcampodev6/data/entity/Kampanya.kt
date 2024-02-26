package com.example.bootcampodev6.data.entity

import androidx.annotation.DrawableRes
import java.io.Serializable

data class Kampanya(
    @DrawableRes var resim : Int,
    var button : String,
    var buttonGorunum : Boolean,
    var baslik : String,
    var aciklama : String
) : Serializable
