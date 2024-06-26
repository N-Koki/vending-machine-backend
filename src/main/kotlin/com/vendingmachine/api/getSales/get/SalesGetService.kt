package com.vendingmachine.api.getSales.get

import com.vendingmachine.api.getSales.get.data.SalesGetDBResult
import com.vendingmachine.api.getSales.get.data.SalesGetResponse
import org.springframework.stereotype.Service

@Service
class SalesGetService(val mapper: SalesGetDBRepository) {
  fun execute(): SalesGetResponse {
    val sales = readSales()

    return convertToResponse(sales)
  }

  fun readSales(): SalesGetDBResult {
    return mapper.getSales()
  }

  fun convertToResponse(salesGetDBResult: SalesGetDBResult): SalesGetResponse {
    return SalesGetResponse(salesPriceSum = salesGetDBResult.salesPriceSum)
  }
}
