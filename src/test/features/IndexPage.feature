Feature: Главная страница
  Scenario: Успешное открытие главное страницы сайта
    When Я открываею главную страницу "http://localhost:8080"
    Then Я вижу страницу с заголовком "ChessMatch"