package com.vendingmachine.api.registerSalesData.post

import com.vendingmachine.api.registerSalesData.post.data.RegisterSalesDataPostRequest
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RestController

@RestController
class RegisterSalesDataPostController(val service: RegisterSalesDataPostService) {
  @PostMapping("/registerSalesData")
  fun registerSalesDataPOST(
      @RequestBody req: RegisterSalesDataPostRequest,
  ) {
    println("request body: $req")
    return service.execute(req)
  }
}
