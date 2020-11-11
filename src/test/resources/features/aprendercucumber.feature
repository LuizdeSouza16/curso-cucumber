# language : pt

Funcionalidade: aprender Cucumber
	Como um aluno
	Eu quero aprender a utilizar Cucumber
	Para que eu possa automatizar critérios de aceitação

@esse
Cenário: Deve executar especificação
	Dado que criei um arquivo corretamente
	Quando executá-lo
	Então a especificação deve finalizar com sucesso
	
Cenário: Deve incrementar um contatos
	Dado que o valor do contador é 15
	Quando eu incrementar em 3
	Então o valor do contador será 18
	
Cenário: Deve incrementar um contatos
	Dado que o valor do contador é 123
	Quando eu incrementar em 35
	Então o valor do contador será 158
	
Cenário: Deve entregar o prazo na entrega
	Dado que a entrega é dia 05/04/2018
	Quando a entrega atrasar em 2 dias
	Então a entrega será efetuada em 07/04/2018 
	
Cenário: Deve entregar o prazo na entrega da China
	Dado que a entrega é dia 05/04/2018
	Quando a entrega atrasar em 2 meses
	Então a entrega será efetuada em 05/06/2018 
	
Cenário: Deve criar steps genéricos para esses passos
	Dado que o ticket é AF345
	E que o valor da paassagem é R$ 230,45
	E que o nome do passageiro é "Fulano da Silva"
	E que o telefone do passageiro é 9999-9999
	Quando criar os steps
	Então o teste vai passar
	
Cenário: Deve reaproveitar os steps "Dado" do cenário anterior
	Dado que o ticket é AB127
	E que o ticket especial é AB127
	E que o valor da paassagem é R$ 1230,45
	E que o nome do passageiro é "Ciclano de Oliveira"
	E que o telefone do passageiro é 9999-9999

@ignore	
Cenário: Deve negar todos os steps "Dado" do cenário anteriores
	Dado que o ticket é CD123
	Dado que o ticket especial é AG1234
	Dado que o valor da paassagem é R$ 1.230,45
	Dado que o nome do passageiro é "Beltrano Souza Matos de Alcantarâ Azevedo"
	Dado que o telefone do passageiro é 1234-5678
	Dado que o telefone do passageiro é 999-2223
