package oop_00000115728_francentjienarta.week06.task1

class SmartSpeaker(override val id: String, override val name: String) : SmartDevice, Switchable {
    override fun turnOn() {
        println("Smart Speaker $name menyala.")
    }

    override fun turnOff() {
        println("Smart Speaker $name mati.")
    }

    fun playMusic(song: String) {
        println("Memutar lagu $song dari Spotify.")
    }
}