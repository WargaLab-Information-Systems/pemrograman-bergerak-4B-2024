// Class Menu untuk menyimpan informasi tentang menu kopi
class Menu(val name: String, val price: Int)

// Class CoffeeShop untuk mengelola menu dan pesanan
class CoffeeShop(val name: String) {
    private val menus = listOf(
        Menu("Espresso", 15000),
        Menu("Latte", 20000),
        Menu("Cappuccino", 18000),
        Menu("Americano", 16000),
        Menu("Mocha", 22000)
    )

    // Function untuk menampilkan menu
    fun showMenu() {
        println("Menu $name:")
        menus.forEachIndexed { index, menu -> //menus: Ini adalah sebuah koleksi, seperti List atau Array,
            // yang berisi elemen-elemen yang ingin diteruskan atau ditelusuri.
            println("${index + 1}. ${menu.name} - Rp ${menu.price}")
        }
    }

    // Function untuk memesan kopi
    fun orderCoffee(menuIndex: Int, quantity: Int): Int { // parameter yang menentukan jumlah pesanan
        // atau banyaknya kopi yang ingin dipesan oleh pengguna.
        if (menuIndex < 1 || menuIndex > menus.size) {
            println("Menu tidak tersedia")
            return 0
        }

        val selectedMenu = menus[menuIndex - 1]
        val totalPrice = selectedMenu.price * quantity

        println("Pesanan Anda: ${selectedMenu.name} sebanyak $quantity")
        println("Total harga: Rp $totalPrice")

        return totalPrice
    }
}

fun main() {
    val coffeeShop = CoffeeShop("KopiKita")
    var totalIncome = 0

    while (true) {
        println("\nSelamat datang di ${coffeeShop.name}!")
        println("1. Lihat Menu")
        println("2. Pesan Kopi")
        println("3. Keluar")

        print("Pilih menu: ")
        val choice = readLine()?.toIntOrNull()

        when (choice) {
            1 -> coffeeShop.showMenu()
            2 -> {
                print("Pilih kopi (1-${coffeeShop.showMenu()}): ")
                val menuIndex = readLine()?.toIntOrNull() ?: 0

                print("Jumlah pesanan: ")
                val quantity = readLine()?.toIntOrNull() ?: 0

                totalIncome += coffeeShop.orderCoffee(menuIndex, quantity)
            }
            3 -> {
                println("Total pendapatan hari ini: Rp $totalIncome")
                return
            }
            else -> println("Pilihan tidak valid")
        }
    }
}
