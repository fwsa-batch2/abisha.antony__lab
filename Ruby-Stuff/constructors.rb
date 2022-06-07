class Construct 

    def initialize
        @inst_1 = "fwsa"
        @inst_2 = "abisha"
    end

    def meth
        puts "I am studying in #{@inst_1}"
        puts "My name is #{@inst_2}"
    
    end
end

obj = Construct.new
obj.meth()