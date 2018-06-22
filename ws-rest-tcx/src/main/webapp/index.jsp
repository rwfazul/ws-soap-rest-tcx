<!DOCTYPE html>
<html>
    <head>
        <title>Home</title>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <style>
            h1, h2 {
                font-size: 1.2em;
            }
                
            a {
                text-decoration: none;
            }
            
            .wrapper {
                width: 30%;
                text-align: center;
                margin: 5% auto 0 auto;
            }
            
            .btn-link {
                display: block;
                font-weight: 400;
                text-align: center;
                white-space: nowrap;
                vertical-align: middle;
                border: 1px solid transparent;
                padding: .375rem .75rem;
                font-size: 1rem;
                line-height: 1.5;
                border-radius: .25rem;
                margin-bottom: 10px;
                color: #fff;
                background-color: #007bff;
                border-color: #007bff;
            }
            
            .btn-link:hover, .btn-link:focus {
                color: #333333;
            }
            
            .right {
                float: right;
            }
        </style>
    </head>
    <body>
        <div class="wrapper">
            <h1>POO WEB II</h1>
            <h2>Autores: Isabella Sakis e Rhauani Fazul</h2>
            <p>{ isasakis, rwfazul }@inf.ufsm.br</p>
            <p>
                <a href="rota/horainicio" class="btn-link">Hora início</a> 
                <a href="rota/duracao" class="btn-link">Duração em hora/min/segundos</a>
                <a href="rota/distancia" class="btn-link">Distância total em metros</a>
                <a href="rota/laps" class="btn-link">Lista de todos os Laps</a>
                <a href="rota/quantidadelaps" class="btn-link">Quantidade total de Laps</a>
                <a href="rota/distanciaporlap" class="btn-link">Distância percorrida por Lap</a>
                <a href="rota/duracaoporlap" class="btn-link">Duração por Lap</a>
                <a href="rota/tracksporlap" class="btn-link">Todas as Tracks de um Lap</a>
                <a href="rota/unmarshal" class="btn-link">Realizar UnMarshal</a>
            </p>
            
            <p class="right">2018/1</p>
        </div>
        <div class="wrapper">
            <p>* Lembre-se de alterar o caminho do arquivo TCX em parser.ParserTCX de acordo com seu ambiente.</p>
        </div>
    </body>
</html>