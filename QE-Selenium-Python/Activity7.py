from selenium import webdriver
from selenium.webdriver.common.by import By
with webdriver.Firefox() as driver:
    driver.get("https://training-support.net/webelements/dynamic-controls")
    print(driver.title)
    print(driver.find_element(By.XPATH,"//input[@id='textInput']").is_enabled())
    driver.find_element(By.XPATH,"//button[contains(@id,'textInputButton')]").click()
    print(driver.find_element(By.XPATH,"//input[@id='textInput']").is_enabled())
    driver.quit()