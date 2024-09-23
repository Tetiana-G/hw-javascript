function calculateTotal(cart) {
    // Порахувати загальну вартість товарів
    let total = cart.reduce((sum, item) => sum + (item.price * item.quantity), 0);

    // Якщо сума більше 100, застосувати знижку 10%
    if (total > 100) {
        total *= 0.9; // Застосування знижки 10%
    }

    // Повернути загальну суму
    return total;
}

// Приклад 1: корзина без знижки
const cart1 = [
    {name: "Apple", price: 1, quantity: 10},
    {name: "Banana", price: 3, quantity: 5},
    {name: "Milk", price: 10, quantity: 2},
];

console.log(calculateTotal(cart1)); // Очікуваний результат: 45

// Приклад 2: корзина зі знижкою
const cart2 = [
    {name: "Sushi", price: 20, quantity: 4},
    {name: "Burger Max", price: 30, quantity: 1},
];

console.log(calculateTotal(cart2)); // Очікуваний результат: 99