#datatypes
count = 100
course = "saas 201"
is_live = true
lessons = ["basics","intermediate","advanced"]

length = 30
breadth = 40
area = length * breadth
puts area

age =20
name = "abi"
puts "i am " + name + " and i am " + age.to_s + " old"
puts "answer #{age}"

#boolean
puts "girl or boy?"
name = gets.chomp.downcase

if name == "girl"
    puts"you are beautiful"
    
elsif name == "boy"
    puts "ok bye"

else
   puts "better luck next time"
end

