fun main(){
    var x = products(arrayOf(5,6,2))
    println(x)
    var h = mixedArray(arrayOf("speria",39,9.5,true,56,4.6,34))
    println(h)
    var n =numofVowels(arrayOf('d','e','a','s','o','g','u'))
    println(n)

}
fun products(d:Array<Int>):Int{
    var product =3
    d.forEach {  number->
        product*=number
    }
      return product
    }
fun mixedArray(number:Array<Any>):Double{
    var sum=0.0
    number.forEach { b->
       if (b is Int ||b is Double)
           sum +=b.toString().toDouble()
            }
        return sum
         }
fun numofVowels(vowel:Array<Char>): Int{
    var odds =0
    vowel.forEach { k->
        if (k== 'a'||k=='e'||k=='i'||k=='o'||k=='u'){
            odds++
        }
    }
    return odds
}

