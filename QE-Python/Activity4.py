while True:
    p1=input("Enter P1:")
    p2=input("Enter P2:")

    if (p1=="rock" and p2=="scissors") or (p1=="scissors" and p2=="paper") or (p1=="paper" and p2=="rock"):
        print("Player 1 wins")
    elif (p2=="rock" and p1=="scissors") or (p2=="scissors" and p1=="paper") or (p2=="paper" and p1=="rock"):
        print("Player 2 wins")
    else:
        print("Draw")
    a=input("Do u want continue:(Yes/No)")
    if a!="Yes":
        print("Thanks!")
        break