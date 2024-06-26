package com.vendingmachine.api.getSalesDataList.get

import com.vendingmachine.api.getSalesDataList.get.data.SalesDataGetDBResult
import org.apache.ibatis.annotations.Mapper

@Mapper
interface SalesDataListGetDBRepository {
  fun getSalesDataList(): List<SalesDataGetDBResult>
}
