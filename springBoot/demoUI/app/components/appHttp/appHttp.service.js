(function () {
    "use strict";
    angular.module('component.appHttp',[]).factory('appHttp', ['SharedConstant', '$http', function (SharedConstant, $http) {

        var baseUrl = SharedConstant.baseUrl.url ;

        var service = {};

        service.proxy = function (url) {
            return baseUrl + url
        }

        return service;
    }]);
})();