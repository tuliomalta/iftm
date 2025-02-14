var jqueryScript = document.createElement('script');
jqueryScript.src = 'https://ajax.googleapis.com/ajax/libs/jquery/3.6.1/jquery.min.js';
jqueryScript.type = 'text/javascript';
document.getElementsByTagName('head')[0].appendChild(jqueryScript);

var alertStyle = document.createElement('link');
alertStyle.href = "css/cssPop.css";
alertStyle.rel = "stylesheet";
document.getElementsByTagName('head')[0].appendChild(alertStyle);

function closeCustomAlert(panel) {
    $(panel).slideUp(300, function () { $(panel).remove(); });
}

function showCountdownAlert($panel, timerCount) {
    $panel.children("div").children("p").text(timerCount);
    if (timerCount > 0) setTimeout(showCountdownAlert, 1000, $panel, --timerCount);
    else closeCustomAlert($panel);
}

function showCustomAlert(msgText, hasTimer, timerCount, imgSrc, fontSize, redirectUrl) {
    let $alertPanel = $(`<div></div>`).addClass("custom-alert");
    let $alertContent = $(`<div></div>`).addClass("custom-alert-content");
    $alertPanel.append($alertContent);

    if (imgSrc !== "") {
        let $alertImage = $("<img>").attr("src", imgSrc);
        $alertContent.append($alertImage);
    }
    let $alertText = hasTimer ? $("<p></p>").html(timerCount) : $("<p></p>").html(msgText);
    $alertText.css("font-size", `${fontSize}px`);
    $alertContent.append($alertText);

    if (!hasTimer) {
        var btn = document.createElement("button");
        btn.innerHTML = "Fechar";
        btn.setAttribute("class", "custom-button");
        if (redirectUrl !== "") btn.addEventListener("click", () => window.open(redirectUrl, "_self"));
        else btn.addEventListener("click", () => closeCustomAlert($alertPanel));
        $alertContent.append(btn);
    }

    $("body").append($alertPanel);
    $alertPanel.hide(0);
    $alertPanel.slideDown(500);

    if (hasTimer) showCountdownAlert($alertPanel, timerCount);
}
