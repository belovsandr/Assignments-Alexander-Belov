puts "Type starting year"
starty = gets.chomp.to_i
puts "Type ending year"
endy  = gets.chomp.to_i
year = starty
puts '---------------'
puts 'Leap years are:'
while year != endy+1
	if (year % 400 == 0) or ((year % 4 == 0) and (year % 100 != 0))
		puts year.to_s
	end
	year = year + 1
end
