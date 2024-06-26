package com.vendingmachine.api.registerSalesData.post

import com.vendingmachine.api.registerSalesData.post.data.RegisterSalesDataPostDBParam
import org.apache.ibatis.annotations.Mapper

@Mapper
interface RegisterSalesDataPostDBRepository {
  fun registerSalesData(registerSalesDataPostDBParam: RegisterSalesDataPostDBParam): Int
}
