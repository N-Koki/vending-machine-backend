package com.vendingmachine.api.getSalesDataList.get

import com.vendingmachine.api.getSalesDataList.get.data.SalesDataListGetResponse
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class SalesDataListGetController(val service: SalesDataListGetService) {
  @GetMapping("/getSalesDataList")
  fun salesDataListGET(): SalesDataListGetResponse {
    return service.execute()
  }
}
