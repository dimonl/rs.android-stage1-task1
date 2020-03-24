package subtask4

class StringParser {


    fun getResult(inputString: String): Array<String> {

        var workArray = emptyArray<String>()
        var charArr = inputString.toCharArray()

        for(i in 0 until charArr.size){
            if (charArr[i] == '<' || charArr[i] == '(' || charArr[i] == '[') {
                var delim = if(charArr[i] == '<') '>' else if(charArr[i] == '(') ')' else ']'
                workArray += (inputString.substring(i+1)).substringBefore(delim)
            }
        }

//        for(i in 0 until charArr.size){
//            if (charArr[i] == '<' || charArr[i] == '(' || charArr[i] == '[') {
//                var delim = if(charArr[i] == '<') '>' else if(charArr[i] == '(') ')' else ']'
//                workArray += (inputString.substring(i+1)).substringBefore(delim)
//            }
//        }

        return workArray
    }
}
