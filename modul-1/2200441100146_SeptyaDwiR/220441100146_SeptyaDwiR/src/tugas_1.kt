fun main (){


    println("selamat datang dibank sampah")
    println("silahkan pilih kategori sampah yang ingin ditukar : ")
    println("1. sampah Organik ")
    println("2. sampah Anorganik")

    print("pilih kategori : ")
    val angkaString = readLine()
    val angkaInt = angkaString?.toIntOrNull()

    if (angkaInt == 1) {

        val sayur = 1000
        val daun = 2000
        val buah = 3000
        println("sampah Organik ")
        println("1. sayuran Rp $sayur")
        println("2. daun kering Rp $daun")
        println("3. buah  Rp $buah")

        print("pilih : ")
        val pilString = readLine()
        val pilInt = pilString?.toIntOrNull()
            if (pilInt == 1){
                println("anda mendapatkan uang sebesar Rp $sayur")
            } else if (pilInt == 2){
                println("anda mendapatkan uang sebesar Rp $daun")
            } else {
                println("anda mendapatkan uang sebesar Rp $buah")
            }

            }
    else {
        val plastik = 1000
        val kertas = 2000
        val kaleng = 3000
        println("sampah Anorganik ")
        println("1. plastik Rp 1000")
        println("2. kertas Rp 2000")
        println("3. kaleng Rp 3000")

        print("pilih : ")
        val pilString = readLine()
        val pilInt = pilString?.toIntOrNull()
        if (pilInt == 1){
            println("anda mendapatkan uang sebesar Rp $plastik")
        } else if (pilInt == 2){
            println("anda mendapatkan uang sebesar Rp $kertas")
        } else {
            println("anda mendapatkan uang sebesar Rp $kaleng")
        }
    }


}

