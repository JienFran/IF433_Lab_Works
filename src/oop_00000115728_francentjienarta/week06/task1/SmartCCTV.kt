package oop_00000115728_francentjienarta.week06.task1

class SmartCCTV(override val id: String, override val name: String) : SmartDevice, Switchable, Recordable {
    override fun turnOn() {
        println("CCTV $name menyala.")
        startRecord()
    }

    override fun turnOff() {
        println("CCTV $name mati.")
        stopRecord()
    }

    override fun startRecord() {
        println("CCTV $name mulai merekam.")
    }
}