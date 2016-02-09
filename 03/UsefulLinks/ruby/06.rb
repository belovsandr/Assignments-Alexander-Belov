ans = ''
bye = 0
while bye < 3
	year = rand (1930..1950)
	puts '(*say something to your granny, please*):'
	ans = gets.chomp
	if ans == 'BYE'
		bye = bye + 1
	else
		bye = 0
		if ans == ans.upcase
			puts 'NO, NOT SINCE '+year.to_s+'!'
		else
			puts 'HUH?! SPEAK UP, SONNY!'
		end
	end
end
