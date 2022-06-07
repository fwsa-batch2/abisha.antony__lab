class Demo

    def initialize(id,name,addr)
        @stud_id = id
        @stud_name = name
        @stud_addr = addr
    end

    def details()
        puts "student_id: #{@stud_id}"
        puts "student_name:#{@stud_name}"
        puts "student_address:#{@stud_addr}"
    end

    stud1 = Demo.new(1,"abi","tirunelveli")
    stud2 = Demo.new(2,"santa","theni")

    stud1.details()
    stud2.details()
end