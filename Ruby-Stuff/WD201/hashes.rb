# library = {}
# library["abi"] = ["good girl","super good"]
# library["santa"] = ["good boy","okok"] 
#  var = library.keys
#  puts var
#  puts "keys : #{var.join(',')}"

#  library.each do |var,books|
#     puts "#{var.capitalize} wrote about #{books.join(',')}"
#  end

#prblm1
books = ["Design as Art", "Anathem", "Shogun"]
authors = ["Bruno Munari", "Neal Stephenson", "James Clavell"]
hsh = {}
for i in 0...books.length do
  var = authors[i].split.first.downcase.to_sym
  puts var
  hsh.store(var,books[i])
end 
puts hsh

#prblm2
todos = [
  ["Send invoice", "money"],
  ["Clean room", "organize"],
  ["Pay rent", "money"],
  ["Arrange books", "organize"],
  ["Pay taxes", "money"],
  ["Buy groceries", "food"]
]

  todo = {}
  money = []
  organize = []
  food = []
  for i in 0...todos.length do
    var = todos[i][1]
     if var == "money"
      money.push(todos[i][0])
       todo.store(var.to_sym,money)
     end
     if var =="organize"
       organize.push(todos[i][0])
       todo.store(var.to_sym,organize)
     end 
     if var =="food"
      food.push(todos[i][0])
      todo.store(var.to_sym,food)
 end
     puts todo


  


    





end 
