package com.vendingmachine.api.updateJuice.post

import com.vendingmachine.api.updateJuice.post.data.UpdateJuicePostDBParam
import com.vendingmachine.api.updateJuice.post.data.UpdateJuicePostRequest
import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional

@Service
class UpdateJuicePostService(val mapper: UpdateJuicePostDBRepository) {
  @Transactional(rollbackFor = [Throwable::class])
  fun execute(req: UpdateJuicePostRequest) {
    // リクエストのバリデーション
    validateRequest(req)

    // APIリクエストをDBに格納するためのモデルに変換
    val param = convertToParam(req)

    // DBにUPDATE処理
    writeJuice(param)

    return
  }

  fun validateRequest(req: UpdateJuicePostRequest) {
    // columnNumberが 1〜30の番号であることをチェック
  }

  fun convertToParam(req: UpdateJuicePostRequest): UpdateJuicePostDBParam {
    val columnNumber = req.columnNumber
    val juiceName = req.juiceName
    val juiceImage = req.juiceImage
    val price = req.price
    val temperatureDisplay = req.temperatureDisplay
    val stock = req.stock

    return UpdateJuicePostDBParam(
        columnNumber = columnNumber,
        juiceName = juiceName,
        juiceImage = juiceImage,
        price = price,
        temperatureDisplay = temperatureDisplay,
        stock = stock,
    )
  }

  fun writeJuice(model: UpdateJuicePostDBParam) {
    val result = mapper.updateJuice(model)
    if (result == 0) {
      // 対象のジュースが存在しないことをハンドリングする
    }
  }
}
