# this program will simulate how to choose 6 'yao' in i-ching

import random
from gua64keys import *
from readGua import *
from tkinter import *

# there are 50 straws / sticks in original boundle
boundleA = [x + 1 for x in range(50)]

# remove one straw
boundleA.pop()

## select first division
diff = [1, 2, 3, 4] # differences in numbers of two sides

## it takes 6 times to get a 'gua'

def divider(boundle, diffs = diff):
    """ This function simulate the divide and count the 
        the number of group of four straws to represent
        the number of straws left after one division.
    """
    divide_first = len(boundle) // 2 + random.choice(diffs)

    divide_first_1 = boundle[:divide_first]
    divide_first_2 = boundle[divide_first:]

    divide_first_1.pop()

    # simulate how to divide further the small boundles
    # into groups of 4 straws
    remainder1 = len(divide_first_1) % 4

    if  remainder1 == 0:
        for i in range(4):
            divide_first_1.pop()

    else:
        for i in range(remainder1):
            divide_first_1.pop()

    # choose the other part of the small boundle
    remainder2= len(divide_first_2) % 4
    if  remainder2 == 0:
        for i in range(4):
            divide_first_2.pop()

    else:
        for i in range(remainder2):
            divide_first_2.pop()

    divide_second = divide_first_1 + divide_first_2
    return divide_second


def buYao(boundle):
    
    part1 = divider(boundle)
    part2 = divider(part1) 
    part3 = divider(part2)

    return len(part3) // 4

# print(buYao(boundleA))
# divider(divider(divider(boundleA)))

## to simulate how to get a 'gua' which have 6 'yao'
# transform the 'gua' to '0 1 0 1 1 1' format
def change(num):
    if num % 2 == 1:
        return 1
    else:
        return 0

def runGua():
    print('another gua ?') 
    gua = [] 
    for i in range(6):
        yao = buYao(boundleA)
        gua.append(yao)

    gua_yin_yang = list(map(change, gua))

    print(str(gua_yin_yang))

    ## to define a dictionary to map the 'gua yin yang' to number of 'gua'
    # print(gua_dict['[1, 1, 1, 0, 1, 0]'])
    filepath = 'guaText/' + gua_dict[str(gua_yin_yang)]
    return filepath
## print text for the 'gua'

## GUI interface for gua and text

window = Tk()
img_gua0 = PhotoImage(file = 'guaImage/01.png')
img_gua1 = PhotoImage(file = 'guaImage/02.png')

# widgets
imgBtn0 = Button(window, image=img_gua0)
imgBtn1 = Button(window, image=img_gua1)

txtGua = Text(window, height=20, width=50)

runBtn = Button(window)
soundBtn = Button(window)

# layout design
imgBtn0.grid(row = 1, column = 1)
imgBtn1.grid(row = 1, column = 2)

txtGua.grid(row=2, column=1, columnspan=2)

runBtn.grid(row = 3, column=1, columnspan=2)

soundBtn.grid(row = 4, column=1, columnspan=2)

# properties
window.title('I Ching Reader')
# window.geometry('300x600')
window.resizable(0, 0)
runBtn.configure(text = "Bu Gua")
soundBtn.configure(text="Listen")

# initial states 

# dynamic functions

# show the text
def printGua():
    global filepath
    filepath = runGua()
    f = open(filepath, "r")
    txtGua.insert('end', '\n\n')
    for line in f:
        txtGua.insert('end', line)
        # readYao(line)
    f.close()

def listenGua():
    # filepath = runGua()
    f = open(filepath, "r")
    for line in f:
        readYao(line)
    f.close()

# link to button
runBtn.configure(command=printGua)
soundBtn.configure(command=listenGua)

# window looping
window.mainloop()