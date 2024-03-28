import java.util.Scanner

// Kelas untuk produk di toko
data class Product(val name: String, val price: Double)

// Kelas untuk mengelola penjualan
class PointOfSale {
    private val products = mutableMapOf<Product, Int>()

    // Menambahkan produk ke dalam daftar produk
    fun addProduct(product: Product, quantity: Int) {
        products[product] = products.getOrDefault(product, 0) + quantity
    }

    // Menampilkan daftar produk yang tersedia
    fun displayProducts() {
        println("Daftar Produk:")
        products.forEach { (product, quantity) ->
            println("${product.name} - Rp ${product.price} - Tersedia: $quantity")
        }
    }

    // Memproses penjualan produk
    fun processSale(product: Product, quantity: Int) {
        if (products.getOrDefault(product, 0) >= quantity) {
            products[product] = products[product]!! - quantity
            println("Terima kasih! Anda telah membeli $quantity ${product.name}.")
            println("Total harga: Rp ${product.price * quantity}")
        } else {
            println("Maaf, stok ${product.name} tidak mencukupi.")
        }
    }
}

fun main() {
    val scanner = Scanner(System.`in`)
    val pointOfSale = PointOfSale()

    // Menambahkan produk ke dalam toko
    val produk1 = Product("Gula", 15000.0)
    val produk2 = Product("Kopi", 25000.0)
    val produk3 = Product("Teh", 20000.0)
    pointOfSale.addProduct(produk1, 10)
    pointOfSale.addProduct(produk2, 15)
    pointOfSale.addProduct(produk3, 20)

    var isRunning = true

    while (isRunning) {
        println("\nSelamat datang di Toko Klontong")
        println("1. Lihat Produk")
        println("2. Beli Produk")
        println("3. Keluar")
        print("Pilihan Anda: ")

        when (scanner.nextInt()) {
            1 -> pointOfSale.displayProducts()
            2 -> {
                println("Pilih produk yang ingin dibeli:")
                pointOfSale.displayProducts()
                print("Nama produk: ")
                val productName = readLine() ?: ""
                val selectedProduct = when (productName) {
                    "Gula" -> produk1
                    "Kopi" -> produk2
                    "Teh" -> produk3
                    else -> null
                }
                if (selectedProduct != null) {
                    print("Jumlah yang ingin dibeli: ")
                    val quantity = scanner.nextInt()
                    pointOfSale.processSale(selectedProduct, quantity)
                } else {
                    println("Produk tidak ditemukan.")
                }
            }
            3 -> {
                println("Terima kasih telah berkunjung!")
                isRunning = false
            }
            else -> println("Pilihan tidak valid.")
        }
    }
}
