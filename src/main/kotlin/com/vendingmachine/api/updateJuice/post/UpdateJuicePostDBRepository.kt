package com.vendingmachine.api.updateJuice.post

import com.vendingmachine.api.updateJuice.post.data.UpdateJuicePostDBParam
import org.apache.ibatis.annotations.Mapper

@Mapper
interface UpdateJuicePostDBRepository {
  fun updateJuice(updateJuicePostDBParam: UpdateJuicePostDBParam): Int
}
