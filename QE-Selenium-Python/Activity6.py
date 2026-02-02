from selenium import webdriver
from selenium.webdriver.common.by import By
with webdriver.Firefox() as driver:
    driver.get("https://training-support.net/webelements/dynamic-controls")
    print(driver.title)
    print(driver.find_element(By.XPATH,"//input[@id='checkbox']").is_selected())
    driver.find_element(By.XPATH,"//input[@id='checkbox']").click()
    print(driver.find_element(By.XPATH,"//input[@id='checkbox']").is_selected())
    driver.quit()