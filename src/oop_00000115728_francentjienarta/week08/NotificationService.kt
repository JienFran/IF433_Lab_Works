package oop_00000115728_francentjienarta.week08

class NotificationService {
    fun sendEmail(emailAddress: String){
        println("Mengirim email ke: $emailAddress")
    }

    fun processUser(user: UserProfile){
        // sendEmail(user.email)

        if (user.email != null){
            sendEmail(emailAddress = user.email)
        } else{
            println("User ${user.name} tidak memiliki email.")
        }
    }
}