package com.vendingmachine.api.getjuiceList.get

import com.vendingmachine.api.getjuiceList.get.data.JuiceGetDBResult
import org.apache.ibatis.annotations.Mapper

@Mapper
interface JuiceListGetRepository {
  fun getJuiceList(): List<JuiceGetDBResult>
}
