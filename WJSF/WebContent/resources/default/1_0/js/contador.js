// Contador de visitas falso
var ran;
ran = Math.round(Math.random()*50000);
document.write("<h3>Você é o visitante " + ran + " desta página.<h3>");

function imprimir() {
	window.print();
}