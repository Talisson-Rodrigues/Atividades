const ctx = document.getElementById('grafico1');
const ctx2 = document.getElementById('grafico2');
let labels = [];
let velocidade = [];

//recupere as informações do banco de dados
for (const [key,value] of dados) {
  labels.push(value[3]);
  velocidade.push(value[4]);
}//fim do FOR


//cria os gráficos de informações
  new Chart(ctx, {
    type: 'bar',
    data: {
      labels: labels,
      datasets: [{
        label: 'Velocidade Máxima',
        data: velocidade,
        borderWidth: 1
      }]
    },
    options: {
      scales: {
        y: {
            beginAtZero: true
        }
      }
    }
  });

  new Chart(ctx2, {
    type: 'line',
    data: {
      labels: ['Red', 'Blue', 'Yellow', 'Green', 'Purple', 'Orange'],
      datasets: [{
        label: '# of Votes',
        data: [12, 19, 3, 5, 2, 3],
        borderWidth: 1,
        backgroundColor: '#ff5733',
      }]
    },
    options: {
      scales: {
        y: {
          beginAtZero: true
        }
      }
    }
  });
  