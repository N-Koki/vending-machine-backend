package com.vendingmachine.api.getSales.get

import com.vendingmachine.api.getSales.get.data.SalesGetDBResult
import org.apache.ibatis.annotations.Mapper

@Mapper
interface SalesGetDBRepository {
  fun getSales(): SalesGetDBResult
}
