class Inherit

    def meth
        puts "abi"
    end
    
end
class Tance < Inherit
    def meth1
        puts "girl"
    end

end
obj = Tance.new
obj.meth1
obj.meth
