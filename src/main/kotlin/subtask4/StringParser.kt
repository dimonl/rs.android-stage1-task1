package subtask4

class StringParser {


    fun getResult(inputString: String): Array<String> {

        var workArray = emptyArray<String>()
        var charArr = inputString.toCharArray()
        var delim: Char
        var onePlus = 0
        for (i in 0 until charArr.size) {
            if (charArr[i] == '<' || charArr[i] == '(' || charArr[i] == '[') {
                delim = pairBracket(charArr[i])
                for (j in i + 1 until charArr.size) {
                    if (charArr[j] == charArr[i]) onePlus++
                    else if (charArr[j] == delim){
                     if (onePlus == 0){
                         workArray += inputString.substring(i+1, j)
                         break
                     }  else onePlus--
                    }
                }
                //workArray += (inputString.substring(i + 1)).substringBefore(delim)
            }
        }

        return workArray
    }

    fun pairBracket(char: Char):Char
    {
        if (char == '(') return ')'
        if (char == '[') return ']'
        //if (char == '<') return '>'
        //return ''
        return '>'
    }
}
