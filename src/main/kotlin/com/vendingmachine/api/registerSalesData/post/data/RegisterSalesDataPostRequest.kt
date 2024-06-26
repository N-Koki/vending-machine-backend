package com.vendingmachine.api.registerSalesData.post.data

data class RegisterSalesDataPostRequest(
    val columnNumber: Int,
    val salesJuiceName: String,
    val salesPrice: Int,
)
