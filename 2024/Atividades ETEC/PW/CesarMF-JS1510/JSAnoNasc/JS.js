function displayWelcomeMessage() {
    var ano = prompt("Por favor, insira seu ano de nascimento:");
    const welcomeMessage =
    document.getElementById("welcome-message");
    var idade = 2024 - ano;
    var idade2 = idade - 1;
    if (ano) {
    welcomeMessage.textContent = `Você tem ${idade2} ou ${idade} anos de idade.`;
    } else {
    welcomeMessage.textContent = `Erro: seu ano de idade não foi inserido de maneira própria`;
    }
    } window.onload = displayWelcomeMessage;