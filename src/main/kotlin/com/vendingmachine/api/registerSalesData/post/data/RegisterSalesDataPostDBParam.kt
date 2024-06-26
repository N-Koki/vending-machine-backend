package com.vendingmachine.api.registerSalesData.post.data

data class RegisterSalesDataPostDBParam(
    val columnNumber: Int,
    val salesJuiceName: String,
    val salesPrice: Int,
)
