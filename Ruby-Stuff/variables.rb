class Variables
   $globaal = "global_variable" # global variable - can access anywere in the program
   @@class_variable = "class_variable" #declaring class var (inside the class outside the method)

   def var #local variable - can access within thr block
      local = "local_variables"
      puts local
      
      @ins_var = "instance_variable" #declaring instance variable
      puts  @ins_var
   end
   puts @@class_variable #access class 

end
  obj = Variables.new # accesing local variable
  obj.var

  
  puts $globaal #accessing global variable

  
 


