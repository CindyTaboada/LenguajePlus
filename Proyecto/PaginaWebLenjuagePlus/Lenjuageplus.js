document.getElementById('formularioSoporte').addEventListener('submit', function(e) {
    e.preventDefault();
    
    const nombre = document.getElementById('nombre').value;
    const numero = document.getElementById('numero').value;
    const email = document.getElementById('email').value;
    const problema = document.getElementById('problema').value;

    const respuestaFormulario = document.getElementById('respuestaFormulario');


    respuestaFormulario.innerHTML = `Gracias, ${nombre}. Su problema ha sido enviado. Nos pondremos en contacto con usted en ${email} pronto.`;

  
    document.getElementById('formularioSoporte').reset();
});

document.getElementById('descargarBtn').addEventListener('click', function() {
    alert('Iniciando descarga...');
   
});
