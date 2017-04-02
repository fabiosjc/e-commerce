<!DOCTYPE html>
<html ng-app="todoApp">
    <head>
        <meta charset="utf-8">
        <script src="./js/index.js" ></script>
    </head>
    <body>
        <h1>Welcome to Spring 4 and Servlet 3 Based Application!!!</h1>
        <div>
            <label>Name:</label>
            <input type="text" ng-model="yourName" placeholder="Enter a name here">
            <hr>
            <h1>Hello {{yourName}}!</h1>

            SOMA: {{ 1 + 2}}
        </div>

        <h2>Todo</h2>
        <div ng-controller="TodoListController as todoList">
          <span>{{todoList.remaining()}} of {{todoList.todos.length}} remaining</span>
          [ <a href="" ng-click="todoList.archive()">archive</a> ]
          <ul class="unstyled">
            <li ng-repeat="todo in todoList.todos">
              <label class="checkbox">
                <input type="checkbox" ng-model="todo.done">
                <span class="done-{{todo.done}}">{{todo.text}}</span>
              </label>
            </li>
          </ul>
          <form ng-submit="todoList.addTodo()">
            <input type="text" ng-model="todoList.todoText"  size="30"
                   placeholder="add new todo here">
            <input class="btn-primary" type="submit" value="add">
          </form>
        </div>
    </body>
</html>
