from tkinter import *

window = Tk()
img_gua0 = PhotoImage(file = 'guaImage/01.png')
img_gua1 = PhotoImage(file = 'guaImage/02.png')

# widgets
imgBtn0 = Button(window, image=img_gua0)
imgBtn1 = Button(window, image=img_gua1)

txtGua = Text(window, height=5, width=50)

runBtn = Button(window)

# layout design
imgBtn0.grid(row = 1, column = 1)
imgBtn1.grid(row = 1, column = 2)

txtGua.grid(row=2, column=1, columnspan=2)

runBtn.grid(row = 3, column=1, columnspan=2)

# properties
window.title('I Ching Reader')
# window.geometry('300x600')
window.resizable(0, 0)
runBtn.configure(text = "Bu Gua")

# initial states 

# dynamic functions
def runGua():
    print('another gua ?') 

# link to button
runBtn.configure(command=runGua)

# show the text
txtGua.insert(END, "this will show the gua chi")

# window looping
window.mainloop()