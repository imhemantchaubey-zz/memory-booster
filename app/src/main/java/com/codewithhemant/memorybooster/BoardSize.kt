package com.codewithhemant.memorybooster

enum class BoardSize(val numCards: Int) {
    EASY(8),
    MEDIUM(18),
    HARD(28),
    SUPER_HARD(40);

    companion object{
        fun getByValue(value: Int) = values().first {
            it.numCards == value
        }
    }

    fun getWidth(): Int{
        return when(this){
            EASY -> 2
            MEDIUM -> 3
            HARD -> 4
            SUPER_HARD -> 5
        }
    }

    fun getHeight(): Int{
        return numCards / getWidth()
    }

    fun getNumPairs(): Int{
        return numCards / 2
    }
}