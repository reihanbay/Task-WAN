package com.task.destinationapps.model

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class TourModel(
    var pict : String = "",
    var name : String = "",
    var detail : String = "",
    var price : Int = 0,
    var durasi: String = "",
    var range: Double = 0.0,
    var place: String = "",
    var category: Char = 'A',
) : Parcelable