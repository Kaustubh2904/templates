#include <iostream>

// Function to compute factorial recursively
int factorial(int n) {
    if (n == 0) {
        return 1; // Base case
    } else {
        return n * factorial(n - 1); // Recursive case
    }
}

int main() {
    int num;
    //std::cout << "Enter a non-negative integer: ";
    std::cin >> num;

    if (num < 0) {
        std::cerr << "Factorial is not defined for negative integers." << std::endl;
        return 1;
    }

    std::cout << "Factorial of " << num << " is " << factorial(num) << std::endl;
    return 0;
}
