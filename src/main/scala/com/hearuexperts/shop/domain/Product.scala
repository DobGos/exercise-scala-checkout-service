package com.hearuexperts.shop.domain

/**
  * @author Dobromir Gospodinov
  * @date 01/03/17
  */
trait Product {
  def name: String
  def price: Long //in pence
}

case class Apple() extends Product {
  val name = "Apple"
  val price = 60L
}

case class Orange() extends Product {
  val name = "Orange"
  val price = 25L
}
