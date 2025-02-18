import time
import tkinter as tk

root = tk.Tk()

root.title("REMINDER FOR SRINADH !")
root.state("zoomed")

class BreakReminder:
    def display(self):
        banner = tk.Label(root,text="Take Break Srinadh!",font=("Arial",50,"bold italic"))
        banner.grid(row=0,column=0,pady=100)


instance = BreakReminder()

instance.display()