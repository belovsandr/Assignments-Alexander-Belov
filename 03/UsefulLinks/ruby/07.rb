arr = []
word = nil
while word != ''
	puts 'Write your word:'
	word = gets.chomp
	arr.push word
end
puts arr.sort

