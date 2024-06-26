package com.vendingmachine.api.getjuiceList.get

import com.vendingmachine.api.getjuiceList.get.data.JuiceGetDBResult
import org.apache.ibatis.annotations.Mapper

@Mapper
interface JuiceListGetDBRepository {
  fun getJuiceList(): List<JuiceGetDBResult>
}
