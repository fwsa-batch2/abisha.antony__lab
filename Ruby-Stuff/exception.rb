begin
    
raise
    arr = [1,2,3]
    puts arr[5]
rescue StandardError => e
    puts "error"
end