def cheese_and_crackers (cheese_count, crackers_count)
  puts "You have #{cheese_count} cheeses"
  puts "You have #{crackers_count} crackers"
end

puts "\nWe can give the function numbers directly:"
cheese_and_crackers(20,30)

puts "\nOR we can use variables from our script:"
amount_of_cheese = 30
amount_of_crackers = 40

cheese_and_crackers(amount_of_cheese,amount_of_crackers)

puts "\nWE can do math inside too:"
cheese_and_crackers(10+20,5+6)

puts "\nAnd we can also combine vaiables and math:"
cheese_and_crackers(amount_of_cheese+5,amount_of_crackers+10)


