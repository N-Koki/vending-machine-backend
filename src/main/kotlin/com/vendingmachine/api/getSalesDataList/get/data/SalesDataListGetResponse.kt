package com.vendingmachine.api.getSalesDataList.get.data

import com.fasterxml.jackson.annotation.JsonInclude

// レスポンスを表すクラスには @JsonInclude(JsonInclude.Include.NON_NULL)
@JsonInclude(JsonInclude.Include.NON_NULL)
data class SalesDataListGetResponse(val salesDataList: List<SalesDataGetDBResult>)
