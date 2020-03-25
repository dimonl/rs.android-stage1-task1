package subtask5

class HighestPalindrome {

    fun highestValuePalindrome(n: Int, k: Int, digitString: String): String {
        var elToChange: Int = 0
        val digitArray = digitString.toMutableList()
        val halfEl: Int = n / 2

        for (i in 0 until halfEl) {
            if (digitString[i].toInt() != digitString[n - 1 - i].toInt()) {
                elToChange += 1
            }
        }
        when {
            elToChange > k && k != elToChange -> {
                return "-1"
            }
            elToChange == 1 || k == 1 -> {
                for (i in 0..halfEl) {
                    when {
                        digitString[i] > digitString[n - 1 - i] -> {
                            digitArray[n - 1 - i] = digitArray[i]
                        }
                        digitString[i] < digitString[n - 1 - i] -> {
                            digitArray[i] = digitArray[n - 1 - i]
                        }
                    }
                }
                return digitArray.joinToString(separator = "")
            }
            else -> {
                digitArray.set(0, '9')
                digitArray.set(digitArray.lastIndex, '9')
                return highestValuePalindrome(n, k - 2, digitArray.joinToString(separator = ""))
            }
        }
    }
}
