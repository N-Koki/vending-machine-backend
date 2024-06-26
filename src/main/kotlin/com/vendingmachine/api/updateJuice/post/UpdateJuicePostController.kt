package com.vendingmachine.api.updateJuice.post

import com.vendingmachine.api.updateJuice.post.data.UpdateJuicePostRequest
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RestController

@RestController
class UpdateJuicePostController(val service: UpdateJuicePostService) {
  @PostMapping("/updateJuice")
  fun updateJuicePOST(
      @RequestBody req: UpdateJuicePostRequest,
  ) {
    println("request body: $req")
    return service.execute(req)
  }
}
