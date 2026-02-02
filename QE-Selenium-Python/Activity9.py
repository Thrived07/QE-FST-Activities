from selenium import webdriver
from selenium.webdriver.common.by import By
from selenium.webdriver.common.action_chains import ActionChains

driver = webdriver.Firefox()
builder = ActionChains(driver)

driver.get("https://training-support.net/webelements/keyboard-events")
print(driver.title)

builder.send_keys("Hello World").perform()

text = driver.find_element(By.XPATH, "//h1[contains(@class,'text-4xl')]").text
print("You typed:" + text)

driver.quit()