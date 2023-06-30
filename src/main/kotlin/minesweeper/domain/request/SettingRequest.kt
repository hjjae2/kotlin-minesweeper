package minesweeper.domain.request

import minesweeper.domain.PositiveInt

class SettingRequest(
    val height: PositiveInt,
    val width: PositiveInt,
    val mineCount: PositiveInt,
)
