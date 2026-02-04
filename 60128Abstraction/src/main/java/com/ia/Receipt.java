package com.ia;

import java.util.List;

//tuscias nes paveldes constructoriu
public record Receipt (String buyerName, List<ReceiptLine> lines, Money total){
}
