def solution(my_string):
    regex = "a,e,i,o,u" 
    for i in regex:
        my_string = my_string.replace(i,"") 
    return my_string
