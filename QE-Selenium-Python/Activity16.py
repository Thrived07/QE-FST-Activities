from selenium import webdriver
from selenium.webdriver.common.by import By
from selenium.webdriver.support.ui import Select

driver = webdriver.Firefox()
driver.get("https://training-support.net/webelements/selects")
print(driver.title)
single_select_element = driver.find_element(By.TAG_NAME, "select")
single_select = Select(single_select_element)
single_select.select_by_visible_text("Two")
single_select.select_by_index(2)
single_select.select_by_value("four")
print("All options in Single Select:")
options = single_select.options
for option in options:
    print(option.text)
driver.quit()