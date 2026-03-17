from os import system
# Lista das tarefas armazenadas
Lista = []

# Loop principal do programa
while True:

    try:
        # Exibir o menu de opções
        print("="*20 + "\n        Menu: \n" + "="*20 +
            "\n1. Adicionar tarefa" +
            "\n2. Listar tarefas" +
            "\n3. Sair")
        
        # Solicitar a escolha do usuário
        escolha = input("Escolha uma opção: ")

        # Verificar a escolha do usuário
        match escolha:
            case "1":
                system('cls')
                # Solicitar a descrição da tarefa
                tarefa = input("Digite a descrição da tarefa: ")

                if tarefa.strip() == "":
                    system('cls')
                    print("A descrição da tarefa não pode ser vazia. Tente novamente.")
                    continue
                else:
                    system('cls')
                    # Adicionar a tarefa à lista
                    Lista.append(tarefa)
                    print("Tarefa adicionada com sucesso!")

            case "2":
                # Verificar se a lista de tarefas está vazia
                if not Lista:
                    system('cls')

                    print("Nenhuma tarefa cadastrada.")
                else:
                    system('cls')
                    # Exibir as tarefas cadastradas
                    print("Tarefas cadastradas:")
                    for index, tarefa in enumerate(Lista, start=1):
                        print(f"{index}. {tarefa}")

            case "3":
                system('cls')
                # Sair do programa
                print("Saindo do programa. Até mais!\n\n")
                break

            case _:
                system('cls')
                # Opção inválida
                print("Opção inválida. Por favor, escolha uma opção válida.")
    except Exception as e:
        system('cls')
        print(f"Ocorreu um erro: {e}. Tente novamente.\n\n")

