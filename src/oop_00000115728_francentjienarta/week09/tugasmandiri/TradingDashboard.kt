package oop_00000115728_francentjienarta.week09.tugasmandiri

fun main() {
    val tradeHistory = listOf(
        TradeLog("BTCUSDT", "LONG", 20, 15.5, "CLOSED"),
        TradeLog("ETHUSDT", "SHORT", 10, -5.2, "CLOSED"),
        TradeLog("BTCUSDT", "LONG", 15, 8.3, "OPEN"),
        TradeLog("ETHUSDT", "LONG", 25, 12.1, "CLOSED"),
        TradeLog("XRPUSDT", "SHORT", 5, -10.0, "CLOSED"),
        TradeLog("BTCUSDT", "SHORT", 10, -2.5, "OPEN")
    )

    val closedTrades = tradeHistory.filter { it.status == "CLOSED" }

    val winningTrades = closedTrades.filter { it.roe > 0 }
}