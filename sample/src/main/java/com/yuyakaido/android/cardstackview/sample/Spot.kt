package com.yuyakaido.android.cardstackview.sample

data class Spot(
        val id: Long = counter++,
        val name: String,
        val address: String,
        val url: String,
        val longlat: String? = "",
        val types: List<SpotType>? = emptyList()
) {
    companion object {
        private var counter = 0L
    }
}
