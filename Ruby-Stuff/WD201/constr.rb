class Student
    def initialize(roll_no,name)
        @roll_no = roll_no
        @name = name
        @is_enrolled = false
    end
end
obj = Student.new(2,"abi")
puts Student.name