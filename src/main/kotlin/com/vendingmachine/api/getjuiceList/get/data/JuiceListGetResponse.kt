package com.vendingmachine.api.getjuiceList.get.data

import com.vendingmachine.framework.annotation.NoArgsConstructor

@NoArgsConstructor
data class JuiceListGetResponse(
    val juiceList: List<JuiceGetDBResult>?,
)
