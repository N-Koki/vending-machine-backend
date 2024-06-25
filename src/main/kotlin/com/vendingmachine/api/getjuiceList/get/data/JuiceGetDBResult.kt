package com.vendingmachine.api.getjuiceList.get.data

import com.vendingmachine.framework.annotation.NoArgsConstructor

@NoArgsConstructor
data class JuiceGetDBResult(
    val columnNumber: Int,
    val juiceName: String,
    val juiceImage: String,
    val price: Int,
    val temperatureDisplay: String,
    val stock: Int,
)
