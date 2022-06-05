# for loop
list = ["a","b","c"]

for i in 0..list.size do
    puts list[i]
end
 
#for loop
string = "abi"
for i in 0..string.length do
    puts string[i]
end 

#while loop
x = 0
while x <= 10 
  puts x
  x += 1
end

#while
x = 5
while x > 0
    puts "hello"
    x = x - 1
end

#do while
int = 0 
loop do 
    puts "ruby"
    if int == 2
        break
    end  
    int +=1   
end

#until loop - opp to while loop
var = 4
until var == 6 do
    puts "var is less than 6"
    var = var + 1
end

#for each
array = Array.new(1,"abi")
array.each do |num|
    puts num
end


#unless
a = 1
unless a > 4
    puts "welcome"
else
    puts "hello"
end
