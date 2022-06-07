module Mod1
     def meth
        for i in 1..9  do
            puts i
        end
     end 
end
include Mod1
Mod1::meth