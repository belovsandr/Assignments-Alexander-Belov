linewidth=50
contents = [['Chapter 1: Numbers','page 1'],['Chapter 2: Letters','page 72'],['Chapter 3: Variables','page 118']]
puts 'Table of Contents'.center(linewidth)
puts ''
contents.each do |(lre,rre)|
	puts lre.ljust(linewidth/2)+rre.rjust(linewidth/2)	
end

