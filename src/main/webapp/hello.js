var app = angular.module("myApp", [])
.controller('Hello', function($scope, $http) {
     $http.get('http://localhost:8080/bookcase/books').
             then(function(response) {
                 $scope.books = response.data;
             })
     });