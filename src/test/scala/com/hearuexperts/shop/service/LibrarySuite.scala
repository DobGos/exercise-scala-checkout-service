package com.hearuexperts.shop.service

import com.hearuexperts.shop.domain.{Apple, Orange}
import org.scalatest.FunSuite

class CheckoutServiceTest extends FunSuite {

  test("calcTotalPrice returns the correct sum total for single orange") {
    // Given
    def checkoutService = new CheckoutService()

    val products = Seq(Orange())


    // When
    val result = checkoutService.calcTotalPrice(products)

    // Then
    assert(result == 25)
  }

  test("calcTotalPrice returns the correct sum total for single apple") {
    // Given
    def checkoutService = new CheckoutService()

    val products = Seq(Apple())


    // When
    val result = checkoutService.calcTotalPrice(products)

    // Then
    assert(result == 60)
  }

  test("calcTotalPrice returns the correct sum total for multiple products") {
    // Given
    def checkoutService = new CheckoutService()

    val products = Seq(Apple(), Apple(), Orange(), Apple())


    // When
    val result = checkoutService.calcTotalPrice(products)

    // Then
    assert(result == 205)
  }
}
