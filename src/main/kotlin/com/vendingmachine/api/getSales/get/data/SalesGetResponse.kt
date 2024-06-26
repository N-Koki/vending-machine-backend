package com.vendingmachine.api.getSales.get.data

import com.fasterxml.jackson.annotation.JsonInclude

// レスポンスを表すクラスには @JsonInclude(JsonInclude.Include.NON_NULL)
@JsonInclude(JsonInclude.Include.NON_NULL)
data class SalesGetResponse(
    val salesPriceSum: Int,
)
