import PySimpleGUI as psg

number = int(psg.popup_get_text("Enter a number: ", title="Textbox"))
product = number * 10
while product < 100:
    number = int(psg.popup_get_text("Enter a number: ", title="Textbox"))
    product = number * 10
psg.popup_ok(str(number) + " x 10 = " + str(product) )