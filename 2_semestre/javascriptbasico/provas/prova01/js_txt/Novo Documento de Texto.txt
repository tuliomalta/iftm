
document.addEventListener("DOMContentLoaded", () => {
    const imageElement = document.getElementById("emoji-image");
    const button1 = document.getElementById("button1");
    const button2 = document.getElementById("button2");
    const button3 = document.getElementById("button3");
    const button4 = document.getElementById("button4");
    const visitorNameInput = document.getElementById("visitor-name");
    const greetingElement = document.getElementById("greeting");

    const emojis = {
        emoji1: "img/emoji1.jpg",
        emoji2: "img/emoji2.jpg",
        emoji3: "img/emoji3.jpg",
        emoji4: "img/emoji4.jpg",
    };

    const updateGreeting = () => {
        const name = visitorNameInput.value.trim();
        if (name) {
            greetingElement.textContent = `Olá, ${name}`;
        }
    };

    if (button1) {
        button1.addEventListener("click", () => {
            imageElement.src = emojis.emoji1;
            imageElement.style.display = "block";
            updateGreeting();
        });
    }

    if (button2) {
        button2.addEventListener("mouseover", () => {
            imageElement.src = emojis.emoji2;
            imageElement.style.display = "block";
            updateGreeting();
        });
    }

    if (button3) {
        button3.addEventListener("mouseout", () => {
            imageElement.src = emojis.emoji3;
            imageElement.style.display = "block";
            updateGreeting();
        });
    }

    if (button4) {
        button4.addEventListener("click", () => {
            const randomEmoji = Object.values(emojis)[Math.floor(Math.random() * 4)];
            imageElement.src = randomEmoji;
            imageElement.style.display = "block";
            updateGreeting();
        });
    }

    const loginButton = document.getElementById("login-button");
    const clearButton = document.getElementById("clear-button");

    if (loginButton && clearButton) {
        const usernameInput = document.getElementById("username");
        const passwordInput = document.getElementById("password");

        loginButton.addEventListener("click", () => {
            const username = usernameInput.value.trim();
            const password = passwordInput.value.trim();

            if (!username || !password) {
                alert("Informe usuário e senha");
                return;
            }

            if (username.toLowerCase() === "visitante") {
                window.location.href = "visitante.html";
            } else {
                window.location.href = "construcao.html";
            }
        });

        clearButton.addEventListener("click", () => {
            usernameInput.value = "";
            passwordInput.value = "";
        });
    }
});
