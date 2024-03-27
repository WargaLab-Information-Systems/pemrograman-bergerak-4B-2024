import java.util.Scanner

// Data class untuk merepresentasikan produk skincare //menyimpan data
data class SkincareProduct(val id: Int, val name: String, val price: Double)

// Kelas untuk manajemen toko online skincare
class SkincareStore {
    private val products = mutableListOf<SkincareProduct>() //tidak dapat diakses di kelas lain

    // Menambahkan produk baru ke toko
    fun addProduct(name: String, price: Double) {
        val id = products.size + 1
        val newProduct = SkincareProduct(id, name, price)
        products.add(newProduct)
        println("Produk telah ditambahkan: $newProduct")
    }

    // Menampilkan daftar produk
    fun displayProducts() {
        println("Daftar Produk Skincare:")
        products.forEach { println("ID: ${it.id}, Nama: ${it.name}, Harga: ${it.price}") }
    }

    // Memesan produk
    fun orderProduct(productId: Int, quantity: Int) {
        val product = products.find { it.id == productId }
        if (product != null) {
            val totalPrice = product.price * quantity
            println("Pesanan Anda:")
            println("Produk: ${product.name}, Harga: ${product.price}, Jumlah: $quantity, Total: $totalPrice")
        } else {
            println("Produk tidak ditemukan.")
        }
    }
}

fun main() {
    val store = SkincareStore()
    val scanner = Scanner(System.`in`)
    var running = true

    while (running) {
        println("\nMenu:")
        println("1. Tambah Produk")
        println("2. Tampilkan Produk")
        println("3. Pesan Produk")
        println("4. Keluar")
        print("Pilih menu: ")

        when (scanner.nextInt()) {
            1 -> {
                print("Masukkan nama produk: ")
                val productName = scanner.next()
                print("Masukkan harga produk: ")
                val productPrice = scanner.nextDouble()
                store.addProduct(productName, productPrice)
            }
            2 -> store.displayProducts()
            3 -> {
                print("Masukkan ID produk yang ingin dipesan: ")
                val productId = scanner.nextInt()
                print("Masukkan jumlah: ")
                val quantity = scanner.nextInt()
                store.orderProduct(productId, quantity)
            }
            4 -> {
                println("Terima kasih telah menggunakan toko online skincare kami.")
                running = false
            }
            else -> println("Pilihan tidak valid.")
        }
    }
}

