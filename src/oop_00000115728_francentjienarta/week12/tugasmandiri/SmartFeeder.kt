package oop_00000115728_francentjienarta.week12.tugasmandiri

fun dispenseKibble(requestedGram: Int, availableGram: Int, isJammed: Boolean): Int {
    require(requestedGram > 0) {
        "Porsi kibble harus lebih dari 0 gr"
    }
    return availableGram - requestedGram
}