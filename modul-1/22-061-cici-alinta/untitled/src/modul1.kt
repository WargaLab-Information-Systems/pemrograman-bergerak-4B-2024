import kotlin.Array

class KCW {
    lateinit var name: String
    fun jalan () {
        name = "lia"
        println(name)
    }
}

fun main() {
    var nama: String = "Cici alinta"
    nama = "dewi"
    println("Nama saya $nama")
    println("Nama Saya" + nama)
    // number
    var angka: Int = 123
    var desimal: Double = 0.2
    var uang: Long = 1_000_000
    var angka2: Int = desimal.toInt()
    var binary = 0b101

    println("ini angka $angka")
    println("ini angka $desimal")
    println("ini angka $uang")
    println("ini angka $angka2")
    println("ini angka $binary")

    // char
    var nilai100: Char = 'A'
    var nilai90 = 'B'
    var nilai80 = 'C'
    var nilai70 = 'D'

    println(nilai100)

    KCW().jalan()


    //bolean
    val sudahPraktikum: Boolean = true
    val sudahLulus = false

    // array
    val asprak: Array<String> = arrayOf("Kukuh Cokro Wibowo", "Abdul Wahid")
    val nilai = arrayOf(1, "Bagus",2.5, 'C')

    println(asprak[0])
    println(asprak.size)
    println(asprak.get(0))
    asprak.set(1, "Abdul W")
    println(asprak[1])
    asprak[1] = "Abdul Wahid"
    println(asprak[1])

    //penyeleksian kondisi
    // if
    if (sudahPraktikum){
        println("Pulang")
    } else {
        println("Masih di Lab")
    }

    val jam = 10
    if (jam == 10){
        println("Sudah jam 10")
    } else
        println("Belum jam 10")

    //when
    when(nilai100){
        'A' -> println("Nilai anda 100")
        'B' -> println("Nilai anda 90")
        'C' -> println("Nilai anda 80")
    }

    // looping
    val array = arrayOf("Muhammad", "Kurniawan", "Dwi", "Hariyadi")
    for (nama in array){
        println(nama)
    }
    for (value in 1..10 ){
        println("nilai $value")
    }
    for (value in 100 downTo 0 step 20){
        println("Nilai $value")
    }

    // while
    var i= 1
    while (1<=5){
        println("ini perulangan ke $i")
        i++ // while ga bisa ascending otomatis jadi manual untuk mencegah infinite loop
    }
    println("--------------")
    var ulang = true
    var angka3 = 1
    while(ulang){
        if (angka == 3){
            ulang = false
        }else {
            println("ini angka ke $angka3")
            angka++
        }
    }

    // do while
    var ulang1 = 1
    do{
        ulang1++
        println("Ini ke $ulang1")
    }while (ulang1 <=10)  // akan berhenti ke 11 karena tetap menjalankan dulu baru di cek

}