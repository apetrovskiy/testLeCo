package problems.easy.GreatestCommonDivisorOfStrings

class SolutionKt {
    fun gcdOfStrings(str1: String, str2: String): String {
        var result: String = ""
        val maxDivisorLength: Int = listOf(str1.length, str2.length).min()!!
        var currentDivisor: String = ""
        for (i in 0..maxDivisorLength - 1) {
            currentDivisor += str1[i]
            if (isDivisorOf(currentDivisor, str1) && isDivisorOf(currentDivisor, str2))
                result = currentDivisor
        }
        return result
    }

    fun isDivisorOf(divisor: String, data: String): Boolean {
        var result: Boolean = false
        if (divisor.length > data.length)
            return result
        if (divisor == data)
            return true
        val listOfDataParts = data.split(divisor)
        result = listOfDataParts.all { it == "" }
        return result
    }
}
