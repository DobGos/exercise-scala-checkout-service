package com.hearuexperts.shop.service

import org.scalatest.FunSuite

class CheckoutServiceTest extends FunSuite {

  test("calcTotalPrice returns the correct sum total for single orange") {
    // Given
    def checkoutService = new CheckoutService()

    val products = Seq("Orange")


    // When
    val result = checkoutService.calcTotalPrice(products)

    // Then
    assert(result == 25)
  }

  test("calcTotalPrice returns the correct sum total for single apple") {
    // Given
    def checkoutService = new CheckoutService()

    val products = Seq("Apple")


    // When
    val result = checkoutService.calcTotalPrice(products)

    // Then
    assert(result == 60)
  }

  test("calcTotalPrice returns the correct sum total for two apples") {
    // Given
    def checkoutService = new CheckoutService()

    val products = Seq("Apple", "Apple")


    // When
    val result = checkoutService.calcTotalPrice(products)

    // Then
    assert(result == 60)
  }

  test("calcTotalPrice returns the correct sum total for more than two apples") {
    // Given
    def checkoutService = new CheckoutService()

    val products = Seq("Apple", "Apple", "Apple")


    // When
    val result = checkoutService.calcTotalPrice(products)

    // Then
    assert(result == (60 + 60))
  }

  test("calcTotalPrice returns the correct sum total for three oranges") {
    // Given
    def checkoutService = new CheckoutService()

    val products = Seq("Orange", "Orange", "Orange")


    // When
    val result = checkoutService.calcTotalPrice(products)

    // Then
    assert(result == (25 + 25))
  }

  test("calcTotalPrice returns the correct sum total for more than three oranges") {
    // Given
    def checkoutService = new CheckoutService()

    val products = Seq("Orange", "Orange", "Orange", "Orange", "Orange")


    // When
    val result = checkoutService.calcTotalPrice(products)

    // Then
    assert(result == (25 + 25 + 25 + 25))
  }

  test("calcTotalPrice returns the correct sum total for multiple apples and oranges") {
    // Given
    def checkoutService = new CheckoutService()

    val products = Seq("Apple", "Orange", "Apple", "Orange", "Orange")


    // When
    val result = checkoutService.calcTotalPrice(products)

    // Then
    assert(result == (60 + 25 + 25))
  }
}
