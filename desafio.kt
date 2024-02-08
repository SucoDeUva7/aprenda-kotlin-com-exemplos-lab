enum class Nivel { BASICO, INTERMEDIARIO, AVANCADO }

class Usuario(val nome: String) {
    fun exibirUsuario() {
        println("Usuário: $nome")
    }
}

data class ConteudoEducacional(val nome: String, val duracao: Int = 60)

class Formacao(val nome: String, val nivel: Nivel, private val conteudos: List<ConteudoEducacional>) {

    private val inscritos = mutableListOf<Usuario>()

    fun matricular(usuario: Usuario) {
        inscritos.add(usuario)
        println("Usuário ${usuario.nome} foi matriculado na formação $nome.")
    }

    fun exibirFormacao() {
        println("Formação: $nome, Nível: $nivel")
        println("Conteúdos:")
        conteudos.forEach { println("- ${it.nome}") }
        println("Inscritos: ${inscritos.size} alunos\n")
    }

    // Implemente outras funcionalidades necessárias
}

fun main() {
    val formacaoKotlin = Formacao("Kotlin", Nivel.BASICO, listOf(
        ConteudoEducacional("Introdução ao Kotlin"),
        ConteudoEducacional("POO com Kotlin"),
        ConteudoEducacional("Práticas Kotlin")
    ))

    val usuario0 = Usuario("SucoDeUva")

    usuario0.exibirUsuario()
    formacaoKotlin.matricular(usuario0)
    formacaoKotlin.exibirFormacao()

    // Implemente cenários de teste e outras funcionalidades conforme necessário
}
