from selenium import webdriver
from selenium.webdriver.common.by import By

driver = webdriver.Firefox()
driver.get("https://training-support.net/webelements/tables") 
print(driver.title)
rows=driver.find_elements(By.XPATH,"//table/tbody/tr")
print(len(rows))
cols=driver.find_elements(By.XPATH,"//table/thead/tr/th")
print(len(cols))
book=driver.find_element(By.XPATH,"//table/tbody/tr[5]/td[2]")
print(book.text)
price_header=driver.find_element(By.XPATH,"//table/thead/tr/th[contains(text(),'Price')]").click()
book_af_sort=driver.find_element(By.XPATH,"//table/tbody/tr[5]/td[2]")
print(book_af_sort.text)
driver.quit()
