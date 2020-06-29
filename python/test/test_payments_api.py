# coding: utf-8

"""
    Blockchain.com Exchange REST API

    ## Introduction Welcome to Blockchain.com's Exchange API and developer documentation. These documents detail and give examples of various functionality offered by the API such as receiving real time market data, requesting balance information and performing trades. ## To Get Started Create or log into your existing Blockchain.com Exchange account Select API from the drop down menu Fill out form and click “Create New API Key Now” Once generated you can view your keys under API Settings   # noqa: E501

    The version of the OpenAPI document: 1.0.0
    Generated by: https://openapi-generator.tech
"""


from __future__ import absolute_import

import unittest

import openapi_client
from com.blockchain.exchange.rest.api.payments_api import PaymentsApi  # noqa: E501
from openapi_client.rest import ApiException


class TestPaymentsApi(unittest.TestCase):
    """PaymentsApi unit test stubs"""

    def setUp(self):
        self.api = com.blockchain.exchange.rest.api.payments_api.PaymentsApi()  # noqa: E501

    def tearDown(self):
        pass

    def test_create_withdrawal(self):
        """Test case for create_withdrawal

        Request a withdrawal  # noqa: E501
        """
        pass

    def test_get_account_by_type_and_currency(self):
        """Test case for get_account_by_type_and_currency

        Receive current account balances  # noqa: E501
        """
        pass

    def test_get_accounts(self):
        """Test case for get_accounts

        Receive current account balances  # noqa: E501
        """
        pass

    def test_get_deposit_address(self):
        """Test case for get_deposit_address

        Get a deposit address. Currently only crypto currencies are supported  # noqa: E501
        """
        pass

    def test_get_deposit_by_id(self):
        """Test case for get_deposit_by_id

        Get status about a deposit  # noqa: E501
        """
        pass

    def test_get_deposits(self):
        """Test case for get_deposits

        Get a list of deposits  # noqa: E501
        """
        pass

    def test_get_whitelist(self):
        """Test case for get_whitelist

        Get a list of all whitelisted withdrawal accounts  # noqa: E501
        """
        pass

    def test_get_whitelist_by_currency(self):
        """Test case for get_whitelist_by_currency

        Get a list of all whitelisted withdrawal accounts  # noqa: E501
        """
        pass

    def test_get_withdrawal_by_id(self):
        """Test case for get_withdrawal_by_id

        Get status about a withdrawal  # noqa: E501
        """
        pass

    def test_get_withdrawals(self):
        """Test case for get_withdrawals

        Get a list of withdrawals  # noqa: E501
        """
        pass


if __name__ == '__main__':
    unittest.main()