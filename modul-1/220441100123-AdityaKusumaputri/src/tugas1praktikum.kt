import java.util.Scanner
import kotlin.math.PI
//luas persegi
fun main() {
    val scanner = Scanner(System.`in`)

    var lanjut: Boolean = false // Memberikan nilai awal 'false' pada variabel lanjut
    do {
        println("\n1. Luas Persegi")
        println("2. Luas Segitiga ")
        println("3. Keliling Persegi")
        println("4. Keliling Segitiga")
        println("5. luas lingkaran")
        println("6. keliling lingkaran")
        println("Pilih yang Akan Di Hitung: ")

        val choice = scanner.nextInt()
        when (choice) {
            1 -> hitunglpersegi(scanner)
            2 -> hitunglsegitiga(scanner)
            3 -> hitungkpersegi(scanner)
            4 -> hitungksegitiga(scanner)
            5 -> hitungllingkaran(scanner)
            6 -> hitungklingkaran(scanner)
            else -> println("Pilihan tidak valid!!! ")
        }


        var validInput = false
        while (!validInput) {
            println("\nApakah Anda ingin mengulang lagi? (true/false): ")
            val input = scanner.next().toString()


            if (input == "true" || input == "false") {
                lanjut = input.toBoolean()
                validInput = true
            } else {
                println("Masukan tidak valid!!!. Harap masukkan 'true' atau 'false'.")
            }
        }

    } while (lanjut)
    println("\nTerima kasih telah menggunakan program ini.")
    scanner.close()
}




fun hitunglpersegi(scanner: Scanner) {

    val persegi = Scanner(System.`in`)
    println("Menghitung Luas Persegi")
    println("Panjang Persegi: ")
    var p = persegi.nextDouble() //digunakan untuk membaca input berikutnya sebagai bilangan desimal
    println("Lebar Persegi: ")
    var l = persegi.nextDouble()
    println("Luas Persegi = " + p * l)
}

//luas segitiga

fun hitunglsegitiga(scanner: Scanner) {

    val segitiga = Scanner(System.`in`)
    println("Menghitung Luas segitiga")
    println("alas segitiga: ")
    var a = segitiga.nextDouble()
    println("tinggi segitiga: ")
    var t = segitiga.nextDouble()
    println("Luas segitiga = " + 0.5 * a * t)
}
//keliling persegi

fun hitungkpersegi(scanner: Scanner) {
    val kpersegi = Scanner(System.`in`)
    println("Menghitung Keliling Persegi")
    println(" sisi persegi: ")
    var s = kpersegi.nextDouble()
    println("Keliling Persegi = " + s * s )
}
//keliling Segitiga

fun hitungksegitiga(scanner: Scanner) {
    val ksegitiga = Scanner(System.`in`)
    println("Menghitung Keliling Segitiga")
    println(" sisi 1 : ")
    var s1 = ksegitiga.nextDouble()
    println(" sisi 2 : ")
    var s2 = ksegitiga.nextDouble()
    println(" sisi 3 : ")
    var s3 = ksegitiga.nextDouble()
    println("Keliling Persegi = " + (s1 + s2 + s3))
}


fun hitungllingkaran(scanner: Scanner) {
    val lling = Scanner(System.`in`)
    println("Masukkan jari-jari lingkaran: ")
    var jari = lling.nextInt()
    println("Luas Lingkaran ="  + PI* jari * jari )
}

fun hitungklingkaran(scanner: Scanner) {
    val kling = Scanner(System.`in`)
    println("Masukkan jari-jari lingkaran: ")
    var jari = kling.nextInt()
    println("Keliling Lingkaran ="  + 2* PI* jari )

}

