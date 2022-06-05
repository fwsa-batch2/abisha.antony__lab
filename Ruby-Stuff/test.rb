@gender = "female"#instance variable
def meth 
   name = "abisha" #local variable runs inside the block
   _name = "ajay"

=begin
    puts name
   puts _name
=end
   
   $age = 18 #global variable - can access from anywere
   @@year = 2003 #class variable- accesible yo the whole class
end 
meth
puts $age
puts "#@@year" #calling class variable
puts @gender #calling instance variable

