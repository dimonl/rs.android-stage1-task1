package subtask2

class MiniMaxSum {

    fun getResult(input: IntArray): IntArray {

        if(input.size == 0){
            return input
        }

        var workArray = emptyArray<Int>()
        var workArraySum = emptyArray<Int>()
        for(i_ext in 0 until input.size){
            for(i in 0 until input.size){
                if (i == i_ext) continue
                workArray += input[i]
            }
            workArraySum += workArray.sum()
            workArray = emptyArray<Int>()
        }
        var resultArray =  emptyArray<Int>()
        resultArray += workArraySum.min()!!.toInt()
        resultArray += workArraySum.max()!!.toInt()
        return resultArray.toIntArray()
    }
}
