#array

movies =Array.new(0)
movies.push(3)
movies.push("Ghost")
movies.push("Harry potter")
puts movies
puts movies.length
puts movies[0]
puts movies[1]
puts movies[movies.length-1]
 movies.push("moneyheist")
 puts movies
puts movies.last
 
#for each
nums = [1,2,3,4,5]
nums.each do |x|
    puts x
end

#split method in array
puts "life is awesome".split
#join method in array
puts ["life", "is"," awesome"].join (" ")

#filter
puts [1,2,3,4,5].select {|num| num.even? }

#map
nums = [2,3,4,5,6]
new_nums = nums.map{|x| x*23}
new_nums.each {|x| puts x}