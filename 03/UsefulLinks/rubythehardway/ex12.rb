print "Give me a number: "
number = gets.chomp.to_f
bigger = number * 100
puts "A bigger number is #{bigger}."

print "Give me another number: "
another = gets.chomp
number = another.to_f
smaller = number / 100
puts "A small number is #{smaller}"

print "Give me some money: "
money = gets.chomp
cashback = money.to_f / 10
puts "Here's your money #{cashback}"
