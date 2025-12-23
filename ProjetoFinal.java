import java.util.Scanner;

public class ProjetoFinal {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int opcao;

        String nomeCompleto = "";
        String nome = "";
        String gmail = "";
        String dominioGmail = "";
        int idade = 0;

        do {
            System.out.println("===========================================");
            System.out.println("         SISTEMA DE CADASTRO DE USUÁRIOS   ");
            System.out.println("===========================================");
            System.out.println("1 - Cadastrar novo usuário");
            System.out.println("2 - Listar usuários cadastrados");
            System.out.println("3 - Buscar usuário por email");
            System.out.println("4 - Estatísticas");
            System.out.println("5 - Sair");
            System.out.println("===========================================\n");
            System.out.print("Escolha uma opção: ");
            opcao = leitor.nextInt();
            leitor.nextLine();

            switch (opcao) {
                case 1:
                    System.out.println("\n=== CADASTRO DE USUÁRIO ===");

                    // Nome
                    System.out.print("Digite seu nome completo: ");
                    nomeCompleto = leitor.nextLine();
                    int pos = nomeCompleto.indexOf(" ");
                    while (pos == -1) {
                        System.out.println("Nome inválido. O nome deve conter pelo menos um espaço.");
                        System.out.print("Digite seu nome completo novamente: ");
                        nomeCompleto = leitor.nextLine();
                        pos = nomeCompleto.indexOf(" ");
                    }
                    System.out.println("Nome cadastrado com sucesso!");
                    System.out.println("--------------------------");

                    // Email
                    System.out.print("Digite seu email: ");
                    gmail = leitor.nextLine();
                    int posGmail = gmail.indexOf("@");
                    int posPonto = gmail.indexOf(".");
                    while (posGmail == -1 || posPonto == -1 || posGmail > posPonto) {
                        System.out.println("Email inválido. Certifique-se de incluir '@' e '.' no email.");
                        System.out.print("Digite seu email novamente: ");
                        gmail = leitor.nextLine();
                        posGmail = gmail.indexOf("@");
                        posPonto = gmail.indexOf(".");
                    }
                    System.out.println("Email cadastrado com sucesso!");
                    System.out.println("--------------------------");

                    // Idade
                    System.out.print("Digite sua idade: ");
                    idade = leitor.nextInt();
                    while (!(idade >= 18 && idade <= 120)) {
                        System.out.println("Idade inválida. Você deve ter entre 18 e 120 anos.");
                        System.out.print("Digite sua idade novamente: ");
                        idade = leitor.nextInt();
                    }
                    System.out.println("Idade registrada com sucesso!");
                    System.out.println("--------------------------");

                    leitor.nextLine();

                    // Senha
                    System.out.print("Defina sua senha (6 caracteres): ");
                    String senha = leitor.nextLine();
                    while (senha.length() != 6) {
                        System.out.println("Senha inválida. A senha deve ter exatamente 6 caracteres.");
                        System.out.print("Defina sua senha corretamente: ");
                        senha = leitor.nextLine();
                    }
                    System.out.println("Senha cadastrada com sucesso!");
                    System.out.println("==========================\n");

                    // Processar nome e domínio
                    nome = nomeCompleto.substring(0, nomeCompleto.indexOf(" "));
                    dominioGmail = gmail.substring(gmail.indexOf("@") + 1);

                    // Exibir dados do usuário
                    System.out.println("=== DADOS DO USUÁRIO ===");
                    System.out.println("Nome completo: " + nomeCompleto);
                    System.out.println("Primeiro nome: " + nome);
                    System.out.println("Email: " + gmail);
                    System.out.println("Domínio do email: " + dominioGmail);
                    System.out.println("Idade: " + idade);
                    System.out.println("Senha: " + senha);
                    System.out.println("==========================\n");

                    System.out.println("Pressione Enter para continuar...");
                    leitor.nextLine();
                    break;

                case 2:
                    System.out.println("\n=== USUÁRIO CADASTRADO ===");
                    System.out.println("Nome completo: " + nomeCompleto.toUpperCase());
                    System.out.println("Primeiro nome: " + nome.toUpperCase());
                    System.out.println("Email: " + gmail.toLowerCase());
                    System.out.println("Domínio do email: " + dominioGmail.toLowerCase());
                    System.out.println("Idade: " + idade);
                    System.out.println("==========================\n");
                    System.out.println("Pressione Enter para continuar...");
                    leitor.nextLine();
                    break;

                case 3:
                    System.out.println("\n=== BUSCAR USUÁRIO POR EMAIL ===");
                    System.out.print("Digite o email: ");
                    String emailDigitado = leitor.nextLine();
                    if (emailDigitado.equalsIgnoreCase(gmail)) {
                        System.out.println("=== USUÁRIO ENCONTRADO ===");
                        System.out.println("Nome completo: " + nomeCompleto.toUpperCase());
                        System.out.println("Primeiro nome: " + nome.toUpperCase());
                        System.out.println("Email: " + gmail.toLowerCase());
                        System.out.println("Domínio do email: " + dominioGmail.toLowerCase());
                        System.out.println("Idade: " + idade);
                        System.out.println("==========================\n");
                    } else {
                        System.out.println("Usuário não encontrado!\n");
                    }
                    System.out.println("Pressione Enter para continuar...");
                    leitor.nextLine();
                    break;

                case 4:
                    System.out.println("\n=== ESTATÍSTICAS ===");
                    System.out.println("Quantidade de caracteres do nome (incluindo espaços): " + nomeCompleto.length());
                    System.out.println("Quantidade de caracteres do email: " + gmail.length());
                    System.out.println("Primeira letra do nome: " + nomeCompleto.substring(0, 1));
                    if (idade >= 18) {
                        System.out.println("Você é maior de idade: " + idade + " anos");
                    } else {
                        System.out.println("Você é menor de idade: " + idade + " anos");
                    }
                    System.out.println("==========================\n");
                    System.out.println("Pressione Enter para continuar...");
                    leitor.nextLine();
                    break;

                case 5:
                    System.out.println("Saindo do sistema...\n");
                    break;

                default:
                    System.out.println("Opção inválida! Digite um número entre 1 e 5.\n");
            }

        } while (opcao != 5);
    }
}
