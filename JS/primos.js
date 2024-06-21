function verificarPrimos() {
    const primo1 = parseInt(document.getElementById("primo1").value);
    const primo2 = parseInt(document.getElementById("primo2").value);
    const resultado = document.getElementById("resultado");

    if (isNaN(primo1) || isNaN(primo2) || primo1 > primo2) {
        resultado.innerHTML = "Por favor, insira um intervalo válido.";
        return;
    }

    let primos = [];

    for (let num = primo1; num <= primo2; num++) {
        if (num > 1) {
            let isPrime = true;
            for (let i = 2; i * i <= num; i++) {
                if (num % i === 0) {
                    isPrime = false;
                    break
                }
            }
            if (isPrime) {
                primos.push(num);
            }
        }
    }

    resultado.innerHTML = primos.length > 0 ? `Números primos no intervalo de ${primo1} a ${primo2}: ${primos.join(', ')}` : `Não há números primos no intervalo de ${primo1} a ${primo2}.`;
}