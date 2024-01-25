enum class Nivel { BÁSICO, INTERMEDIÁRIO, AVANÇADO }

class Usuario

data class Usuario(val nome: String, val email: String,  val duracao: Int = 60)
data class Formacao(val nome: String, val nivel: Nivel, val conteudos: List<ConteudoEducacional>) {

    val inscritos = mutableListOf<Usuario>()

    }
fun registrarUsuario(usuario: Usuario) {
    val inscritos = inscritos.add(usuario)
 
    println("Novo usuário: ${usuario.nome} adicionado com sucesso!")
}

fun novouruaio() {
     // Create a new user
    val usuario = Usuario("Katy Lopes", "katy@teste.com", "BÁSICO")

    // Register the new user
    registrarUsuario(usuario)
}

