puts "Hey man! Give me a number and I'll return you the factorial.\n"
factorial_of = gets.chomp
begin
    factorial_of = Integer(factorial_of)
    result = 1
    for i in 1..factorial_of
        result *= i
    end
    print "The factorial of ", factorial_of, " is = ", result, "\n"
rescue
    puts "I asked you for a number..."
end
