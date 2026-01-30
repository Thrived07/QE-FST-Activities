import pandas as pd
df=pd.read_csv("users.csv")
print(df["Usernames"])
print(df.iloc[1])
print(df.sort_values("Usernames"))
print(df.sort_values("Passwords",ascending=False))