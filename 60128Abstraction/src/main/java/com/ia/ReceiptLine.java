package com.ia;

public record ReceiptLine (String productName, int qty, Money unitPrice, double discount, Money LineTotal){
}
