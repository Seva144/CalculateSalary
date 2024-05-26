<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
  <meta charset="UTF-8">
  <title>Рачет почасовой ставки</title>
</head>

<body>
  <h1><%= "Расчет почасовой оплаты" %></h1>
  <form action="${pageContext.request.contextPath}/calculate-salary" method="post">
    <br/>
      <label for="year"> Год : </label>
      <input type="number" name="year" id="year" value="${year}">
    <br/>
      <label for="month">Месяц : </label>
      <select id="month" name="month">
        <option value="JANUARY">Январь</option>
        <option value="FEBRUARY">Февраль</option>
        <option value="MARCH">Март</option>
        <option value="MAY">Май</option>
        <option value="JUNE">Июнь</option>
        <option value="JULY">Июль</option>
        <option value="AUGUST">Август</option>
        <option value="SEPTEMBER">Сентябрь</option>
        <option value="OCTOBER">Октябрь</option>
        <option value="NOVEMBER">Ноябрь</option>
        <option value="DECEMBER">Декабрь</option>
    </select>
    <br/>
      <label for="salary"> Зарплата : </label>
      <input  type="number" name="salary" id="salary" value="${salary}">
    <br/>
      <input type="submit" name="signup" value="Рассчитать" >
    <br/>
  </form>
</body>

</html>