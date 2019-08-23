package com.training.project.service.model

import java.util.UUID

interface ProductEvent

data class ProductRegistered(val productId: UUID, val name: String, val price: Price) : ProductEvent
data class ProductDeregistered(val productId: UUID) : ProductEvent
data class ProductPriceIncreased(val productId: UUID, val price: Price, val oldPrice: Price) : ProductEvent
data class ProductPriceDecreased(val productId: UUID, val price: Price, val oldPrice: Price) : ProductEvent
data class ProductRenamed(val productId: UUID, val name: String, val oldName: String) : ProductEvent
data class ProductPriceSet(val productId: UUID, val price: Price, val oldPrice: Price) : ProductEvent



