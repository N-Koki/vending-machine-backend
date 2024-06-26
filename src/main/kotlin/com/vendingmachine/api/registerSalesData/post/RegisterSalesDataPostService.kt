package com.vendingmachine.api.registerSalesData.post

import com.vendingmachine.api.registerSalesData.post.data.RegisterSalesDataPostDBParam
import com.vendingmachine.api.registerSalesData.post.data.RegisterSalesDataPostRequest
import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional

@Service
class RegisterSalesDataPostService(val mapper: RegisterSalesDataPostDBRepository) {
  @Transactional(rollbackFor = [Throwable::class])
  fun execute(req: RegisterSalesDataPostRequest) {
    // リクエストのバリデーション
    validateRequest(req)

    // APIリクエストをDBに格納するためのモデルに変換
    val param = convertToParam(req)

    // DBにINSERT処理
    writeJuice(param)

    return
  }

  fun validateRequest(req: RegisterSalesDataPostRequest) {
    // なにかバリデーションあれば記載
  }

  fun convertToParam(req: RegisterSalesDataPostRequest): RegisterSalesDataPostDBParam {
    val columnNumber = req.columnNumber
    val salesJuiceName = req.salesJuiceName
    val salesPrice = req.salesPrice

    return RegisterSalesDataPostDBParam(
        columnNumber = columnNumber,
        salesJuiceName = salesJuiceName,
        salesPrice = salesPrice,
    )
  }

  fun writeJuice(model: RegisterSalesDataPostDBParam) {
    val result = mapper.registerSalesData(model)
  }
}
