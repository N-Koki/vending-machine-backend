package com.vendingmachine.api.getjuiceList.get.data

import com.fasterxml.jackson.annotation.JsonInclude

// レスポンスを表すクラスには @JsonInclude(JsonInclude.Include.NON_NULL)
@JsonInclude(JsonInclude.Include.NON_NULL)
data class JuiceListGetResponse(
    val juiceList: List<JuiceGetDBResult>?,
)
