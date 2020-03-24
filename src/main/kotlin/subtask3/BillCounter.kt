package subtask3

class BillCounter {

    // The output could be "Bon Appetit" or the string with number(e.g "10")
    fun calculateFairlySplit(bill: IntArray, k: Int, b: Int): String {

        var workArray = emptyArray<Int>()
        var workArraySum = emptyArray<Int>()


            for(i in 0 until bill.size){
                if (i == k) continue
                workArray += bill[i]
            }
            var sumBill = workArray.sum()
            var annaPart = sumBill / 2
            var diff = abs(annaPart-b)
        return if(diff == 0)  "Bon Appetit" else (diff).toString()
    }

    private fun abs(i: Int): Any {
        return if (i<0) -i else i
    }
}
