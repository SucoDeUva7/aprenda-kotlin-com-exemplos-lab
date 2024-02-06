// Playground: https://pl.kotl.in/fMbOvNuC2

enum class Nivel { BASICO, INTERMEDIARIO, AVANÇADO }

class Usuario(val nome: String) {
    fun exibirUsuario() {
        println("Usuario: $nome")
    }
}

data class ConteudoEducacional(val nome: String, val duracao: Int = 60)

data class Formacao(val nome: String, val nivel: Nivel, var conteudos: List<ConteudoEducacional>) {

    val inscritos = mutableListOf<Usuario>()
    
    fun matricular(usuario: Usuario) {
        inscritos.add(usuario)
        println("Usuario ${usuario.nome} foi matriculado na formação $nome.")
    }
        // TODO("Utilize o parâmetro $usuario para simular uma matrícula (usar a lista de $inscritos).")
    fun exibirFormacao() {
        println("Formação: $nome, Nivel: $nivel")
        println("Conteúdos:")
        conteudos.forEach { println("- ${it.nome}") }
        println("Inscritos: ${inscritos.size} alunos\n")
    }
}

fun main() {
    val formacaoKotlin = Formacao("Kotlin Basico", Nivel.BASICO, listOf(
    	ConteudoEducacional("introdução ao Kotlin"),
        ConteudoEducacional("POO com Kotlin"),
        ConteudoEducacional("Praticas Kotlin")
    ))
    
    //	val formacaoAndroid = Formacao("Android", Nivel.AVANÇADO, listOf(
    //		ConteudoEducacional("Aplicativos com Kotlin")
    //	))
    
    val usuario0 = Usuario("SucoDeUva")
    
    formacaoKotlin.matricular(usuario0)
    
    formacaoKotlin.exibirFormacao()
    usuario0.exibirUsuario()
    
   // TODO("Analise as classes modeladas para este domínio de aplicação e pense em formas de evoluí-las.")
   // TODO("Simule alguns cenários de teste. Para isso, crie alguns objetos usando as classes em questão.")
}
