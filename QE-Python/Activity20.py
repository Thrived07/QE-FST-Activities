import pandas as pd
df=pd.read_excel("contacts.xlsx")
rows,columns=df.shape
print("Number of Rows:",rows)
print("Number of Columns:",columns)
print(df["Email"])
print(df.sort_values("FirstName"))