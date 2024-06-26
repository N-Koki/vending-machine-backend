package com.vendingmachine.api.getSales.get

import com.vendingmachine.api.getSales.get.data.SalesGetResponse
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class SalesGetController(val service: SalesGetService) {
  @GetMapping("/getSales")
  fun salesGET(): SalesGetResponse {
    return service.execute()
  }
}
