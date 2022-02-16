'use strict';

// Register `phoneList` component, along with its associated controller and template
angular.
    module('auth.login').
    component('login', {
        templateUrl: 'auth/login/login.template.html',
        controller: ['$scope', 'loginService',
            function PhoneListController($scope, loginService) {
                $scope.abc = "abc";
                var vm = this;
                vm.vc = "vc";


                vm.login = login;

                function login() {
                    loginService.api.login().then(function(data){
                        console.log(data);
                    })
                }
            }
        ]
    });
