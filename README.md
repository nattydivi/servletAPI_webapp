# ServletAPI_webapp

Web приложение с использованием servlet, filter, listener, JSTL, JSP, CSS
Приложение содержит фильтр - проверка аутентификации пользователя; без авторизации информация недоступна. 
Если пользователь неверно вводит данные, то происходит перенаправление на страницу с вводом логина и пароля.
Пользователь может завершить сессию.
<br>
Из-за использования фильтра, не было доступа к стилям без авторизации, проблему исправила добавлением в фильтр соответсвующей информации.
Также была проблема с кодировкой, через JSP сразу всё работало отлично (специально 2 языка оставила, чтобы видеть отображение в браузере).
Через сервлет кодировку тоже исправила.
Наглядно видна разница в использовании JSP и написания html-тегов через сам сервлет, также через JSP подключен CSS.  

Страницы:
<br>
/loginForm <br>
/booksJsp <br>

login: natty <br>
password: 111