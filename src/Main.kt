package src

fun main(){
    val estudiante = Estudiante("Piqué", 12, "21345", "6º A", 5.66)
    val profesor = Profesor("José Antonio", 49, "91037", "Historia", 20)

    estudiante.mostrarRol()
    estudiante.mostrarCalificacion()
    profesor.mostrarRol()
    profesor.mostrarAniosExp()

}