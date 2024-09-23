// Клас Book
class Book {
    #title;
    #author;
    #isAvailable;

    constructor(title, author) {
        this.#title = title;
        this.#author = author;
        this.#isAvailable = true;
    }

    getTitle() {
        return this.#title;
    }

    getAuthor() {
        return this.#author;
    }

    isAvailable() {
        return this.#isAvailable;
    }

    checkoutBook() {
        if (this.#isAvailable) {
            this.#isAvailable = false;
            return true;
        }
        return false;
    }
}

// Клас Library
class Library {
    books = [];

    addBook(book) {
        this.books.push(book);
    }

    checkoutBook(title) {
        const book = this.books.find(b => b.getTitle() === title);
        if (book) {
            if (book.checkoutBook()) {
                console.log(`Ви взяли книгу "${book.getTitle()}" автора ${book.getAuthor()}.`);
            } else {
                console.log(`Вибачте, "${title}" недоступна.`);
            }
        } else {
            console.log(`Книга з назвою "${title}" не знайдена.`);
        }
    }

    viewAvailableBooks() {
        const availableBooks = this.books.filter(book => book.isAvailable());
        console.log("Доступні книги:");
        availableBooks.forEach(book => {
            console.log(`- "${book.getTitle()}" автора ${book.getAuthor()}`);
        });
    }
}

// Приклад використання
const myLibrary = new Library();
const book1 = new Book("Убити пересмішника", "Гарпер Лі");
const book2 = new Book("1984", "Джордж Орвелл");
const book3 = new Book("Великий Гетсбі", "Ф. Скотт Фіцджеральд");

myLibrary.addBook(book1);
myLibrary.addBook(book2);
myLibrary.addBook(book3);

myLibrary.viewAvailableBooks();
myLibrary.checkoutBook("1984");
myLibrary.viewAvailableBooks();
myLibrary.checkoutBook("1984"); // Це повинно вивести, що книга недоступна.