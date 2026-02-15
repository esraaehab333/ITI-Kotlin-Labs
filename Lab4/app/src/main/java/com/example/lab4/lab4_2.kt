open class Person(var id:Int, val name:String)

class Librarian(name:String,id:Int,var password:String):Person(id,name)

class User(name:String,id:Int,var job:String):Person(id,name)

open class LibraryItem(val title:String,
                       val isbn:String,
                       val publication:String,
                       val numOfPage:Int){
    private var status :Boolean=true
    open fun isAvariable():Boolean{
        return status
    }
    fun setAvailability(state:Boolean){
        status=state
    }
}
class Book (title:String,isbn:String,publication:String,numOfPage:Int):LibraryItem(title,isbn,publication,numOfPage){
    override fun isAvariable(): Boolean {
        return super.isAvariable()
    }
}
class Magazine (title:String,isbn:String,publication:String,numOfPage:Int):LibraryItem(title,isbn,publication,numOfPage){
    override fun isAvariable(): Boolean {
        return super.isAvariable()
    }
}
class Journal (title:String,isbn:String,publication:String,numOfPage:Int):LibraryItem(title,isbn,publication,numOfPage){
    override fun isAvariable(): Boolean {
        return super.isAvariable()
    }
}
class LibraryDataBase(var currentLibrarian: Librarian){
    // var is not change or reasign
    //val we can assign it
    private val listOfAvariableBook = mutableListOf<LibraryItem>()
    private val listOfBorredBook = mutableMapOf<String,User>()

    fun addBook(item:LibraryItem):Unit{
        listOfAvariableBook.add(item)
    }

    // we add the map so the borrowed book one take this
    // user and is isbn
    fun lendBook(isbn:String,user:User):Unit{
        val item = listOfAvariableBook.find { isbn==it.isbn && it.isAvariable()}
        // this mean it avariabe and exist
        if(item!=null){
            item.setAvailability(false)// not pass the condtion
            listOfBorredBook[isbn]=user
            println("Book ${item.title} is now with ${user.name}")
        }
        else{
            // this mean this book is now someone take this so not avaiable for lend
            println("Book is not avariable for lending")
        }
    }

    fun viewAvariableBooks():Unit{
        val avariable = listOfAvariableBook.filter { it.isAvariable() }
        avariable.forEach{ println("Available: ${it.title}") }
    }

    fun searchForBook(name:String):Unit{
        // the case sensitive
        val item = listOfAvariableBook.find {it.title.equals(name, ignoreCase = true)}
        if(item!=null){
            val status = if (item.isAvariable()) "Available" else "Already Borrowed"
            println("Book : ${item.title} | Status : $status")
        }
        else{
            println("Book : $name Not Found")
        }
    }

    fun recieveBookFromBorrower(isbn: String):Unit{
        val item = listOfAvariableBook.find { it.isbn == isbn }
        if(item !=null){
            item.setAvailability(true)
            listOfBorredBook.remove(isbn)
            println("Book returned successfully")
        }
    }

}
fun main() {
    val admin = Librarian("Esraa", 1, "pass123")
    val library = LibraryDataBase(admin)
    val book1 = Book("Kotlin Programming", "123-ABC", "TechPress", 300)
    val mag1 = Magazine("Tech Today", "456-DEF", "ScienceMag", 50)
    val user1 = User("Ahmed", 10, "Student")
    val user2 = User("Sara", 11, "Engineer")
    library.addBook(book1)
    library.addBook(mag1)
    println("\n--- 1. Viewing Available Books ---")
    library.viewAvariableBooks()
    println("\n--- 2. Searching for Books ---")
    library.searchForBook("kotlin programming")
    library.searchForBook("Java")
    println("\n--- 3. Lending Process ---")
    library.lendBook("123-ABC", user1)
    library.viewAvariableBooks()
    println("\n--- 4. Trying to lend the same book again ---")
    library.lendBook("123-ABC", user2)
    println("\n--- 5. Receiving Book Back ---")
    library.recieveBookFromBorrower("123-ABC")
    library.viewAvariableBooks()
}