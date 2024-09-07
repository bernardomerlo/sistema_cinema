# Sistema de Gerenciamento de Sessões de Cinema
## Implemente as classes a seguir
### Classe Assento que tem o seguinte atributo:
- disponivel[ ][ ] → uma matriz booleana (5 filas e 4 lugares em cada fila) que armazena true se o assento está disponível e false se tiver sido vendido.
No mínimo o método:
- mostraLugares → que deve retornar um String contendo as informações da matriz disponivel da seguinte maneira: Se o assento estiver ocupado, coloque um X, se ele estiver vazio, deixe em branco, como mostrada abaixo:
| | | |
| X | | |

### Classe Seção que tem os seguintes atributos:
- de instância: nome do filme e horário da seção
- de classe : preço (50,00)
No mínimo os métodos:
- venda: recebe a fila e o assento. Se esse assento estiver desocupado, deve altera para ocupado e retornar true e, se o assento estiver ocupado retorna false.

### Classe cinema que contém o método main e um menu:
1 – Cadastrar
2 – Vender
3 – Sair
Cada opção do menu deve ser um método, exceto a opção 3. Assim, teremos pelo menos 2 métodos:
- Cadastrar: vai pedir ao usuário as informações de 5 seções e cadastrá-las.
- Venda: deve mostrar na tela todas as seções (nome do filme e horário). Assim, o usuário deve escolher a seção. Em seguida, deve mostrar na tela os lugares da seção, para que o usuário escolha a fila e o assento disponível para comprar. Então realiza a venda.
