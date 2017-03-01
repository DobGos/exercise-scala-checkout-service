package com.hearuexperts.shop.service


import com.hearuexperts.shop.domain.Product

/**
  *
  * @author Dobromir Gospodinov
  * @date 01/03/17
  */
class CheckoutService {

  def calcTotalPrice(products: Seq[Product]): Long = {
    products.map((p) => p.price).sum
  }
}
