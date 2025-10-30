function displayWelcomeMessage() {
    var num = prompt("Por favor, insira seu número:");
    const welcomeMessage =
    document.getElementById("welcome-message");
    if (num%2 == 0) {
    welcomeMessage.textContent = `O seu número é par.`;
    } else {
    welcomeMessage.textContent = `O seu número é impar.`;
    }
    } window.onload = displayWelcomeMessage;