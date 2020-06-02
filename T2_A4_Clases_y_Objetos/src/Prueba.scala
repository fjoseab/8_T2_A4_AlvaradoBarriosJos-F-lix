class Paciente(var nombre : String, var primerAp : String, 
    var segundoAp : String,  var edad : Byte, var fecha: Array[String], 
    var hora: Array[String], var nivel : Array[Int], 
    var tem :Array[Double], var humedad: Array[Double]){
  
  
  
  def promedioNivelBienestar(nB:Array[Int]): Unit = {
    var aux = 0.0
     for(e <- 0 to nB.length-1){
       aux=aux+nB(e)
     }
    aux=aux/nB.length
    println("Promedio de bienestar: "+aux)
  }
  
  def tempMayor(t:Array[Double], nB:Array[Int], f:Array[String], ti:Array[String]): Unit = {
    var tmp = t(0) 
    var i = 0
    for(e <- 0 to t.length-1){
      if(t(e)>tmp){
        tmp=t(e)
        i=e
      }
    }
    println("Temperatura mayo registrada: "+tmp+" Nivel de binestar: "+nB(i)+" Hora registrada: "+ti(i)+" Fecha: "+f(i))
  }
  
  def tempMenor(t:Array[Double], nB:Array[Int], f:Array[String], ti:Array[String]): Unit = {
    var tmp = t(0) 
    var i = 0
    for(e <- 0 to t.length-1){
      if(t(e)<tmp){
        tmp=t(e)
        i=e
      }
    }
    println("Temperatura menor registrada: "+tmp+" Nivel de binestar: "+nB(i)+" Hora registrada: "+ti(i)+" Fecha: "+f(i))
  }
}


object Prueba {
  def main(args: Array[String]): Unit = {
    var p1 = new Paciente( "Jose",
                            "Felix",
                            "Alvarado",
                            21,
                            Array( "1/02/2020", "2/02/2020", "3/02/2020", "4/02/2020"),
                            Array( "13:20", "13:20", "13:20", "13:20"),
                            Array( 4, 1, 5, 5),
                            Array( 36.5, 36.8, 36.0, 36.3),
                            Array( 50.55, 60.03, 90.5, 88.8)
                          );
    println("Paciente: " +p1.nombre+" "+p1.primerAp+" "+p1.segundoAp)
    p1.promedioNivelBienestar(p1.nivel)
    p1.tempMayor(p1.tem, p1.nivel, p1.fecha, p1.hora)
    p1.tempMenor(p1.tem, p1.nivel, p1.fecha, p1.hora)
    
    println()
    var p2 = new Paciente( "Alguien",
                            "Llamado",
                            "Nada",
                            21,
                            Array( "1/02/2020", "2/02/2020", "3/02/2020", "4/02/2020"),
                            Array( "13:20", "13:20", "13:20", "13:20"),
                            Array( 4, 1, 5, 5),
                            Array( 36.5, 36.8, 36.0, 36.3),
                            Array( 50.55, 60.03, 90.5, 88.8)
                          );
    println("Paciente: " +p2.nombre+" "+p2.primerAp+" "+p2.segundoAp)
    p2.promedioNivelBienestar(p2.nivel)
    p2.tempMayor(p2.tem, p2.nivel, p2.fecha, p2.hora)
    p2.tempMenor(p2.tem, p2.nivel, p2.fecha, p2.hora)
    
    println()
    var p3 = new Paciente( "Otro",
                            "Alguien",
                            "Llamado",
                            21,
                            Array( "1/02/2020", "2/02/2020", "3/02/2020", "4/02/2020"),
                            Array( "13:20", "13:20", "13:20", "13:20"),
                            Array( 4, 1, 5, 5),
                            Array( 36.5, 36.8, 36.0, 36.3),
                            Array( 50.55, 60.03, 90.5, 88.8)
                          );
    println("Paciente: " +p3.nombre+" "+p3.primerAp+" "+p3.segundoAp)
    p3.promedioNivelBienestar(p3.nivel)
    p3.tempMayor(p3.tem, p3.nivel, p3.fecha, p3.hora)
    p3.tempMenor(p3.tem, p3.nivel, p3.fecha, p3.hora)
    
  }
}