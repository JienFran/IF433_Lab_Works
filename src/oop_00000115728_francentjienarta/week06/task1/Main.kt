package oop_00000115728_francentjienarta.week06.task1

fun main() {
    val lamp = SmartLamp("L001", "Ruang Tamu")
    val speaker = SmartSpeaker("S002", "Google Nest Dapur")
    val cctv = SmartCCTV("C007", "Ezviz Garasi")

    val hub = SmartHomeHub()

    hub.addDevice(lamp)
    hub.addDevice(speaker)
    hub.addDevice(cctv)

    hub.activateSecurityMode()
    hub.turnOffAllSwitches()
}