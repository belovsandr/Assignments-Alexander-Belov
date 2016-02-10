def ask question
  goodAnswer = false
  while (not goodAnswer)
    puts question
    reply = gets.chomp.downcase
    if (reply == 'yes' or reply == 'no')
      goodAnswer = true
      if reply == 'yes'
        answer = true
      else
        answer = false
      end
    else
      puts 'Please answer "yes" or "no"!'
    end   
  end
  answer
end

ask 'Do you like eating tacos?'
ask 'Do you like eating burritos?'
wetsBed = ask 'Do you wet the bed?'
ask 'Do you like eating chimchangas?'
ask 'Do you like eating sopapillas?'
ask 'Do you like eating tamales?'
ask 'Do you like drinking horchata?'
ask 'Do you like eating flautas?'
puts
puts "Thank you"
puts
puts wetsBed
