//Ejercicio1
def myMethod(datos: List[Double]): Double = {
  val logs = datos.map(math.log)
  val promedio = logs.sum / logs.length
  val sumaCuadrados = logs.map(l => math.pow(l - promedio, 2)).sum
  math.sqrt(sumaCuadrados / logs.length)
}
//Ejercicio 2
def impuesto12(precio: Double): Double =
    precio * 1.12
  def descuento10(precio: Double): Double =
    precio * 0.90
  def promoGrandesCompras(precio: Double): Double =
    if (precio > 100) precio * 0.80 else precio

//Ejercicio 3
def generadorIncrementador(incremento: Int): Int => Int = {
  (x: Int) => x + incremento