package geronimo.don.exercicio2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

//Esse programa recebe o ponto inicial, a direçao da reta e a quantidade de vezes que é para avançar e executa n vezes
//onde n é a quantidade de vezes que é para avançar e depois mostra a posição do ponto calculado. Ou seja, ele calcula
//a equaçào paramétrica da reta para n pontos e imprime esses pontos.
//Se o ponto inicial for (1,1,1), a direção (1,0,0) e o numero de vezes 3 tem que mostrar na parte de baixo (1,1,1), (2,1,1),
//(3,1,1), baseado na equação P = P0 + aV;

class Ponto(val x:Float, val y:Float, val z:Float); //Questoes. Por que float? O que está acontecendo aqui?
class MainActivity : AppCompatActivity() {
    fun calcularPonto(p0:Ponto, v:Ponto, i:Int):Ponto{
        return Ponto(p0.x + i * v.x, p0.y + i * v.y, p0.z + i * v.z)//Questão: Por que está com erro aqui? E o que está acontecendo aqui?
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        this.btnGo.setOnClickListener(::iniciarCalculo)
    }

    fun iniciarCalculo(v: View){
        //Questão: como pegar o P0 informado pelo usuário?
        //Questão: como pegar o V informado pelo usuário?
        //Questão: como avisar pro usuário caso esteja faltando dados?
        //Questão: como pegar o numero de vezes que é para executar?
        //Questão: O código abaixo mostra como por quebra de linha no texto. Como fazer um for que use os dados informados,
        //a função calcularPonto e ponha os pontos na tela?
        txtResultados.setText("aaaaa \n bbbbb")
    }
}
