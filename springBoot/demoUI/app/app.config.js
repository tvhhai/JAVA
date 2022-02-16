'use strict';

angular.
  module('myApp').
  config(['$routeProvider',
    function config($routeProvider) {
      $routeProvider.
        when('/', {
          template: '<login></login>'
        }).
        when('/login', {
          template: '<login></login>'
        }).
        otherwise('/phones');
    }
  ]);
