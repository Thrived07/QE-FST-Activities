from selenium import webdriver
from selenium.webdriver.common.by import By
from selenium.webdriver.common.action_chains import ActionChains

driver = webdriver.Firefox()
actions=webdriver.ActionChains(driver)
driver.get("https://training-support.net/webelements/drag-drop")
print(driver.title)

ball = driver.find_element(By.ID, "ball")
d1 = driver.find_element(By.ID, "dropzone1")
d2 = driver.find_element(By.ID, "dropzone2")

actions = ActionChains(driver)

actions.drag_and_drop(ball, d1).perform()
if (driver.find_element(By.XPATH, "//*[@id='dropzone1']/span").text == "Dropped!"):
    print("Dropped in dropzone1")

actions.drag_and_drop(ball, d2).perform()
if (driver.find_element(By.XPATH, "//*[@id='dropzone2']/span").text == "Dropped!"):
    print("Dropped in dropzone2")

driver.quit()




