package com.vendingmachine.api.getSalesDataList.get

import com.vendingmachine.api.getSalesDataList.get.data.SalesDataGetDBResult
import com.vendingmachine.api.getSalesDataList.get.data.SalesDataListGetResponse
import org.springframework.stereotype.Service

@Service
class SalesDataListGetService(val mapper: SalesDataListGetDBRepository) {
  fun execute(): SalesDataListGetResponse {
    val salesDataList = readSalesDataList()

    return convertToResponse(salesDataList)
  }

  fun readSalesDataList(): List<SalesDataGetDBResult> {
    return mapper.getSalesDataList()
  }

  fun convertToResponse(
      salesDataList: List<SalesDataGetDBResult>,
  ): SalesDataListGetResponse {
    return SalesDataListGetResponse(salesDataList)
  }
}
