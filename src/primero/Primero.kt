package primero

fun maxTickets(tickets: Array<Int>): Int {

    val orderTik = tickets.sortedArray()
    val arrayL: MutableMap<Int, MutableList<Int>> = HashMap()

    var seq = 0

    orderTik.forEachIndexed{index, element ->

        if(arrayL.isEmpty()){
            arrayL[seq] = arrayListOf()
            arrayL[seq]?.add(element)
        } else {
            val aux: Int? = arrayL[seq]?.last()

            if (aux != null) {
                if(element == aux || element == (aux + 1)){
                    arrayL[seq]?.add(element)
                }else {
                    seq ++
                    arrayL[seq] = arrayListOf()
                    arrayL[seq]?.add(element)
                }
            }
        }

    }

    var mayor = 0

    arrayL.map {
        if(mayor == 0){
            mayor = it.value.size
        }else {
            if(it.value.size > mayor){
                mayor = it.value.size
            }
        }

    }


    return mayor

}

class Primero {

    fun main(args: Array<String>) {
//    val ticketsCount = readLine()!!.trim().toInt()
//
//    val tickets = Array<Int>(ticketsCount, { 0 })
//    for (i in 0 until ticketsCount) {
//        val ticketsItem = readLine()!!.trim().toInt()
//        tickets[i] = ticketsItem
//    }



        val ti = Array<Int>(3, {0})
    ti.set(0, 4)
    ti.set(1, 13)
    ti.set(2, 2)
    ti.set(3, 3)
    ti.set(4, 14)
    ti.set(5, 17)



        val res = maxTickets(ti)

         println(res)

    }

}