#First create a file with name word.txt
with open("word.txt") as f:
    words = f.read().splitlines()
words.extend(["I", "a", ""])
print(words)

#python
