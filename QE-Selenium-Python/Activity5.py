from selenium import webdriver
from selenium.webdriver.common.by import By
from selenium.webdriver.support.ui import WebDriverWait
from selenium.webdriver.support import expected_conditions as EC

driver = webdriver.Firefox()
wait = WebDriverWait(driver, 10)

driver.get("https://training-support.net/webelements/dynamic-controls")
print(driver.title)

print(driver.find_element(By.XPATH, "//*[@id='checkbox']").is_displayed())

driver.find_element(
    By.XPATH, "/html/body/div/main/div/div/div/div/div[2]/section[1]/button"
).click()

wait.until(EC.invisibility_of_element_located((By.XPATH, "//*[@id='checkbox']")))
print("False")

driver.quit()