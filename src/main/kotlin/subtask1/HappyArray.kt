package subtask1

class HappyArray {

    // TODO: Complete the following function
    fun convertToHappy(sadArray: IntArray): IntArray {
        if(sadArray.size == 0){
            return sadArray
        }

        var resultArray =  emptyArray<Int>()
        var workArray = sadArray.copyOf()
        var indexHappy = 0
        var index = 1
        var range = sadArray.size
        var needOneIteration = true

        while (needOneIteration) {
            needOneIteration = false
            for (i in 0 until range - 1) {
                if (i == 0) {
                    resultArray += workArray[i]
                    indexHappy = 1
                    continue
                }
                if (workArray[i] < workArray[i - 1] + workArray[i + 1]) {
                    resultArray += workArray[i]
                    indexHappy++;
                } else {
                    needOneIteration = true
                }
            }
            resultArray += workArray[workArray.lastIndex]
            if (needOneIteration){
                range = resultArray.size
                workArray = resultArray.toIntArray().copyOf()
                resultArray =  emptyArray<Int>()
            }

        }


        return resultArray.toIntArray()
        //throw NotImplementedError("Not implemented")
    }
}
