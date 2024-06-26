package com.vendingmachine.api.updateJuice.post.data

data class UpdateJuicePostDBParam(
    val columnNumber: Int,
    val juiceName: String,
    val juiceImage: String,
    val price: Int,
    val temperatureDisplay: String,
    val stock: Int,
)
