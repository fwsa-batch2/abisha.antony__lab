mark = gets.chomp.to_i
case mark
  when 0..5 then puts "Beginner"
  when 6..10 then puts "Intermediate"
  when 10.. 20 then puts "Advanced"
  else puts "fail"
end
