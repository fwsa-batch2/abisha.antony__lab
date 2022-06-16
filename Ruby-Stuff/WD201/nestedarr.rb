# names = [["Jhumpa", "Lahiri"], ["J.K", "Rowling"], ["Devdutt", "Pattanaik"]]
# name = []
# names.length
# for i in 0...names.length
#     hi = names[i].join(" ")
#      name.push(hi) 
# end
#   print name




# #problem2
#   books = ["Design as Art", "Anathem", "Shogun"]
# authors = ["Bruno Munari", "Neal Stephenson", "James Clavell"]
# for i in 0...books.length do
#     newbook = books[i]
#     newauthor = authors[i]
#     puts "#{newbook} #{newauthor}"
# end




#prblm3
todos = [
  ["Send invoice", "money"],
  ["Clean room", "organize"],
  ["Pay rent", "money"],
  ["Arrange books", "organize"],
  ["Pay taxes", "money"],
  ["Buy groceries", "food"]
]
  moneyarr = []
  organizearr = []
  foodarr = []
  puts "money :"
  for i in 0...todos.length
    var = todos[i][1]
    if var == "money"
      moneyarr.push(todos[i][0])
    end
  end
  puts moneyarr

  puts "organize :"

   for i in 0...todos.length
    var1 = todos[i][1]
    if var1 == "organize"
      organizearr.push(todos[i][0])
    end
   end 
   puts organizearr

  puts "food :"
  for i in 0...todos.length
    var2 = todos[i][1]
    if var2 == "food"
      foodarr.push(todos[i][0])
    end
  end
  puts foodarr
    


































