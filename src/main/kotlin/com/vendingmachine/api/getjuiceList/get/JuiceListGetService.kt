package com.vendingmachine.api.getjuiceList.get

import com.vendingmachine.api.getjuiceList.get.data.JuiceGetDBResult
import com.vendingmachine.api.getjuiceList.get.data.JuiceListGetResponse
import org.springframework.stereotype.Service

@Service
class JuiceListGetService(val mapper: JuiceListGetDBRepository) {
  fun execute(): JuiceListGetResponse {
    val juiceList = readJuiceList()

    return convertToResponse(juiceList)
  }

  // DBの自動販売機コラムテーブルからジュースを取得
  fun readJuiceList(): List<JuiceGetDBResult> {
    return mapper.getJuiceList()
  }

  fun convertToResponse(
      juiceList: List<JuiceGetDBResult>,
  ): JuiceListGetResponse {
    return JuiceListGetResponse(juiceList)
  }
}
