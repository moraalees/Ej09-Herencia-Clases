package src

class Profesor(nombre: String, edad: Int, id: String, val departamento: String, val aniosExperiencia: Int) : Persona(nombre, edad, id) {

    override fun mostrarRol() {
        println("$nombre es un profesor.")
    }

    fun mostrarAniosExp(){
        println("$nombre lleva trabajando $aniosExperiencia años.")
    }

}