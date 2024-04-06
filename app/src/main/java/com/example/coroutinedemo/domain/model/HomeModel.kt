package com.example.coroutinedemo.domain.model

import com.google.gson.annotations.SerializedName
import java.io.Serializable

data class HomeModel(
    var code: Int = 0,
    var status: Boolean = false,
    var message: String? = null,
    var data: Data? = null
) : Serializable {

    data class Data(
        @SerializedName("image_url")
        var imageUrl: String? = null,
        var categories: List<Categories>? = null,
        var tab_categories: List<Categories>? = null,
        var trendingDesign: List<TrendingDesign>? = null,
        var newDesign: List<NewDesign>? = null,
        var bodyparts: List<BodyPart>? = null
    ) : Serializable

    data class Categories(
        var id: String? = null,
        var title: String? = null,
        var banner: String? = null
    ) : Serializable

    data class TrendingDesign(
        var id: String? = null,
        var title: String? = null,
        @SerializedName("feature_photo")
        var featurePhoto: String? = null,
        var photos: List<Photos>? = null
    ) : Serializable

    data class NewDesign(
        var id: String? = null,
        var title: String? = null,
        @SerializedName("feature_photo")
        var featurePhoto: String? = null,
        var photos: List<Photos>? = null
    ) : Serializable

    data class Photos(
        var image: String? = null,
        @SerializedName("is_primary")
        var isPrimary: String? = null
    ) : Serializable

    data class BodyPart(
        var id: String? = null,
        var title: String? = null,
        var img: String? = null
    ) : Serializable
}
