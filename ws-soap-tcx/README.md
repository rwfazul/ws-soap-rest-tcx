# ws_soap_tcx

Neste projeto é realizado o parser de um arquivo XML no padrão Training Center XML ([TCX](https://en.wikipedia.org/wiki/Training_Center_XML)) e criado um Web Service [SOAP](https://en.wikipedia.org/wiki/SOAP) para disponibilizar as seguintes operações:

- hora_inicio;
- duração em hora/min/segundos;
- total distância em metros;
- obter todos os Lap;
- total de Lap;
- distância percorrida por Lap;
- duração por Lap;
- obter todas as Tracks de um Lap.

Para o mapeamento, foi criado o modelo de classes correspondente ao arquivo [rota1.tcx](../rota1.tcx) e [rota2.tcx](../rota2.tcx), de modo que seja possível realizar o Marshal e UnMarshal utilizando [JAXB](https://en.wikipedia.org/wiki/Java_Architecture_for_XML_Binding).

* Lembre-se de alterar o caminho do arquivo TCX em parser.ParserTCX de acordo com seu ambiente.

## Jax-ws + Tomcat/Glassfish com Maven

- pom.xml
	- Libs (dependencies):
		- jaxws-rt;
		- jaxb-core;
		- jaxb-impl;
		- streambuffer;
		- policy;
		- gmbal-api-only;
		- jsr181-api;
		- jaxws-api;
		- ha-api;
		- stax-ex.
		

