A ideia da atividade é fazer uma simulação do lançamento de um projétil com o objetivo de atingir um determinado
alvo. Essa aplicação pode ser observada em um lançamento de uma bala de canhão, na qual para acertar o alvo é
necessário definir o ângulo de inclinação do canhão, a velocidade inicial que a bala deve ser lançada e a aceleração.
Espera-se com esse programa obter o alcance horizontal, o tempo do trajeto e a altura máxima atingida pela bala.
A altura máxima pode ser calculada utilizando a seguinte fórmula:

(1)
O tempo do trajeto é calculado pela fórmula:

(2)
A fórmula do alcance horizontal é:

(3)
Deve-se solicitar ao usuário, após os cálculos, a distância em que se encontra o alvo e o tamanho do alvo. O alvo
sempre está no chão e não tem nenhuma altura. O programa deverá informar se o alvo foi atingido, ou se a bala caiu
antes ou se caiu depois do alvo. Deve-se imprimir também a altura máxima atingida pela bala, o tempo do trajeto e o
alcance horizontal da bala.

Regras e restrições

Para o correto desenvolvimento do lançador de projéteis algumas regras e restrições devem ser cumpridas:

1. A tela de início do programa deve apresentar o nome completo e o RA de cada integrante do grupo!

2. A velocidade inicial deve ser positiva. Caso seja digitado um valor negativo ou zero, o programa deverá
solicitar um novo valor.

3. A aceleração do projétil é igual à aceleração da gravidade. Utilizar a constante 9,81m/s2

4. O ângulo do canhão deverá ser maior que zero e menor do que 90 graus. Caso seja digitado um valor fora
desse intervalo, o programa deverá solicitar um novo valor. O ângulo deverá ser digitado em graus. Fazer
a conversão para radianos (Math.toRadians()) para utilizar os métodos que calculam seno (Math.sin()) e
cosseno (Math.cos()). Pesquisar na web para ver exemplos.

5. A distância deverá ser maior do que zero. Caso seja digitado um valor menor ou igual a zero, o programa
deve solicitar um novo valor.

6. O alvo não pode ter tamanho menor que 20 e maior do que 50. O programa deve validar essa entrada
também e somente prosseguir a execução, se for um valor válido

7. Para qualquer uma das regras listadas, o programa não pode ser finalizado. O programa deve fazer as
validações de entrada e somente prosseguir quando os dados de entrada forem válidos

8. Pode utilizar o conceito de funções - pesquisar nos livros de referência
Entregáveis

O trabalho deve ser desenvolvido em grupos de no máximo 5 alunos.
O trabalho deve ser entregue até as 23:59 do dia 18/11/2020
Cada membro do grupo deve realizar a entrega do projeto compactado, no formato ZIP, pelo Blackboard.

AVALIAÇÃO
A avaliação das APS será baseada em um padrão de correção conhecido como autoavaliação, que confere ao estudante o
poder de assumir o controle e acompanhamento de sua própria aprendizagem, o estudante desenvolverá sua autonomia
pedagógica, bem como uma competência profissional bastante exigida no mercado: aprender a desenvolver-se. A nota
atribuída pelos estudantes irá compor a nota N2.
#   P r o j e t o _ D D T a n k  
 