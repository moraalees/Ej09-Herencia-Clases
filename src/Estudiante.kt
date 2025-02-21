package src

class Estudiante(nombre: String, edad: Int, id: String, val curso: String, val calificacionpromedio: Double): Persona(nombre, edad, id) {

    override fun mostrarRol() {
        println("$nombre es un estudiante.")
    }

    fun mostrarCalificacion(){
        println("$nombre tiene de nota promedio $calificacionpromedio.")
    }

}