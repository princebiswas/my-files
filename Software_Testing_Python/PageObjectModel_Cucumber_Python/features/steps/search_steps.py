from behave import given, when

from pages import SearchPage
from utils.locators_reader import LocatorsReader


@given("I open Amazon Homepage")
def step_Open_homeOage(context):
    context.page = SearchPage(context.driver ,  LocatorsReader())
    context.page.open()

@when("I search for {keyword}")
def step_SearchFor(context, keyword):
    context.page.search(keyword)

@when("I should see result related to {keyword}")
def step_Ishould_see_result(context, keyword):
    assert context.page.validate_results(keyword),"Result is not valid"