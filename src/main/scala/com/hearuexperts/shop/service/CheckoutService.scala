package com.hearuexperts.shop.service

/**
  *
  * @author Dobromir Gospodinov
  * @date 01/03/17
  */
class CheckoutService {
  def calcTotalPrice(products: Seq[String]): Long = {
    products.groupBy[String](identity).mapValues(_.size)
      .map((entry) => {
        entry._1 match {
          case "Apple" => applyBuyOneGetOneFreePromo(60, entry._2)
          case "Orange" => applyThreeForTwoPromo(25, entry._2)
        }
      })
      .sum
  }

  private def applyBuyOneGetOneFreePromo(singleItemPrice: Long, count: Int): Long = {
    (count / 2 * singleItemPrice) + (count % 2 * singleItemPrice)
  }

  private def applyThreeForTwoPromo(singleItemPrice: Long, count: Int): Long = {
    (count / 3 * (2 * singleItemPrice)) + (count % 3 * (2 * singleItemPrice))
  }

}
