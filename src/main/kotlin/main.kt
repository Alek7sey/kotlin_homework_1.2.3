import kotlin.math.roundToInt

val discount = 100
val discountPerc = 0.05
val discountReg = 0.01

fun main() {
    calculationPrice(false, 1000)
    calculationPrice(true, 1000)
    calculationPrice(false, 10_000)
    calculationPrice(true, 10_000)
    calculationPrice(false, 20_000)
    calculationPrice(true, 20_000)

}

fun calculationPrice(regular: Boolean, purchase: Int) {
    var result = 0

    if (purchase <= 1_000) {
        result = purchase
    } else if (purchase <= 10_000) {
        result = purchase - discount
    } else {
        result = (purchase * (1 - discountPerc)).roundToInt()
    }
    if (regular) {
        result = (result * (1 - discountReg)).roundToInt()
        println("Клиент постоянный. Сумма покупки $purchase руб. Сумма к оплате $result руб.")
    } else {
        println("Сумма покупки $purchase руб. Сумма к оплате $result руб.")
    }
}
