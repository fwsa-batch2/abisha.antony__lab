# recipients = [
#     ["Srinath"],
#     ["Jadeja", "Kambli"],
#     ["Sachin", "Sidhu", "Kumble"]
#   ]

#   for i in 0...recipients.length do
#     Cur_item = recipients[i]
#     if Cur_item.length == 1
#        puts "Hello #{recipients[i][0]}"
#     elsif Cur_item.length == 2
#         puts "Hello #{recipients[i][0] } and #{recipients[i][1]}"
#     elsif Cur_item.length > 2
#        puts "Hello #{recipients[i][0]}, #{recipients[i][1]} and #{recipients[i][2]}"
#     end
#   end


  #function
def salute(a,b)
    arr = a.split(" ")
    lst = arr.last
    b = b.capitalize
    return "#{b} Mr. #{lst}"
end
 puts  salute("Nelson Rolihlahla Mandela", "hello")
 puts salute("Sir Alan Turing", "welcome")
