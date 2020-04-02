package segundo

fun segment(x: Int, arr: Array<Int>): Int {
    // Write your code here

    val arrayL: MutableMap<Int, Array<Int>> = HashMap()

    for (i in 0 until x){
        arrayL[i] = arrayOf()
        val ran = i + (x - 1)
        arrayL[i] = arr.slice(i..ran).toTypedArray()
    }

    val check: Array<Int> = arrayL.values.elementAt(0)
    var priceMi = 0
    check.forEach {element ->
        var min = 0
        arrayL.forEach {
            val da = it.value.filter {fil ->
                fil == element
            }
            if(da.isNotEmpty()) {
                min++
                if(min == arrayL.size){
                    priceMi = element
                }
            }
        }
    }

    println(priceMi)

    return priceMi

}

fun main(args: Array<String>) {


    var arr : Array<Int> = arrayOf(2,5,4,6,8)

    val x = 3

    segment(x, arr)



}