package com.vendingmachine.api.getSalesDataList.get.data

import com.vendingmachine.framework.annotation.NoArgsConstructor
import java.time.LocalDateTime

@NoArgsConstructor
data class SalesDataGetDBResult(
    val salesId: Int,
    val columnNumber: Int,
    val salesJuiceName: String,
    val salesPrice: Int,
    val salesDateTime: LocalDateTime,
)
