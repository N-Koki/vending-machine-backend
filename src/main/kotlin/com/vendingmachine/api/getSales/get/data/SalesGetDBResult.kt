package com.vendingmachine.api.getSales.get.data

import com.vendingmachine.framework.annotation.NoArgsConstructor

@NoArgsConstructor
data class SalesGetDBResult(
    val salesPriceSum: Int,
)
