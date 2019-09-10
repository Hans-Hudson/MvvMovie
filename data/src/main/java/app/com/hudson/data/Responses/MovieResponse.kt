package app.com.hudson.data.Responses

import com.google.gson.annotations.SerializedName

data class MovieResponse(
    @SerializedName("Title") val title: String
)