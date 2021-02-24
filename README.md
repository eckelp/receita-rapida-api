# receita-rapida-api
Projeto de simulação de emissão e retenção de receitas médicas

## Tecnologias utilizadas: 
- Java
- Spring Boot
- Spring Kafka
- Apache Kafka / Apache  Zookeeper


## Módulos

- service-gerenciador-receita
  - Servidot HTTP de entrada. Contém os endpoints para produzir as mensagens para os tópicos NOVA_RECEITA e RETENCAO_RECEITA
  
- service-notificacao-anvisa
  - Serviço utilizado para consumir uma mensagem do tópico RETENCAO_RECEITA

- service-nova-receita
  - Serviço utilizado para consumir uma mensagem do tópico NOVA_RECEITA
