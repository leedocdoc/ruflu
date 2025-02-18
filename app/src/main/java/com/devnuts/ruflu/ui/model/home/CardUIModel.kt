package com.devnuts.ruflu.ui.model.home

import com.devnuts.ruflu.ui.model.CellType
import com.devnuts.ruflu.ui.model.Model

data class CardUIModel(
    override val type: CellType = CellType.USER_CARD_CEL,
    val user_id: String,
    val nick_nm: String,
    val birth: String,
    val gender: String = "",
    val wei: String = "",
    val hei: String = "",
    val occu: String = "",
    val occu_dtl: String = "",
    val rign: String = "",
    val alch: String = "",
    val smk_yn: String = "",
    val mbti: String = "",
    val fancy: String = "",
    val intd: String = "",
    val qa1: String = "",
    val qa2: String = "",
    val hob: String = "",
    val images: List<Model>
): Model(type)