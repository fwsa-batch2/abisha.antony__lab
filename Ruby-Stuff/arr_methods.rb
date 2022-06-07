#each - iterates over every element in the range(loop)

range = (1..7)
puts range.each {|el| print el, ','}

#length method in array-it returns the number of element in the array
a = [1,2,3,4,5,6,nil]
puts "#{a.length()}"

#include? - return true if element is present or false
a = [1,2,3,4,5,6,nil]
puts "#{a.include?(nil)}"

#map -Return: a new array containing the values returned by the block.
# puts "#{a.map {|num| num.even? }}\n"

#find- returns the first element which satisfies the given condition 
a = (1..20)
 puts a.find{|el| el % 2 == 0 && el%9 == 0}

 #find all
 puts a.find_all {|el| el % 2 == 0}

 #reverse - reversing an array
r = [1,2,3,4,5]
 puts "#{r.reverse()}"

 s = [1,2,8,7,5,4]
 o = ["abi","ajay","zoya","yasmin"]
 puts "#{s.sort()}"
 puts "#{o.sort()}"