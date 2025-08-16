# TrafficAnalyzer

**TrafficAnalyzer** é um sistema para análise e monitoramento de tráfego urbano. Ele processa eventos de sensores de trânsito, gera relatórios de fluxo e permite decisões baseadas em dados em tempo real.

---

## 🔹 Funcionalidades

- Coleta de dados de sensores de tráfego (TrafficEvents).  
- Processamento de eventos em tempo real.  
- Geração de métricas e relatórios de fluxo de veículos.  
- Visualização de estatísticas de tráfego (futuro módulo UI/relatórios).  
- Possível integração com sistemas de semáforos inteligentes.

---

## 🔹 Tecnologias

- **Java 21+** – Linguagem principal do projeto.  
- **Quarkus** – Framework para microserviços reativos.  
- **Reactive Panache / MongoDB** – Persistência reativa de dados.  
- **Maven** – Gerenciamento de dependências e build.  
- **JUnit + Mockito** – Testes unitários e mocks.

---

## 🔹 Arquitetura

O projeto segue conceitos de **DDD** e **Clean Architecture**, com camadas bem definidas:

- **Domain**: Entidades, Value Objects, regras de negócio.  
- **Application / Service**: Casos de uso e coordenação de eventos.  
- **Infrastructure / Repository**: Persistência e integração externa (sensores, APIs).  
- **API / Controller**: Endpoints REST para interação com o sistema.

---

## 🔹 Como Executar

1. Clone o repositório:

```bash
git clone https://github.com/seu-usuario/TrafficAnalyzer.git
cd TrafficAnalyzer
```
2.Build do projeto com Maven:
```bash
mvn clean install
```
3.Executar a aplicação:
```bash
mvn quarkus:dev
```
