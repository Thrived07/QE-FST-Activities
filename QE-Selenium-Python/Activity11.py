from selenium import webdriver

from selenium.webdriver.common.by import By
from selenium.webdriver.support.ui import WebDriverWait
from selenium.webdriver.support import expected_conditions as EC
from selenium.webdriver.common.action_chains import ActionChains

driver = webdriver.Firefox()
actions = webdriver.ActionChains(driver)

wait = WebDriverWait(driver, 10)

driver.get("https://training-support.net/webelements/dynamic-controls")

print(driver.title)

driver.find_element(By.ID, "checkbox")

toggleButton = driver.find_element(By.XPATH,"//button [contains(text(), 'Toggle Checkbox')]")

actions.click(toggleButton).perform()

wait.until(EC.invisibility_of_element_located ((By.ID, "checkbox")))

print("waited until checkbox was disappeared")

actions.click(toggleButton).perform()

wait.until(EC.visibility_of_element_located((By.ID, "checkbox")))

print("waited until checkbox was visible")
driver.quit()