var personalSpaceLogin = angular.module('personal.space.login',[
        'loginDirective'
    ])

personalSpaceLogin.controller("loginController",[
    '$scope',
    function ($scope) {
        'use strict';

        $scope.login = {
            a:123,
            b:321
        }



    }
])