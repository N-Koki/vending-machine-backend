package com.vendingmachine.api.getjuiceList.get

import com.vendingmachine.api.getjuiceList.get.data.JuiceListGetResponse
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class JuiceListGetController(val service: JuiceListGetService) {
  @GetMapping("getJuiceList")
  fun juiceListGET(): JuiceListGetResponse {
    return service.execute()
  }
}
