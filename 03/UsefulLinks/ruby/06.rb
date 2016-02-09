ans = ''
while ans != 'BYE'
	year = rand (1930..1950)
	puts '(*say something to your granny, please*):'
	ans = gets.chomp
	if ans == ans.upcase
		puts 'NO, NOT SINCE '+year.to_s+'!'
	else
		puts 'HUH?! SPEAK UP, SONNY!'
	end
end
