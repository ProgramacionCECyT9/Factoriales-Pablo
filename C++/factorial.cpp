#include <iostream>
int main()
{
    int factorial_of, result = 1;
    std::cout << "Hey man! Give me a number and I'll return you the factorial.\n";
    std::cin >> factorial_of;
    for(int i = 1; i <= factorial_of; i++)
    {
        result *= i;
    }
    printf("The factorial of %d is = %d\n", factorial_of, result);
}
