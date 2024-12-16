document.addEventListener('DOMContentLoaded', function() {
    function getRandomTime() {
        return Math.floor(Math.random() * 6) + 5;
    }

    const loadingMessage = document.getElementById('loading-message');
    let timeLeft = getRandomTime();

    function updateMessage() {
        const timeText = timeLeft <= 3 ? `<span style="color: red;">${timeLeft}</span>` : timeLeft;
        loadingMessage.innerHTML = `Processando. Aguarde ${timeText} segundos`;

        if (timeLeft === 0) {
            window.location.href = 'verveiculo.html';
        } else {
            timeLeft--;
            setTimeout(updateMessage, 1000);
        }
    }

    updateMessage();
});