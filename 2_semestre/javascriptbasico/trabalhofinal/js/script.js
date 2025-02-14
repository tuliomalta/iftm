window.addEventListener("DOMContentLoaded", () => {
    const timerDisplay = document.querySelector(".timer-value");
    const numberDisplay = document.querySelector(".main-number");
    const hitsDisplay = document.querySelector("#hits");
    const mistakesDisplay = document.querySelector("#mistakes");
    const evenNumbersDisplay = document.querySelector("#evenNumbers");
  
    let remainingTime = 0;
    let numberChangeInterval = 0;
    let timerIntervalId = null;
    let numberIntervalId = null;
    let hitCount = 0;
    let errorCount = 0;
    let evenCount = 0;
  
    const formatTime = (timeInSeconds) => {
      const minutes = Math.floor(timeInSeconds / 60);
      const seconds = timeInSeconds % 60;
      return `${String(minutes).padStart(2, "0")}:${String(seconds).padStart(2, "0")}`;
    };
  
    const initializeDifficulty = () => {
      const difficultySelect = document.querySelector("#difficulty");
      if (difficultySelect.value === "0") {
        remainingTime = 0;
        numberChangeInterval = 0;
      } else if (difficultySelect.value === "1") {
        remainingTime = 105;
        numberChangeInterval = 1000;
      } else if (difficultySelect.value === "2") {
        remainingTime = 75;
        numberChangeInterval = 500;
      } else {
        remainingTime = 30;
        numberChangeInterval = 300;
      }
      timerDisplay.textContent = formatTime(remainingTime);
      difficultySelect.addEventListener("change", () => {
        if (difficultySelect.value === "0") {
          remainingTime = 0;
          numberChangeInterval = 0;
        } else if (difficultySelect.value === "1") {
          remainingTime = 105;
          numberChangeInterval = 1000;
        } else if (difficultySelect.value === "2") {
          remainingTime = 75;
          numberChangeInterval = 500;
        } else {
          remainingTime = 30;
          numberChangeInterval = 300;
        }
        timerDisplay.textContent = formatTime(remainingTime);
        clearInterval(timerIntervalId);
        clearInterval(numberIntervalId);
        timerIntervalId = null;
        numberIntervalId = null;
      });
    };
  
    const updateStats = () => {
      const totalAttempts = hitCount + errorCount;
      const percentage = totalAttempts > 0 ? (hitCount / totalAttempts) * 100 : 0;
      hitsDisplay.textContent = `${hitCount} (${percentage.toFixed(2)}%)`;
      mistakesDisplay.textContent = errorCount;
      evenNumbersDisplay.textContent = evenCount;
    };
  
    const generateRandomNumber = () => Math.floor(Math.random() * 101);
  
    const startNumberShuffle = () => {
      if (numberIntervalId) clearInterval(numberIntervalId);
      let currentNumber = generateRandomNumber();
      numberDisplay.textContent = currentNumber;
      numberDisplay.onclick = () => {
        if (currentNumber % 2 === 0) {
          hitCount++;
          evenCount++;
          numberDisplay.style.color = "green";
        } else {
          errorCount++;
          numberDisplay.style.color = "red";
        }
        updateStats();
        setTimeout(() => {
          numberDisplay.style.color = "";
        }, 500);
      };
      numberIntervalId = setInterval(() => {
        currentNumber = generateRandomNumber();
        numberDisplay.textContent = currentNumber;
        if (currentNumber % 2 === 0) evenCount++;
        updateStats();
      }, numberChangeInterval);
    };
  
    const setupControlButtons = () => {
      const startBtn = document.querySelector("#btnStart");
      const pauseBtn = document.querySelector("#btnPause");
      const stopBtn = document.querySelector("#btnStop");
  
      const refreshTimerDisplay = () => {
        timerDisplay.textContent = formatTime(remainingTime);
      };
  
      startBtn.onclick = () => {
        const difficultySelect = document.querySelector("#difficulty");
        if (difficultySelect.value === "0") {
          alert("Por favor, selecione um nível de dificuldade antes de iniciar.");
          return;
        }
        if (!timerIntervalId && remainingTime > 0) {
          timerIntervalId = setInterval(() => {
            remainingTime--;
            if (remainingTime <= 0) {
              clearInterval(timerIntervalId);
              clearInterval(numberIntervalId);
              alert("Tempo esgotado!");
            }
            refreshTimerDisplay();
          }, 1000);
          startNumberShuffle();
        }
      };
  
      pauseBtn.onclick = () => {
        clearInterval(timerIntervalId);
        clearInterval(numberIntervalId);
        timerIntervalId = null;
        numberIntervalId = null;
      };
  
      stopBtn.onclick = () => {
        clearInterval(timerIntervalId);
        clearInterval(numberIntervalId);
        timerIntervalId = null;
        numberIntervalId = null;
        remainingTime = 0;
        hitCount = 0;
        errorCount = 0;
        evenCount = 0;
        refreshTimerDisplay();
        updateStats();
        numberDisplay.textContent = "-";
        numberDisplay.style.color = "";
        const difficultySelect = document.querySelector("#difficulty");
        difficultySelect.value = "0";
        numberDisplay.onclick = () => {
          alert("Selecione primeiro um nível de dificuldade.");
        };
      };
    };
  
    numberDisplay.onclick = () => {
      alert("Selecione primeiro um nível de dificuldade.");
    };
  
    initializeDifficulty();
    setupControlButtons();
  });
  