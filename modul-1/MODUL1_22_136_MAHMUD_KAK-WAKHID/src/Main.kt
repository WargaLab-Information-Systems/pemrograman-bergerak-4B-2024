import kotlin.Array

class Main{
    lateinit var name: String

    fun jalan(){
        name = "Mahmud"
        println()
    }

}
fun main(){
    var name: String = "Mahmud"
    name= "Lana"
    println("nama saya $name")


    //angkaa

    var angka = 123
    var  desimal: Double = 0.2
    var uang: Long = 1_000_000
    var angka2: Int = desimal.toInt()
    var binary: Int = 0b101
    print("ini angka $angka")
    print("ini desimal $desimal")
    print("ini uang $uang")
    print("ini angka2 $angka2")

    //char
    var nilai190: Char = 'A'
    var nilai90 = 'B'
    var nilai80 = 'C'

    println(nilai190)

    Main().jalan()

    //bolean
    val sudahpraktikum: Boolean = true
    val  sudahlulus = false

    //Array
    val asprak: Array<String> = arrayOf("mas kukuh","mas wahid")
    val nilai = arrayOf(1,"Bagus", 2.5, "no")
    println(asprak[0])
    println(asprak.size)
    println(asprak.get(0))
    asprak.set(1, "abdul wahid")
    println(asprak[1])
    asprak[1] = "abdul wahid"
    println(asprak[1])
    val jam = 10
    //if else
    if (jam == 10){
        println("sudahh")
    }else{
        println("masih di lab")
    }

    //wheen
    when(nilai190){
        'A' -> println("Nila anda 100")
        'B' -> println("Nilai anda  90")
        'C' -> println("nilai anda 80")
    }
    var i = 10
    //looping
    while (i<=5){
        println("ini perulangan ke $i")
        i++
    }
    println("--------------------")
    var ulang = true
    var angka3 = 1
    while (ulang){
        if (angka3 == 3){
            ulang = false
        }else{
            println("ini angkaku $angka3")
            ulang = false
        }
    }
}
