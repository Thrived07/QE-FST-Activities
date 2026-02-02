from selenium import webdriver
from selenium.webdriver.support.ui import WebDriverWait
from selenium.webdriver.common.by import By
from selenium.webdriver.common.action_chains import ActionChains
from selenium.webdriver.support import expected_conditions as EC
with webdriver.Firefox() as driver:
    wait = WebDriverWait(driver,10)
    driver.get("https://training-support.net/webelements/dynamic-attributes")
    print(driver.title)
    action = webdriver.ActionChains(driver)
    name_el = driver.find_element(By.XPATH,"//input[starts-with(@id,'full-name-') and starts-with(@name,'full-name-')]").send_keys("Thrived")
    email_el=driver.find_element(By.XPATH,"//input[(@type='email') and contains(@class,'focus:ring-0 svelte-7bqce9')]").send_keys("thrived@gmail.com")
    date_el=driver.find_element(By.XPATH,"//input[(@type='date') and contains(@name,'event-date')]").send_keys("2026-02-13")
    textarea_el =driver.find_element(By.XPATH,"//textarea[(contains(@name,'additional-details')) and (contains(@id,'additional-details'))]").send_keys("Hi Iam Here")
    submit_btn = driver.find_element(By.XPATH,"//button[contains(text(),'Submit')]").click()
    wait.until(EC.visibility_of_element_located((By.XPATH,"//h3[@id='action-confirmation']")))
    result = driver.find_element(By.XPATH,"//h3[@id='action-confirmation']")
    print(result.text)