(function () {
    "use strict";
    angular.module('auth.login').factory('loginService', ['SharedConstant', '$http', 'appHttp', function (SharedConstant, $http, appHttp) {
        var service = {};

        service.api = {
            login: login
        };

        service.helper = {

        };



        return service;

        function login() {
            return $http.get(appHttp.proxy('api/login'));
        }


    }]);
})();