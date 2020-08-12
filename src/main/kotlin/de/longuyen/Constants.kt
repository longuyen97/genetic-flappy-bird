package de.longuyen

import de.longuyen.genetic.Brain
import kotlin.math.sqrt

const val PIPE_WIDTH = 50
const val PIPE_SPACE = 250
const val FIELD_WIDTH = 800
const val FIELD_HEIGHT = 600
const val RAD = 25
const val BIAS = 0.1
val STAGE_SIZES = intArrayOf(9, 5, 3, 1)
const val SYMMETRICAL = false
val DNA_LENGTH = Brain.calculateNumberOfParameters(STAGE_SIZES, SYMMETRICAL) + 1
val MAX_DISTANCE = sqrt((FIELD_HEIGHT * FIELD_WIDTH + FIELD_HEIGHT * FIELD_HEIGHT).toDouble())
const val MAX_VELOCITY = 50.0